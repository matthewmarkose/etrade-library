package com.markose.etrade.account;

public class Quick {
	private double lastTrade;
	private int lastTradeTime;
	private double change;
	private double changePct;
	private int volume;
	private String quoteStatus;

	public double getLastTrade() {
		return lastTrade;
	}

	public void setLastTrade(double lastTrade) {
		this.lastTrade = lastTrade;
	}

	public int getLastTradeTime() {
		return lastTradeTime;
	}

	public void setLastTradeTime(int lastTradeTime) {
		this.lastTradeTime = lastTradeTime;
	}

	public double getChange() {
		return change;
	}

	public void setChange(double change) {
		this.change = change;
	}

	public double getChangePct() {
		return changePct;
	}

	public void setChangePct(double changePct) {
		this.changePct = changePct;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getQuoteStatus() {
		return quoteStatus;
	}

	public void setQuoteStatus(String quoteStatus) {
		this.quoteStatus = quoteStatus;
	}
}
