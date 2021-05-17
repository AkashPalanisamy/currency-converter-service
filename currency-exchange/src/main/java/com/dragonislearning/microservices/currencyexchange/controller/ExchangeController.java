package com.dragonislearning.microservices.currencyexchange.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dragonislearning.microservices.currencyexchange.dao.CurrenyExchangeRepository;
import com.dragonislearning.microservices.currencyexchange.entity.ExchangeValue;

@RestController
@RequestMapping("/currency-exchange")
public class ExchangeController {
	
	private Logger logger = LoggerFactory.getLogger(ExchangeController.class);
	
	@Autowired
	private CurrenyExchangeRepository repository;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/home")
	public String home() {			
		
		return "Welcome to currency Exchange";
	}
	
	@GetMapping("/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(
			@PathVariable String from,
			@PathVariable String to) {
		
		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		
		int port = Integer.parseInt(environment.getProperty("local.server.port"));
		
		exchangeValue.setServicePort(port);
		
		logger.info("{}",exchangeValue);
		
		return exchangeValue;
	}
	
	

}
