package bot.sdk.account.account;

public class Cash {
	private int fundsForOpenOrdersCash;
	private double moneyMktBalance;

	public int getFundsForOpenOrdersCash() {
		return fundsForOpenOrdersCash;
	}

	public void setFundsForOpenOrdersCash(int fundsForOpenOrdersCash) {
		this.fundsForOpenOrdersCash = fundsForOpenOrdersCash;
	}

	public double getMoneyMktBalance() {
		return moneyMktBalance;
	}

	public void setMoneyMktBalance(double moneyMktBalance) {
		this.moneyMktBalance = moneyMktBalance;
	}
}
