package com.example.springjenkinsdockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringJenkinsDockerDemoApplication {

	@GetMapping("/hello")
	public String hello() {
		return "Hello Docker";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsDockerDemoApplication.class, args);
	}

}
