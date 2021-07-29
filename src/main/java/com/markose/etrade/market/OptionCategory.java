package com.markose.etrade.market;

public enum OptionCategory {
	STANDARD, ALL, MINI;

	public String value() {
		return this.name();
	}

	public static OptionCategory fromValue(final String v) {
		return valueOf(v);
	}
}
