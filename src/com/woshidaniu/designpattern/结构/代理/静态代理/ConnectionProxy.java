package com.woshidaniu.designpattern.结构.代理.静态代理;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by kang on 2018/7/5.
 */
//使用静态代理，采用静态代理我们通常会使用组合的方式，为了保持对程序猿是透明的，我们实现Connection这个接口
public class ConnectionProxy implements Connection{

    private Connection connection;

    public ConnectionProxy(Connection connection) {
        super();
        this.connection = connection;
    }



    @Override
    public Statement createStatement() throws SQLException {
        return connection.createStatement();
    }

    @Override
    public void close() throws SQLException {
        System.out.println("不真正关闭连接，归还给连接池");
        DataSource.getInstance().recoveryConnection(connection);
    }
}
