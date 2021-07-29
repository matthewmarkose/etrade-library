package com.markose.etrade.account;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AccountPortfolio {
	private String accountId;
	@JsonProperty("Position")
	private List<Position> position;
	private int totalPages;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public List<Position> getPosition() {
		return position;
	}

	public void setPosition(List<Position> position) {
		this.position = position;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
}
