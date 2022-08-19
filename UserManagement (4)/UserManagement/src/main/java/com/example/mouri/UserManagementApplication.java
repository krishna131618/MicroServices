package com.example.mouri;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EntityScan("com.example.mouri.*")
@EnableJpaRepositories("com.example.mouri.*")
@ComponentScan({"com.example.mouri.common.services.*","com.example.mouri.*"})
public class UserManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();

	}
//
//	@Bean
//	// @LoadBalanced
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}

}
