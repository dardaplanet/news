package com.news.service;

import java.sql.Connection;

import coms.news.bean.Users;

public interface UserService {
	int registerUser(Users users,Connection conn) throws Exception;//用户注册
}
