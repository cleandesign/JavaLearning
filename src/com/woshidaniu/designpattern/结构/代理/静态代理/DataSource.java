package com.woshidaniu.designpattern.结构.代理.静态代理;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 * Created by kang on 2018/7/5.
 */
public class DataSource {

    private static LinkedList<Connection> connectionList = new LinkedList<Connection>();

    String url ="1";
    String username ="2";
    String password ="3";
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Connection createNewConnection() throws SQLException {
        return (Connection) DriverManager.getConnection("url","username", "password");
    }

    private DataSource(){
        if (connectionList == null || connectionList.size() == 0) {
            for (int i = 0; i < 10; i++) {
                try {
                    connectionList.add(createNewConnection());
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Connection getConnection() throws Exception{
        if (connectionList.size() > 0) {
            //return connectionList.remove();  这是原有的方式，直接返回连接，这样可能会被程序员把连接给关闭掉
            //下面是使用代理的方式，程序员再调用close时，就会归还到连接池
            return new ConnectionProxy(connectionList.remove());
        }
        return null;
    }

    public void recoveryConnection(Connection connection){
        connectionList.add(connection);
    }

    public static DataSource getInstance(){
        return DataSourceInstance.dataSource;
    }

    private static class DataSourceInstance{

        private static DataSource dataSource = new DataSource();

    }

}