package com.gomathy.rest.webservices.restfullwebservicescenter;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
@org.springframework.cloud.config.server.EnableConfigServer
@SpringBootApplication
public class RestfullWebservicesCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfullWebservicesCenterApplication.class, args);
	}

}
