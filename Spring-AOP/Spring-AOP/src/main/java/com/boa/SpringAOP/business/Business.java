package com.boa.SpringAOP.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boa.SpringAOP.business.dao.DAO;

@Service
public class Business {

	@Autowired
	DAO dao;

	public String getResponse() {
		System.out.println(dao.getResponse());
		return dao.getResponse();
	}
}
