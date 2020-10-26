package com.schoolify.authentication.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
public class SchoolifyAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolifyAuthServerApplication.class, args);
	}

}
