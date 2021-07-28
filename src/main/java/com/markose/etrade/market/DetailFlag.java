package bot.sdk.market.market;

public enum DetailFlag {
	ALL, FUNDAMENTAL, INTRADAY, OPTIONS, WEEK_52;

	public String value() {
		return this.name();
	}

	public static DetailFlag fromValue(final String v) {
		return valueOf(v);
	}
}
