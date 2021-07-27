package bot.sdk.account.account;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BalanceResponse {

	private String accountId;
	private String accountType;
	private String optionLevel;
	private String accountDescription;
	private int quoteMode;
	private String dayTraderStatus;
	private String accountMode;
	@JsonProperty("Cash")
	private Cash cash;
	@JsonProperty("Computed")
	private Computed computed;

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getOptionLevel() {
		return optionLevel;
	}

	public void setOptionLevel(String optionLevel) {
		this.optionLevel = optionLevel;
	}

	public String getAccountDescription() {
		return accountDescription;
	}

	public void setAccountDescription(String accountDescription) {
		this.accountDescription = accountDescription;
	}

	public int getQuoteMode() {
		return quoteMode;
	}

	public void setQuoteMode(int quoteMode) {
		this.quoteMode = quoteMode;
	}

	public String getDayTraderStatus() {
		return dayTraderStatus;
	}

	public void setDayTraderStatus(String dayTraderStatus) {
		this.dayTraderStatus = dayTraderStatus;
	}

	public String getAccountMode() {
		return accountMode;
	}

	public void setAccountMode(String accountMode) {
		this.accountMode = accountMode;
	}

	public Cash getCash() {
		return cash;
	}

	public void setCash(Cash cash) {
		this.cash = cash;
	}

	public Computed getComputed() {
		return computed;
	}

	public void setComputed(Computed computed) {
		this.computed = computed;
	}
}
