package com.springboot.jenkins.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsExampleApplication {
	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsExampleApplication.class);

	@PostConstruct
	public void init() {
		logger.info("Application Started");
	}

	public static void main(String[] args) {
		System.out.println("Test");
		SpringApplication.run(SpringBootJenkinsExampleApplication.class, args);
	}

}
