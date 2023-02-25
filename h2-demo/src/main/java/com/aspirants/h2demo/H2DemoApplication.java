package com.aspirants.h2demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigServer
public class H2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2DemoApplication.class, args);
	}

}
