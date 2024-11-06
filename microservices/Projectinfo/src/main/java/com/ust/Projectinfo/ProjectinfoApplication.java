package com.ust.Projectinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class ProjectinfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectinfoApplication.class, args);
	}

}
