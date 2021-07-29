package com.markose.etrade.order;

public enum OrderStatus {
	OPEN, EXECUTED, CANCELLED, INDIVIDUAL_FILLS, CANCEL_REQUESTED, EXPIRED, REJECTED, PARTIAL, DO_NOT_EXERCISE, DONE_TRADE_EXECUTED;

	public String value() {
		return this.name();
	}

	public static OrderStatus fromValue(final String v) {
		return valueOf(v);
	}
}
