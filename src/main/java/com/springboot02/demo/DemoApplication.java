package com.springboot02.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@RequestMapping("/hello")
	public String hello() {
		return "hello world . . ";
	}

	@RequestMapping("/hello2")
	public String hello2() {
		return "hello world . . ";
	}
	
	
	
	@RequestMapping("/test")
	public String test() {
		return "this is test msg . . ";
	}
	
	
	
}
