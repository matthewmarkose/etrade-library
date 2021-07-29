package com.markose.etrade.account;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PortfolioResponse {
	@JsonProperty("AccountPortfolio")
	private List<AccountPortfolio> accountPortfolio;
}
