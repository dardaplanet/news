package com.news.util;

import java.sql.Connection;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 *获取数据库连接
 */
public class JDBCUtil {
	private static ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

	public static Connection getConnection() throws SQLException {
		Connection conn = comboPooledDataSource.getConnection();

		return conn;

	}
}
