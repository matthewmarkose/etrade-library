package com.markose.etrade.account;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class AlertsResponse {

	private int totalAlerts;

	@JsonProperty("Alert")
	private List<Alert> alert;

	public String result;
	@JsonProperty("FailedAlerts")
	public List<Integer> failedAlerts;

	public int getTotalAlerts() {
		return totalAlerts;
	}

	public void setTotalAlerts(int totalAlerts) {
		this.totalAlerts = totalAlerts;
	}

	public List<Alert> getAlert() {
		return alert;
	}

	public void setAlert(List<Alert> alert) {
		this.alert = alert;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public List<Integer> getFailedAlerts() {
		return failedAlerts;
	}

	public void setFailedAlerts(Map<String, List<Integer>> failedAlerts) {
		this.failedAlerts = failedAlerts.get("alertId");
	}
}