package com.ust.Employeeinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableFeignClients
@EnableMongoRepositories
public class EmployeeinfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeinfoApplication.class, args);
	}

}
