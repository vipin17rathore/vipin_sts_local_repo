package com.boa.SpringEurekaClient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.SpringEurekaClient.bean.Employee;

@RestController
public class Controller {
	@Autowired 
	FeignClientInterface feignData;
	
	@RequestMapping("/testGetData")
	public Employee testGetData() {
		return feignData.getDataFromServiceUsingFeign();
	}
}
