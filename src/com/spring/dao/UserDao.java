package com.spring.dao;

import com.spring.entity.User;

public interface UserDao {
	public User findUserByName(String name);
}
