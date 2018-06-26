package com.example.eurakademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurakaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurakaDemoApplication.class, args);
	}
}
