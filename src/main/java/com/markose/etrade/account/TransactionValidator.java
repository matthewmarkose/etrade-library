package bot.sdk.account.account;

import bot.sdk.common.ETWSException;

public class TransactionValidator {

	public static void validateAccountID(final long accountID) {
		if (accountID < 1L) {
			(new ETWSException("invalid accountID")).printStackTrace();
		}
	}

	public static void validateTransactionID(final long transactionID) {
		if (transactionID < 1L) {
			(new ETWSException("invalid transactionID")).printStackTrace();
		}
	}

	public static void validateTransactionType(final TransactionTypeEnum transactionTypeEnum) {
		if (null == transactionTypeEnum) {
			(new ETWSException("transactionTypeEnum is null")).printStackTrace();
		}
	}

	public static void validateTransactionTypeTrades(final TransactionTypeTrades transactionTypeTrades) {
		if (null == transactionTypeTrades) {
			(new ETWSException("TransactionTypeTrades is null")).printStackTrace();
		}
	}

	public static void validateTransactionRequest(final TransactionRequest transactionRequest) {
		if (null == transactionRequest) {
			(new ETWSException("transactionRequest is null")).printStackTrace();
		}
	}
}
