package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

/*
import zipkin.server.EnableZipkinServer;
*/
/*import zipkin.server.EnableZipkinServer;
*/
@SpringBootApplication
@EnableZipkinServer
public class TestZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestZipkinApplication.class, args);
	}

}
