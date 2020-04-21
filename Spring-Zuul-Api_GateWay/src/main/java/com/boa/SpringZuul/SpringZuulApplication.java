package com.boa.SpringZuul;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import brave.sampler.Sampler;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient

public class SpringZuulApplication {

	public static void main(String[] args) {
		System.out.println("Spring zuul main");
		SpringApplication.run(SpringZuulApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	} // for zipkin distributed system

}
