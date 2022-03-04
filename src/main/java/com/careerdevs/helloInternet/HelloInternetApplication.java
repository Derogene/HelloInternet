package com.careerdevs.helloInternet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloInternetApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloInternetApplication.class, args);
	}

}
