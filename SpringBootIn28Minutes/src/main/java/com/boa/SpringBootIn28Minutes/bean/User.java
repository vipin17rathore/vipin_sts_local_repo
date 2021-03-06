package com.boa.SpringBootIn28Minutes.bean;

import javax.validation.Valid;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private int id=-1;
	@Size(min=3,max=19)
	private String name;
	@Size(min=10,max=10)
	private String mobNo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobNo=" + mobNo + "]";
	}

}
