package com.markose.etrade.account;

public enum View {
	PERFORMANCE, FUNDAMENTAL, OPTIONSWATCH, QUICK, COMPLETE;

	public String value() {
		return this.name();
	}

	public static View fromValue(final String v) {
		return valueOf(v);
	}
}
