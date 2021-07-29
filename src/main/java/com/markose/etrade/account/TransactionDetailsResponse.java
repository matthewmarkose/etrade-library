package com.markose.etrade.account;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionDetailsResponse {

	private long transactionId;
	private String accountId;
	private long transactionDate;
	private double amount;
	private String description;
	@JsonProperty("Category")
	private Category category;
	@JsonProperty("Brokerage")
	private Brokerage brokerage;

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public long getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(long transactionDate) {
		this.transactionDate = transactionDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Brokerage getBrokerage() {
		return brokerage;
	}

	public void setBrokerage(Brokerage brokerage) {
		this.brokerage = brokerage;
	}
}
