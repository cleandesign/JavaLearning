package com.woshidaniu.designpattern.结构.代理.静态代理;

import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by kang on 2018/7/5.
 */
//extends Wrapper
public interface Connection  {

    Statement createStatement() throws SQLException;

    void close() throws SQLException;

}
