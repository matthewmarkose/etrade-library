package com.markose.etrade.market;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class QuoteResponse {

	@JsonProperty("QuoteData")
	private List<QuoteData> quoteData;

	public List<QuoteData> getQuoteData() {
		return quoteData;
	}

	public void setQuoteData(List<QuoteData> quoteData) {
		this.quoteData = quoteData;
	}

}
