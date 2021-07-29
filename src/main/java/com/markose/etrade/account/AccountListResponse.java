package com.markose.etrade.account;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public final class AccountListResponse {

	private List<Account> accounts;

	@JsonProperty("Accounts")
	public void setAccounts(Map<String, List<Account>> accounts) {
		this.accounts = accounts.get("Account");
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setResponse(List<Account> response) {
		this.accounts = response;
	}
}
