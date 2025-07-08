package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
	    "com.example.controller",
	    "com.example.repository",
	    "com.example.model"
	})
public class TrimbleCarBridgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrimbleCarBridgeApplication.class, args);
	}

}
