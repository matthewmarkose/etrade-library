package bot.sdk.account.account;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Computed {
	private double cashAvailableForInvestment;
	private double cashAvailableForWithdrawal;
	private double totalAvailableForWithdrawal;
	private double netCash;
	private int cashBalance;
	private double settledCashForInvestment;
	private int unSettledCashForInvestment;
	private int fundsWithheldFromPurchasePower;
	private int fundsWithheldFromWithdrawal;
	private int marginBuyingPower;
	private double cashBuyingPower;
	private int dtMarginBuyingPower;
	private int dtCashBuyingPower;
	private int shortAdjustBalance;
	private int accountBalance;
	@JsonProperty("OpenCalls")
	private OpenCalls openCalls;
	@JsonProperty("RealTimeValues")
	private RealTimeValues realTimeValues;

	public double getCashAvailableForInvestment() {
		return cashAvailableForInvestment;
	}

	public void setCashAvailableForInvestment(double cashAvailableForInvestment) {
		this.cashAvailableForInvestment = cashAvailableForInvestment;
	}

	public double getCashAvailableForWithdrawal() {
		return cashAvailableForWithdrawal;
	}

	public void setCashAvailableForWithdrawal(double cashAvailableForWithdrawal) {
		this.cashAvailableForWithdrawal = cashAvailableForWithdrawal;
	}

	public double getTotalAvailableForWithdrawal() {
		return totalAvailableForWithdrawal;
	}

	public void setTotalAvailableForWithdrawal(double totalAvailableForWithdrawal) {
		this.totalAvailableForWithdrawal = totalAvailableForWithdrawal;
	}

	public double getNetCash() {
		return netCash;
	}

	public void setNetCash(double netCash) {
		this.netCash = netCash;
	}

	public int getCashBalance() {
		return cashBalance;
	}

	public void setCashBalance(int cashBalance) {
		this.cashBalance = cashBalance;
	}

	public double getSettledCashForInvestment() {
		return settledCashForInvestment;
	}

	public void setSettledCashForInvestment(double settledCashForInvestment) {
		this.settledCashForInvestment = settledCashForInvestment;
	}

	public int getUnSettledCashForInvestment() {
		return unSettledCashForInvestment;
	}

	public void setUnSettledCashForInvestment(int unSettledCashForInvestment) {
		this.unSettledCashForInvestment = unSettledCashForInvestment;
	}

	public int getFundsWithheldFromPurchasePower() {
		return fundsWithheldFromPurchasePower;
	}

	public void setFundsWithheldFromPurchasePower(int fundsWithheldFromPurchasePower) {
		this.fundsWithheldFromPurchasePower = fundsWithheldFromPurchasePower;
	}

	public int getFundsWithheldFromWithdrawal() {
		return fundsWithheldFromWithdrawal;
	}

	public void setFundsWithheldFromWithdrawal(int fundsWithheldFromWithdrawal) {
		this.fundsWithheldFromWithdrawal = fundsWithheldFromWithdrawal;
	}

	public int getMarginBuyingPower() {
		return marginBuyingPower;
	}

	public void setMarginBuyingPower(int marginBuyingPower) {
		this.marginBuyingPower = marginBuyingPower;
	}

	public double getCashBuyingPower() {
		return cashBuyingPower;
	}

	public void setCashBuyingPower(double cashBuyingPower) {
		this.cashBuyingPower = cashBuyingPower;
	}

	public int getDtMarginBuyingPower() {
		return dtMarginBuyingPower;
	}

	public void setDtMarginBuyingPower(int dtMarginBuyingPower) {
		this.dtMarginBuyingPower = dtMarginBuyingPower;
	}

	public int getDtCashBuyingPower() {
		return dtCashBuyingPower;
	}

	public void setDtCashBuyingPower(int dtCashBuyingPower) {
		this.dtCashBuyingPower = dtCashBuyingPower;
	}

	public int getShortAdjustBalance() {
		return shortAdjustBalance;
	}

	public void setShortAdjustBalance(int shortAdjustBalance) {
		this.shortAdjustBalance = shortAdjustBalance;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public OpenCalls getOpenCalls() {
		return openCalls;
	}

	public void setOpenCalls(OpenCalls openCalls) {
		this.openCalls = openCalls;
	}

	public RealTimeValues getRealTimeValues() {
		return realTimeValues;
	}

	public void setRealTimeValues(RealTimeValues realTimeValues) {
		this.realTimeValues = realTimeValues;
	}
}
