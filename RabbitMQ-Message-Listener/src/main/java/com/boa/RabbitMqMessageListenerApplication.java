package com.boa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMqMessageListenerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqMessageListenerApplication.class, args);
	}

}
