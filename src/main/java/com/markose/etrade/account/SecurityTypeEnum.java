package com.markose.etrade.account;

public enum SecurityTypeEnum {
	ALL("ALL"), EQ("EQ"), OPTN("OPTN"), MMF("MMF"), MF("MF"), BONDS("BONDS");

	private String name;

	private SecurityTypeEnum(final String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
