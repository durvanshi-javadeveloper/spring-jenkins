package com;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAppMavenDockerApplication {

	static Logger logger = LoggerFactory.getLogger(SpringAppMavenDockerApplication.class);
	@PostConstruct
	public void init(){
		logger.info("Application Started...");
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringAppMavenDockerApplication.class, args);
	}

}
