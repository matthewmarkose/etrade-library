package com.markose.etrade.market;

public class Product {
	private String companyName;
	private String exchange;
	private SecurityType securityType;
	private String symbol;
	private int expiryYear;
	private int expiryMonth;
	private int expiryDay;
	private int strikePrice;
	private String callPut;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public SecurityType getSecurityType() {
		return securityType;
	}

	public void setSecurityType(SecurityType securityType) {
		this.securityType = securityType;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public int getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}

	public int getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public int getExpiryDay() {
		return expiryDay;
	}

	public void setExpiryDay(int expiryDay) {
		this.expiryDay = expiryDay;
	}

	public int getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(int strikePrice) {
		this.strikePrice = strikePrice;
	}

	public String getCallPut() {
		return callPut;
	}

	public void setCallPut(String callPut) {
		this.callPut = callPut;
	}
}
