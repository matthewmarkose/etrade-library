package com.markose.etrade.market;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class QuoteData {

	private String dateTime;

	private int dateTimeUTC;

	private String quoteStatus;

	private String ahFlag;

	private boolean hasMiniOptions;

	private AllQuote quote;

	@JsonProperty("Product")
	private Product product;

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public int getDateTimeUTC() {
		return dateTimeUTC;
	}

	public void setDateTimeUTC(int dateTimeUTC) {
		this.dateTimeUTC = dateTimeUTC;
	}

	public String getQuoteStatus() {
		return quoteStatus;
	}

	public void setQuoteStatus(String quoteStatus) {
		this.quoteStatus = quoteStatus;
	}

	public String getAhFlag() {
		return ahFlag;
	}

	public void setAhFlag(String ahFlag) {
		this.ahFlag = ahFlag;
	}

	public boolean isHasMiniOptions() {
		return hasMiniOptions;
	}

	public void setHasMiniOptions(boolean hasMiniOptions) {
		this.hasMiniOptions = hasMiniOptions;
	}

	@JsonAlias({ "All", "Intraday", "Fundamental", "Option" })
	public AllQuote getQuote() {
		return quote;
	}

	public void setQuote(AllQuote quote) {
		this.quote = quote;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
