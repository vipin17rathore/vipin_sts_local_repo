package com.boa.SpringEurekaClient.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.boa.SpringEurekaClient.bean.Employee;

/*
@FeignClient(name="Practice",url="http://localhost:9090/")*/
@FeignClient(name="Practice")
@RibbonClient(name="Practice")
public interface FeignClientInterface {
	@GetMapping("/getEmpData")
	public Employee getDataFromServiceUsingFeign();
}
