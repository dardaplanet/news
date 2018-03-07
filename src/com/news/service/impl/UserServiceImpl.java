package com.news.service.impl;

import java.net.ConnectException;
import java.sql.Connection;

import com.news.dao.UsersDao;
import com.news.dao.impl.UsersDaoImpl;
import com.news.service.UserService;

import coms.news.bean.Users;

public class UserServiceImpl implements UserService {
	private UsersDao userDao = new UsersDaoImpl();
	/*private PreparedStatement ps = null;
	private ResultSet rs = null;*/
	/**
	 * 普通用户注册
	 */
	@Override
	public int registerUser(Users users, Connection conn) throws Exception {
		if(users == null) {
			throw new NullPointerException("用户信息为空!");
		}
		if(conn == null) {
			try {
				throw new ConnectException("数据库连接失败!");
			} catch (ConnectException e) {
				e.printStackTrace();
			}
		}
		
		return userDao.registerUser(users, conn);
	}

}
