package com.boa.SpringBootIn28Minutes.bean;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Users {
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Users [users=" + users + "]";
	}

}
