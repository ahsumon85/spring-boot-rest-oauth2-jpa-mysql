package com.ahasan.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 *
 * @author Ahasan Habib
 * @since 03 06 20
 */

@SpringBootApplication
public class ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationRunner.class, args);
		System.out.println("Spring Boot secure rest running.......");
	}

}
