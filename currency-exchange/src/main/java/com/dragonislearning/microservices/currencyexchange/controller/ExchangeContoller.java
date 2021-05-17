package com.dragonislearning.microservices.currencyexchange.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currency-exchange")
public class ExchangeContoller {
	
	@GetMapping("/home")
	public String home() {			
		
		return "Welcome to currency Exchange";
	}
	
	

}
