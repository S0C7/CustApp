package com.example.custapp.healthCheck;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
	
	@RequestMapping("/healthcheck")
	public String HealthCheck(){
		return "Cust App Status: Green";
	}

}
