package com.woshidaniu.designpattern.创建.工厂方法.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Wrapper;

/**
 * Created by kang on 2018/7/6.
 */
public interface Connection  extends Wrapper {

    Statement createStatement() throws SQLException;

    PreparedStatement prepareStatement(String sql) throws SQLException;

}