package com.it.sportsplus.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.it")
@EnableJpaRepositories(basePackages = "com.it")
@EntityScan("com.it")  
public class SportsplusApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SportsplusApplication.class);
	}
	
	
}
