package com.example.springbootjenkinsdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class SpringbootJenkinsDemoApplication {

	public static Logger logger= LoggerFactory.getLogger(SpringbootJenkinsDemoApplication.class);

	public void init(){
		logger.info("application started....");
	}
	public static void main(String[] args) {
		logger.info("application executed..................1");
		logger.info("application executed..................2");
		SpringApplication.run(SpringbootJenkinsDemoApplication.class, args);
	}

}
