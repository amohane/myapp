package com.example.myapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyappApplication {
	
	@Value("${app.msg}")
	private String msg;
	
	@GetMapping("/")
	public String getMessage() {
		return msg;
	}
	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}

}
