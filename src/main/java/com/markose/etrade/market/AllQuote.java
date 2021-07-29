package com.markose.etrade.market;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AllQuote {

	private int volume10Day;

	private int optionPreviousBidPrice;

	private int optionPreviousAskPrice;

	private String osiKey;

	private boolean adjustedFlag;

	private double ask;

	private int askSize;

	private String askTime;

	private double bid;

	private String bidExchange;

	private int bidSize;

	private String bidTime;

	private double changeClose;

	private double changeClosePercentage;

	private String companyName;

	private int daysToExpiration;

	private String dirLast;

	private double dividend;

	private double eps;

	private double estEarnings;

	private int exDividendDate;

	private double high;

	private double high52;

	private double lastTrade;

	private double low;

	private double low52;

	private double open;

	private int openInterest;

	private String optionStyle;

	private String optionUnderlier;

	private double previousClose;

	private int previousDayVolume;

	private String primaryExchange;

	private String symbolDescription;

	private int totalVolume;

	private int upc;

	private int cashDeliverable;

	private double marketCap;

	private long sharesOutstanding;

	private String nextEarningDate;

	private double beta;

	private double yield;

	private double declaredDividend;

	private int dividendPayableDate;

	private double pe;

	private int week52LowDate;

	private int week52HiDate;

	private double intrinsicValue;

	private double timePremium;

	private double optionMultiplier;

	private double contractSize;

	private int expirationDate;

	private int timeOfLastTrade;

	private int averageVolume;

	@JsonProperty("ExtendedHourQuoteDetail")
	private ExtendedHourQuoteDetail extendedHourQuoteDetail;

	public int getVolume10Day() {
		return volume10Day;
	}

	public void setVolume10Day(int volume10Day) {
		this.volume10Day = volume10Day;
	}

	public int getOptionPreviousBidPrice() {
		return optionPreviousBidPrice;
	}

	public void setOptionPreviousBidPrice(int optionPreviousBidPrice) {
		this.optionPreviousBidPrice = optionPreviousBidPrice;
	}

	public int getOptionPreviousAskPrice() {
		return optionPreviousAskPrice;
	}

	public void setOptionPreviousAskPrice(int optionPreviousAskPrice) {
		this.optionPreviousAskPrice = optionPreviousAskPrice;
	}

	public String getOsiKey() {
		return osiKey;
	}

	public void setOsiKey(String osiKey) {
		this.osiKey = osiKey;
	}

	public boolean isAdjustedFlag() {
		return adjustedFlag;
	}

	public void setAdjustedFlag(boolean adjustedFlag) {
		this.adjustedFlag = adjustedFlag;
	}

	public double getAsk() {
		return ask;
	}

	public void setAsk(double ask) {
		this.ask = ask;
	}

	public int getAskSize() {
		return askSize;
	}

	public void setAskSize(int askSize) {
		this.askSize = askSize;
	}

	public String getAskTime() {
		return askTime;
	}

	public void setAskTime(String askTime) {
		this.askTime = askTime;
	}

	public double getBid() {
		return bid;
	}

	public void setBid(double bid) {
		this.bid = bid;
	}

	public String getBidExchange() {
		return bidExchange;
	}

	public void setBidExchange(String bidExchange) {
		this.bidExchange = bidExchange;
	}

	public int getBidSize() {
		return bidSize;
	}

	public void setBidSize(int bidSize) {
		this.bidSize = bidSize;
	}

	public String getBidTime() {
		return bidTime;
	}

	public void setBidTime(String bidTime) {
		this.bidTime = bidTime;
	}

	public double getChangeClose() {
		return changeClose;
	}

	public void setChangeClose(double changeClose) {
		this.changeClose = changeClose;
	}

	public double getChangeClosePercentage() {
		return changeClosePercentage;
	}

	public void setChangeClosePercentage(double changeClosePercentage) {
		this.changeClosePercentage = changeClosePercentage;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getDaysToExpiration() {
		return daysToExpiration;
	}

	public void setDaysToExpiration(int daysToExpiration) {
		this.daysToExpiration = daysToExpiration;
	}

	public String getDirLast() {
		return dirLast;
	}

	public void setDirLast(String dirLast) {
		this.dirLast = dirLast;
	}

	public double getDividend() {
		return dividend;
	}

	public void setDividend(double dividend) {
		this.dividend = dividend;
	}

	public double getEps() {
		return eps;
	}

	public void setEps(double eps) {
		this.eps = eps;
	}

	public double getEstEarnings() {
		return estEarnings;
	}

	public void setEstEarnings(double estEarnings) {
		this.estEarnings = estEarnings;
	}

	public int getExDividendDate() {
		return exDividendDate;
	}

	public void setExDividendDate(int exDividendDate) {
		this.exDividendDate = exDividendDate;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getHigh52() {
		return high52;
	}

	public void setHigh52(double high52) {
		this.high52 = high52;
	}

	public double getLastTrade() {
		return lastTrade;
	}

	public void setLastTrade(double lastTrade) {
		this.lastTrade = lastTrade;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getLow52() {
		return low52;
	}

	public void setLow52(double low52) {
		this.low52 = low52;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public int getOpenInterest() {
		return openInterest;
	}

	public void setOpenInterest(int openInterest) {
		this.openInterest = openInterest;
	}

	public String getOptionStyle() {
		return optionStyle;
	}

	public void setOptionStyle(String optionStyle) {
		this.optionStyle = optionStyle;
	}

	public String getOptionUnderlier() {
		return optionUnderlier;
	}

	public void setOptionUnderlier(String optionUnderlier) {
		this.optionUnderlier = optionUnderlier;
	}

	public double getPreviousClose() {
		return previousClose;
	}

	public void setPreviousClose(double previousClose) {
		this.previousClose = previousClose;
	}

	public int getPreviousDayVolume() {
		return previousDayVolume;
	}

	public void setPreviousDayVolume(int previousDayVolume) {
		this.previousDayVolume = previousDayVolume;
	}

	public String getPrimaryExchange() {
		return primaryExchange;
	}

	public void setPrimaryExchange(String primaryExchange) {
		this.primaryExchange = primaryExchange;
	}

	public String getSymbolDescription() {
		return symbolDescription;
	}

	public void setSymbolDescription(String symbolDescription) {
		this.symbolDescription = symbolDescription;
	}

	public int getTotalVolume() {
		return totalVolume;
	}

	public void setTotalVolume(int totalVolume) {
		this.totalVolume = totalVolume;
	}

	public int getUpc() {
		return upc;
	}

	public void setUpc(int upc) {
		this.upc = upc;
	}

	public int getCashDeliverable() {
		return cashDeliverable;
	}

	public void setCashDeliverable(int cashDeliverable) {
		this.cashDeliverable = cashDeliverable;
	}

	public double getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(double marketCap) {
		this.marketCap = marketCap;
	}

	public long getSharesOutstanding() {
		return sharesOutstanding;
	}

	public void setSharesOutstanding(long sharesOutstanding) {
		this.sharesOutstanding = sharesOutstanding;
	}

	public String getNextEarningDate() {
		return nextEarningDate;
	}

	public void setNextEarningDate(String nextEarningDate) {
		this.nextEarningDate = nextEarningDate;
	}

	public double getBeta() {
		return beta;
	}

	public void setBeta(double beta) {
		this.beta = beta;
	}

	public double getYield() {
		return yield;
	}

	public void setYield(double yield) {
		this.yield = yield;
	}

	public double getDeclaredDividend() {
		return declaredDividend;
	}

	public void setDeclaredDividend(double declaredDividend) {
		this.declaredDividend = declaredDividend;
	}

	public int getDividendPayableDate() {
		return dividendPayableDate;
	}

	public void setDividendPayableDate(int dividendPayableDate) {
		this.dividendPayableDate = dividendPayableDate;
	}

	public double getPe() {
		return pe;
	}

	public void setPe(double pe) {
		this.pe = pe;
	}

	public int getWeek52LowDate() {
		return week52LowDate;
	}

	public void setWeek52LowDate(int week52LowDate) {
		this.week52LowDate = week52LowDate;
	}

	public int getWeek52HiDate() {
		return week52HiDate;
	}

	public void setWeek52HiDate(int week52HiDate) {
		this.week52HiDate = week52HiDate;
	}

	public double getIntrinsicValue() {
		return intrinsicValue;
	}

	public void setIntrinsicValue(double intrinsicValue) {
		this.intrinsicValue = intrinsicValue;
	}

	public double getTimePremium() {
		return timePremium;
	}

	public void setTimePremium(double timePremium) {
		this.timePremium = timePremium;
	}

	public double getOptionMultiplier() {
		return optionMultiplier;
	}

	public void setOptionMultiplier(double optionMultiplier) {
		this.optionMultiplier = optionMultiplier;
	}

	public double getContractSize() {
		return contractSize;
	}

	public void setContractSize(double contractSize) {
		this.contractSize = contractSize;
	}

	public int getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(int expirationDate) {
		this.expirationDate = expirationDate;
	}

	public int getTimeOfLastTrade() {
		return timeOfLastTrade;
	}

	public void setTimeOfLastTrade(int timeOfLastTrade) {
		this.timeOfLastTrade = timeOfLastTrade;
	}

	public int getAverageVolume() {
		return averageVolume;
	}

	public void setAverageVolume(int averageVolume) {
		this.averageVolume = averageVolume;
	}

	public ExtendedHourQuoteDetail getExtendedHourQuoteDetail() {
		return extendedHourQuoteDetail;
	}

	public void setExtendedHourQuoteDetail(ExtendedHourQuoteDetail extendedHourQuoteDetail) {
		this.extendedHourQuoteDetail = extendedHourQuoteDetail;
	}
}
