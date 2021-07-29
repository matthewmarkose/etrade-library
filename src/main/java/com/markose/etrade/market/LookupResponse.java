package com.markose.etrade.market;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class LookupResponse {
	@JsonProperty("Data")
	private List<Data> data;

	public List<Data> getData() {
		return data;
	}

	public void setData(List<Data> data) {
		this.data = data;
	}
}
