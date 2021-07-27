package bot.sdk.account.account;

public enum SortOrder {
	ASC, DSC;

	public String value() {
		return this.name();
	}

	public static SortOrder fromValue(final String v) {
		return valueOf(v);
	}
}
