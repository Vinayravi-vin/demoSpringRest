package com.exampleSpringboot.demoSpringRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan({"com.example.controller","com.example.service"})
public class DemoSpringRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringRestApplication.class, args);
	}

}
