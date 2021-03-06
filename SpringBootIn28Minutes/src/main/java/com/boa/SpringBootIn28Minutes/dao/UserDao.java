package com.boa.SpringBootIn28Minutes.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties.Tomcat.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.boa.SpringBootIn28Minutes.bean.User;
import com.boa.SpringBootIn28Minutes.bean.Users;

@Component
public class UserDao {

	public static List<User> Users = new ArrayList<User>();
	public static int userCount = 3;

	public UserDao() {

	}

	static {
		User user = new User();
		user.setId(1);
		user.setMobNo("one two");
		user.setName("Ram");
		Users.add(user);

		User user1 = new User();
		user1.setId(2);
		user1.setMobNo("three");
		user1.setName("Ram..12");
		Users.add(user1);

		User user2 = new User();
		user2.setId(3);
		user2.setMobNo("four");
		user2.setName("Ram..12345");
		Users.add(user2);
	}

	public Users getUsers() {
		Users users1 = new Users();
		users1.setUsers(Users);
		return users1;
	}

	public User getUser(int id) {
		for (User user : Users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return new User();
	}

	public String addUser(User user) {

		if (user.getId() == -1) {
			user.setId(++userCount);
			Users.add(user);
			System.out.println("user::" + user);
			return "user added..!!";
		}

		else {
			for (User usr : Users) {
				if (user.getId() == usr.getId()) {
					return "already-exist";
				}
			}
		}

		Users.add(user);
		return "user added";
	}

	public User modifyUser(User user) throws Exception {

		if (user.getId() == -1) {
			throw new Exception("User can not modify");
		}

		else {
			for (User usr : Users) {
				if (user.getId() == usr.getId()) {
					Users.remove(usr);
					Users.add(user);
					return getUser(user.getId());
				}
			}
		}

		throw new Exception("User can not modify");
	}

	public String removeUser(int id) {

		for (User usr : Users) {
			if (id == usr.getId()) {
				Users.remove(usr);
				return "User deleted";
			}
		}

		return "User Not Found";
	}
}
