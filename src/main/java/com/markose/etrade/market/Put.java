package bot.sdk.market.market;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Put {
	private String optionCategory;
	private String optionRootSymbol;
	private int timeStamp;
	private boolean adjustedFlag;
	private String displaySymbol;
	private String optionType;
	private double strikePrice;
	private String symbol;
	private double bid;
	private double ask;
	private int bidSize;
	private int askSize;
	private String inTheMoney;
	private int volume;
	private int openInterest;
	private double netChange;
	private double lastPrice;
	private String quoteDetail;
	private String osiKey;
	@JsonProperty("OptionGreeks")
	private OptionGreeks optionGreeks;

	public String getOptionCategory() {
		return optionCategory;
	}

	public void setOptionCategory(String optionCategory) {
		this.optionCategory = optionCategory;
	}

	public String getOptionRootSymbol() {
		return optionRootSymbol;
	}

	public void setOptionRootSymbol(String optionRootSymbol) {
		this.optionRootSymbol = optionRootSymbol;
	}

	public int getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(int timeStamp) {
		this.timeStamp = timeStamp;
	}

	public boolean isAdjustedFlag() {
		return adjustedFlag;
	}

	public void setAdjustedFlag(boolean adjustedFlag) {
		this.adjustedFlag = adjustedFlag;
	}

	public String getDisplaySymbol() {
		return displaySymbol;
	}

	public void setDisplaySymbol(String displaySymbol) {
		this.displaySymbol = displaySymbol;
	}

	public String getOptionType() {
		return optionType;
	}

	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

	public double getStrikePrice() {
		return strikePrice;
	}

	public void setStrikePrice(double strikePrice) {
		this.strikePrice = strikePrice;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public double getBid() {
		return bid;
	}

	public void setBid(double bid) {
		this.bid = bid;
	}

	public double getAsk() {
		return ask;
	}

	public void setAsk(double ask) {
		this.ask = ask;
	}

	public int getBidSize() {
		return bidSize;
	}

	public void setBidSize(int bidSize) {
		this.bidSize = bidSize;
	}

	public int getAskSize() {
		return askSize;
	}

	public void setAskSize(int askSize) {
		this.askSize = askSize;
	}

	public String getInTheMoney() {
		return inTheMoney;
	}

	public void setInTheMoney(String inTheMoney) {
		this.inTheMoney = inTheMoney;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getOpenInterest() {
		return openInterest;
	}

	public void setOpenInterest(int openInterest) {
		this.openInterest = openInterest;
	}

	public double getNetChange() {
		return netChange;
	}

	public void setNetChange(double netChange) {
		this.netChange = netChange;
	}

	public double getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(double lastPrice) {
		this.lastPrice = lastPrice;
	}

	public String getQuoteDetail() {
		return quoteDetail;
	}

	public void setQuoteDetail(String quoteDetail) {
		this.quoteDetail = quoteDetail;
	}

	public String getOsiKey() {
		return osiKey;
	}

	public void setOsiKey(String osiKey) {
		this.osiKey = osiKey;
	}

	public OptionGreeks getOptionGreeks() {
		return optionGreeks;
	}

	public void setOptionGreeks(OptionGreeks optionGreeks) {
		this.optionGreeks = optionGreeks;
	}
}
