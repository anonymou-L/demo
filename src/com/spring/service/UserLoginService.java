package com.spring.service;

import com.spring.dao.UserDao;
import com.spring.entity.User;

public class UserLoginService {
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public User login(String name,String password){
		try{
			User user = userDao.findUserByName(name);
			if(user.getPassword().equals(password)){
				return user;
			}
			return null;
		}catch(Exception e){
			e.printStackTrace();
			return null;
			
		}
		
	}
}
