package com.example.mouri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServicerRegistoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicerRegistoryApplication.class, args);
	}

}
