package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloWorldRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldRestApplication.class, args);
	}
}

@RestController
class HelloRestController {
	
	@RequestMapping("/greeting")
	public String helloWorld() {
		return "Hello World";
	}
	
}
