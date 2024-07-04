package com.example.forecast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class ForeCastProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForeCastProjectApplication.class, args);
	}

}
