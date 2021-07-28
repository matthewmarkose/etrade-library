package bot.sdk.account.account;

public enum TransactionTypeEnum {
	ATM("ATM"), ASSIGNMENT("ASSIGNMENT"), CHECK("CHECK"), CONTRIBUTION("CONTRIBUTION"), CORPORATEACTIONS(
			"CORPORATE_ACTIONS"), CURRENCYXCH("CURRENCY_XCH"), DEPOSIT("DEPOSIT"), DIRECTDEPOSIT(
					"DIRECT_DEPOSIT"), DIRECTDEBIT("DIRECT_DEBIT"), DISTRIBUTION("DISTRIBUTION"), DIVIDEND(
							"DIVIDEND"), EXERCISE("EXERCISE"), EXPIRATION("EXPIRATION"), INTEREST("INTEREST"), POS(
									"POS"), SWEEP("SWEEP"), TRANSFER("TRANSFER"), WIRE("WIRE"), FEE("FEE");

	private String name;

	private TransactionTypeEnum(final String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
