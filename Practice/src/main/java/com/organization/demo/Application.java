package com.organization.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.organization.demo.org.Config;
import com.organization.demo.org.Employee;

import brave.sampler.Sampler;

@SpringBootApplication
/* @ComponentScan("sample") */
@ComponentScan("com.organization.demo")
@EnableDiscoveryClient
/* @EnableJpaRepositories(basePackages="sample") */
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}  // for zipkin distributed system
	
	@EventListener(ApplicationReadyEvent.class)
	public void empObj() 
	{
		Config.listEmployee.add(getOBJECT(1,"ABC","ASE"));
		Config.listEmployee.add(getOBJECT(2,"ABCD","B"));
		Config.listEmployee.add(getOBJECT(3,"ABCE","C"));
		
	}

	private Employee getOBJECT(int a , String b, String c) {
		Config.employee=new Employee();
		Config.employee.setDesignation(c);
		Config.employee.setId(a);
		Config.employee.setName(b);
		return Config.employee;
	}
}
