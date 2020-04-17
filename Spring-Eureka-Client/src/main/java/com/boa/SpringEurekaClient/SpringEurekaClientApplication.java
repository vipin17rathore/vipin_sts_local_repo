package com.boa.SpringEurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient*/
@SpringBootApplication
@EnableFeignClients("com.boa.SpringEurekaClient")
public class SpringEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaClientApplication.class, args);
	}

}
