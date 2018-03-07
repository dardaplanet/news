package com.news.dao;

import java.sql.Connection;
import java.sql.SQLException;

import coms.news.bean.Users;

public interface UsersDao {
	
	int registerUser(Users users,Connection conn) throws SQLException;//用户注册
}
