package com.boa.SpringBootIn28Minutes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringBootIn28MinutesApplication implements CommandLineRunner {

	@Value(value = "${XXXX}")
	String x;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootIn28MinutesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("XXXX"+x);
	}

}
