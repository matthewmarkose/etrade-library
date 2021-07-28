package bot.sdk.account.account;

public enum AlertStatus {
	UNREAD, READ, DELETED, UNDELETED;

	public String value() {
		return this.name();
	}

	public static AlertStatus fromValue(final String v) {
		return valueOf(v);
	}
}
