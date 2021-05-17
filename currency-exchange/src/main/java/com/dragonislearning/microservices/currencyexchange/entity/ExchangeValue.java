package com.dragonislearning.microservices.currencyexchange.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	
	@Id
	private Integer id;
	
	private String currencyFrom;
	
	private String currencyTo;
	
	private BigDecimal conversionRate;
	
	private int servicePort;
	
	public ExchangeValue() {}

	public ExchangeValue(Integer id, String currencyFrom, String currencyTo, BigDecimal conversionRate) {
		super();
		this.id = id;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.conversionRate = conversionRate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCurrencyFrom() {
		return currencyFrom;
	}

	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}

	public String getCurrencyTo() {
		return currencyTo;
	}

	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}

	public BigDecimal getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(BigDecimal conversionRate) {
		this.conversionRate = conversionRate;
	}

	public int getServicePort() {
		return servicePort;
	}

	public void setServicePort(int servicePort) {
		this.servicePort = servicePort;
	}	

}
