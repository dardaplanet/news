package com.news.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.news.dao.UsersDao;

import coms.news.bean.Users;

public class UsersDaoImpl implements UsersDao{
	/**
	 * 用户注册
	 */
	@Override
	public int registerUser(Users users, Connection conn) throws SQLException {
		String sql = "insert into users"
				+ "(users_id,users_name,users_pwd,full_name,question,answer,users_sex,users_birthday,users_email,logins,first_login,last_login,users_cell,users_addr,verify,forbidden) "
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, users.getUsersId());
		ps.setString(2, users.getUsersName());
		ps.setString(3, users.getUsersPwd());
		ps.setString(4, users.getFullName());
		ps.setString(5, users.getQuestion());
		ps.setString(6, users.getAnswer());
		ps.setInt(7, users.getUsersSex());
		ps.setDate(8, new java.sql.Date(users.getUsersBirthday().getTime()));
		ps.setString(9, users.getUsersEmail());
		ps.setInt(10, users.getLogins());
		ps.setDate(11, new java.sql.Date(users.getFirstLogin().getTime()));
		ps.setDate(12, new java.sql.Date(users.getLastLogin().getTime()));
		ps.setString(13, users.getUsersCell());
		ps.setString(14, users.getUsersAddr());
		ps.setInt(15, users.getVerify());
		ps.setInt(16, users.getForbidden());
		int num = ps.executeUpdate();
		return num;
	}

}
