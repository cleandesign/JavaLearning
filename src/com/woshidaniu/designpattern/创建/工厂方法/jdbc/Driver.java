package com.woshidaniu.designpattern.创建.工厂方法.jdbc;

import java.sql.DriverPropertyInfo;
import java.sql.SQLException;

/**
 * Created by kang on 2018/7/6.
 */
public interface Driver {

    Connection connect(String url, java.util.Properties info)
            throws SQLException;

    boolean acceptsURL(String url) throws SQLException;

    DriverPropertyInfo[] getPropertyInfo(String url, java.util.Properties info)
            throws SQLException;

    int getMajorVersion();

    int getMinorVersion();

    boolean jdbcCompliant();
}