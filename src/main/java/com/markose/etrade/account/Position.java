package com.markose.etrade.account;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.markose.etrade.market.Product;

public class Position {
	private long positionId;
	private String symbolDescription;
	private long dateAcquired;
	private double pricePaid;
	private int commissions;
	private int otherFees;
	private int quantity;
	private String positionIndicator;
	private String positionType;
	private double daysGain;
	private double daysGainPct;
	private double marketValue;
	private int totalCost;
	private double totalGain;
	private double totalGainPct;
	private double pctOfPortfolio;
	private double costPerShare;
	private int todayCommissions;
	private int todayFees;
	private int todayPricePaid;
	private int todayQuantity;
	private double adjPrevClose;
	private String lotsDetails;
	private String quoteDetails;
	@JsonProperty("Product")
	private Product product;
	@JsonProperty("Quick")
	private Quick quick;

	public long getPositionId() {
		return positionId;
	}

	public void setPositionId(long positionId) {
		this.positionId = positionId;
	}

	public String getSymbolDescription() {
		return symbolDescription;
	}

	public void setSymbolDescription(String symbolDescription) {
		this.symbolDescription = symbolDescription;
	}

	public long getDateAcquired() {
		return dateAcquired;
	}

	public void setDateAcquired(long dateAcquired) {
		this.dateAcquired = dateAcquired;
	}

	public double getPricePaid() {
		return pricePaid;
	}

	public void setPricePaid(double pricePaid) {
		this.pricePaid = pricePaid;
	}

	public int getCommissions() {
		return commissions;
	}

	public void setCommissions(int commissions) {
		this.commissions = commissions;
	}

	public int getOtherFees() {
		return otherFees;
	}

	public void setOtherFees(int otherFees) {
		this.otherFees = otherFees;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPositionIndicator() {
		return positionIndicator;
	}

	public void setPositionIndicator(String positionIndicator) {
		this.positionIndicator = positionIndicator;
	}

	public String getPositionType() {
		return positionType;
	}

	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}

	public double getDaysGain() {
		return daysGain;
	}

	public void setDaysGain(double daysGain) {
		this.daysGain = daysGain;
	}

	public double getDaysGainPct() {
		return daysGainPct;
	}

	public void setDaysGainPct(double daysGainPct) {
		this.daysGainPct = daysGainPct;
	}

	public double getMarketValue() {
		return marketValue;
	}

	public void setMarketValue(double marketValue) {
		this.marketValue = marketValue;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	public double getTotalGain() {
		return totalGain;
	}

	public void setTotalGain(double totalGain) {
		this.totalGain = totalGain;
	}

	public double getTotalGainPct() {
		return totalGainPct;
	}

	public void setTotalGainPct(double totalGainPct) {
		this.totalGainPct = totalGainPct;
	}

	public double getPctOfPortfolio() {
		return pctOfPortfolio;
	}

	public void setPctOfPortfolio(double pctOfPortfolio) {
		this.pctOfPortfolio = pctOfPortfolio;
	}

	public double getCostPerShare() {
		return costPerShare;
	}

	public void setCostPerShare(double costPerShare) {
		this.costPerShare = costPerShare;
	}

	public int getTodayCommissions() {
		return todayCommissions;
	}

	public void setTodayCommissions(int todayCommissions) {
		this.todayCommissions = todayCommissions;
	}

	public int getTodayFees() {
		return todayFees;
	}

	public void setTodayFees(int todayFees) {
		this.todayFees = todayFees;
	}

	public int getTodayPricePaid() {
		return todayPricePaid;
	}

	public void setTodayPricePaid(int todayPricePaid) {
		this.todayPricePaid = todayPricePaid;
	}

	public int getTodayQuantity() {
		return todayQuantity;
	}

	public void setTodayQuantity(int todayQuantity) {
		this.todayQuantity = todayQuantity;
	}

	public double getAdjPrevClose() {
		return adjPrevClose;
	}

	public void setAdjPrevClose(double adjPrevClose) {
		this.adjPrevClose = adjPrevClose;
	}

	public String getLotsDetails() {
		return lotsDetails;
	}

	public void setLotsDetails(String lotsDetails) {
		this.lotsDetails = lotsDetails;
	}

	public String getQuoteDetails() {
		return quoteDetails;
	}

	public void setQuoteDetails(String quoteDetails) {
		this.quoteDetails = quoteDetails;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Quick getQuick() {
		return quick;
	}

	public void setQuick(Quick quick) {
		this.quick = quick;
	}
}
