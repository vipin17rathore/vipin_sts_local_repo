package com.boa;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitMqMessagingApplication implements CommandLineRunner {

	@Autowired
	RabbitTemplate rabbitTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(RabbitMqMessagingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		rabbitTemplate.convertAndSend("testExchange", "testRoutingKey", "Test Rabbit Message");
		System.out.println("run method");
	}

}
