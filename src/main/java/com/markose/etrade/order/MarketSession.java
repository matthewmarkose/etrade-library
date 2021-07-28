package bot.sdk.order.order;

public enum MarketSession {
	REGULAR, EXTENDED;

	public String value() {
		return this.name();
	}

	public static MarketSession fromValue(final String v) {
		return valueOf(v);
	}
}
