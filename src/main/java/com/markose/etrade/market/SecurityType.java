package bot.sdk.market.market;

public enum SecurityType {
	EQ, OPTN, MF, MMF;

	public String value() {
		return this.name();
	}

	public static SecurityType fromValue(final String v) {
		return valueOf(v);
	}
}
