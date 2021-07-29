package com.markose.etrade.order;

public enum TransactionType {
	ATNM, BUY, SELL, SELL_SHORT, BUY_TO_COVER, MF_EXCHANGE;

	public String value() {
		return this.name();
	}

	public static TransactionType fromValue(final String v) {
		return valueOf(v);
	}
}
