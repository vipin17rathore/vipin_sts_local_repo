package com.boa.SpringBootIn28Minutes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.boa.SpringBootIn28Minutes.bean.User;
import com.boa.SpringBootIn28Minutes.bean.Users;
import com.boa.SpringBootIn28Minutes.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;

	public Users getUsers() {
		return userDao.getUsers();
	}

	public User getUser(int id) {
		return userDao.getUser(id);
	}

	public String addUser(User user) {
		return userDao.addUser(user);
	}

	public User modifyUser(User user) throws Exception {
		return userDao.modifyUser(user);
	}

	public String removeUser(int id) {
		return userDao.removeUser(id);
	}
}
