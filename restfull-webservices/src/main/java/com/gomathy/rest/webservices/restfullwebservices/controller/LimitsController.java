package com.gomathy.rest.webservices.restfullwebservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gomathy.rest.webservices.restfullwebservices.bean.Limits;
import com.gomathy.rest.webservices.restfullwebservices.configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public Limits Limits() {
		return new Limits(config.getMinimum(),config.getMaximum());
	}

}
