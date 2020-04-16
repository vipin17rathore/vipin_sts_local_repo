package com.boa.SpringBootIn28Minutes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.boa.SpringBootIn28Minutes.bean.User;
import com.boa.SpringBootIn28Minutes.bean.Users;
import com.boa.SpringBootIn28Minutes.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	/*
	 * @Autowired RestTemplate restTemp;
	 */
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
