package com.markose.etrade.account;

public final class Account {
	private String accountId;
	private String accountIdKey;
	private String accountMode;
	private String accountDesc;
	private String accountName;
	private String accountType;
	private String institutionType;
	private String accountStatus;
	private int closedDate;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountIdKey() {
		return accountIdKey;
	}

	public void setAccountIdKey(String accountIdKey) {
		this.accountIdKey = accountIdKey;
	}

	public String getAccountMode() {
		return accountMode;
	}

	public void setAccountMode(String accountMode) {
		this.accountMode = accountMode;
	}

	public String getAccountDesc() {
		return accountDesc;
	}

	public void setAccountDesc(String accountDesc) {
		this.accountDesc = accountDesc;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getInstitutionType() {
		return institutionType;
	}

	public void setInstitutionType(String institutionType) {
		this.institutionType = institutionType;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public int getClosedDate() {
		return closedDate;
	}

	public void setClosedDate(int closedDate) {
		this.closedDate = closedDate;
	}
}
