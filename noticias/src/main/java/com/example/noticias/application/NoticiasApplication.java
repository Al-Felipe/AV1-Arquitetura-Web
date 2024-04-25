package com.example.noticias.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableMongoRepositories("com.example.noticias.repository")
public class NoticiasApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoticiasApplication.class, args);
	}

}
