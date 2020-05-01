package com.boa;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.MessageListenerContainer;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

	private static final String MY_QUEUE = "testQueue";

	@Bean
	Queue getQueue() {
		return new Queue(MY_QUEUE, true);

	}

	@Bean
	ConnectionFactory connectionFactory() {
		CachingConnectionFactory factory = new CachingConnectionFactory("localhost");
		factory.setUsername("guest");
		factory.setPassword("guest");
		return factory;

	}

	@Bean
	MessageListenerContainer messageListenerContainer() {
		SimpleMessageListenerContainer messageListenerContainer = new SimpleMessageListenerContainer();
		messageListenerContainer.setConnectionFactory(connectionFactory());
	//	messageListenerContainer.setQueues(getQueue());
		messageListenerContainer.setQueueNames("SecondQueue","testQueue");
		messageListenerContainer.setMessageListener(new MessageListenerRq());
		return messageListenerContainer;

	}
}
