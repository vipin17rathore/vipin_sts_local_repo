package com.boa.ConfigServerIn28Minutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerIn28MinutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerIn28MinutesApplication.class, args);
	}

}
