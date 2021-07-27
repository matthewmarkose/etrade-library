package bot.sdk.account.account;

public class RealTimeValues {
	private double totalAccountValue;
	private double netMv;
	private double netMvLong;
	private int netMvShort;

	public double getTotalAccountValue() {
		return totalAccountValue;
	}

	public void setTotalAccountValue(double totalAccountValue) {
		this.totalAccountValue = totalAccountValue;
	}

	public double getNetMv() {
		return netMv;
	}

	public void setNetMv(double netMv) {
		this.netMv = netMv;
	}

	public double getNetMvLong() {
		return netMvLong;
	}

	public void setNetMvLong(double netMvLong) {
		this.netMvLong = netMvLong;
	}

	public int getNetMvShort() {
		return netMvShort;
	}

	public void setNetMvShort(int netMvShort) {
		this.netMvShort = netMvShort;
	}
}
