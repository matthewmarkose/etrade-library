package bot.sdk.account.account;

public class OpenCalls {
	private int minEquityCall;
	private int fedCall;
	private int cashCall;
	private int houseCall;

	public int getMinEquityCall() {
		return minEquityCall;
	}

	public void setMinEquityCall(int minEquityCall) {
		this.minEquityCall = minEquityCall;
	}

	public int getFedCall() {
		return fedCall;
	}

	public void setFedCall(int fedCall) {
		this.fedCall = fedCall;
	}

	public int getCashCall() {
		return cashCall;
	}

	public void setCashCall(int cashCall) {
		this.cashCall = cashCall;
	}

	public int getHouseCall() {
		return houseCall;
	}

	public void setHouseCall(int houseCall) {
		this.houseCall = houseCall;
	}
}
