package com.markose.etrade.order;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.markose.etrade.market.Product;

public class Instrument {
	private String symbolDescription;
	private String orderAction;
	private String quantityType;
	private int orderedQuantity;
	private double filledQuantity;
	private double averageExecutionPrice;
	private double estimatedCommission;
	private double estimatedFees;
	@JsonProperty("Product")
	private Product product;

	public String getSymbolDescription() {
		return symbolDescription;
	}

	public void setSymbolDescription(String symbolDescription) {
		this.symbolDescription = symbolDescription;
	}

	public String getOrderAction() {
		return orderAction;
	}

	public void setOrderAction(String orderAction) {
		this.orderAction = orderAction;
	}

	public String getQuantityType() {
		return quantityType;
	}

	public void setQuantityType(String quantityType) {
		this.quantityType = quantityType;
	}

	public int getOrderedQuantity() {
		return orderedQuantity;
	}

	public void setOrderedQuantity(int orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}

	public double getFilledQuantity() {
		return filledQuantity;
	}

	public void setFilledQuantity(double filledQuantity) {
		this.filledQuantity = filledQuantity;
	}

	public double getAverageExecutionPrice() {
		return averageExecutionPrice;
	}

	public void setAverageExecutionPrice(double averageExecutionPrice) {
		this.averageExecutionPrice = averageExecutionPrice;
	}

	public double getEstimatedCommission() {
		return estimatedCommission;
	}

	public void setEstimatedCommission(double estimatedCommission) {
		this.estimatedCommission = estimatedCommission;
	}

	public double getEstimatedFees() {
		return estimatedFees;
	}

	public void setEstimatedFees(double estimatedFees) {
		this.estimatedFees = estimatedFees;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
