package com.markose.etrade.order;

public enum OrderType {

	EQ, OPTN, SPREADS, BUY_WRITES, BUTTERFLY, IRON_BUTTERFLY, CONDOR, IRON_CONDOR, MF, MMF, ONE_CANCELS_ALL;

	public String value() {
		return this.name();
	}

	public static OrderType fromValue(final String v) {
		return valueOf(v);
	}
}
