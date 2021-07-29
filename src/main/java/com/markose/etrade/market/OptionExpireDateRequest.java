package com.markose.etrade.market;

import org.springframework.lang.NonNull;

public class OptionExpireDateRequest {
	@NonNull
	private String symbol;
	private String expiryType;

	public OptionExpireDateRequest() {
	}

	public OptionExpireDateRequest(String symbol, String expiryType) {
		this.symbol = symbol;
		this.expiryType = expiryType;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public void setSymbol(final String value) {
		this.symbol = value;
	}

	public String getExpiryType() {
		return this.expiryType;
	}

	public void setExpiryType(final String value) {
		this.expiryType = value;
	}
}
