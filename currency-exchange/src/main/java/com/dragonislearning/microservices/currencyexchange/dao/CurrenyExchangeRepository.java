package com.dragonislearning.microservices.currencyexchange.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dragonislearning.microservices.currencyexchange.entity.ExchangeValue;


public interface CurrenyExchangeRepository 
		extends JpaRepository<ExchangeValue,Long>{
	
	public ExchangeValue findByFromAndTo(String from,String to);	
	

}
