package bot.sdk.market.market;

public enum ChainType {
	CALL, PUT, CALLPUT;

	public String value() {
		return this.name();
	}

	public static ChainType fromValue(final String v) {
		return valueOf(v);
	}
}
