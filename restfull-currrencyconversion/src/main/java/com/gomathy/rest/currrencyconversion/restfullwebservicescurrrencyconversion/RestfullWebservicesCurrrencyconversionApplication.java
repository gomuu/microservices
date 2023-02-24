package com.gomathy.rest.currrencyconversion.restfullwebservicescurrrencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestfullWebservicesCurrrencyconversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfullWebservicesCurrrencyconversionApplication.class, args);
	}

}
