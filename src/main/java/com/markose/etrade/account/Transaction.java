package com.markose.etrade.account;

public class Transaction {

	private String transactionId;
	private String accountId;
	private long transactionDate;
	private long postDate;
	private double amount;
	private String description;
	private String transactionType;
	private String memo;
	private boolean imageFlag;
	private String instType;
	private int storeId;
	private Brokerage brokerage;
	private String detailsURI;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
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

	public long getPostDate() {
		return postDate;
	}

	public void setPostDate(long postDate) {
		this.postDate = postDate;
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

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public boolean isImageFlag() {
		return imageFlag;
	}

	public void setImageFlag(boolean imageFlag) {
		this.imageFlag = imageFlag;
	}

	public String getInstType() {
		return instType;
	}

	public void setInstType(String instType) {
		this.instType = instType;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public Brokerage getBrokerage() {
		return brokerage;
	}

	public void setBrokerage(Brokerage brokerage) {
		this.brokerage = brokerage;
	}

	public String getDetailsURI() {
		return detailsURI;
	}

	public void setDetailsURI(String detailsURI) {
		this.detailsURI = detailsURI;
	}
}
