package bot.sdk.market.market;

import org.springframework.lang.NonNull;

import bot.sdk.order.order.PriceType;

public class OptionChainRequest {
	@NonNull
	private String symbol;
	private String expiryYear;
	private String expiryMonth;
	private String expiryDay;
	private String strikePriceNear;
	private String noOfStrikes;
	private boolean includeWeekly;
	private boolean skipAdjusted;
	private OptionCategory optionCategory;
	private ChainType chainType;
	private PriceType priceType;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}

	public String getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public String getExpiryDay() {
		return expiryDay;
	}

	public void setExpiryDay(String expiryDay) {
		this.expiryDay = expiryDay;
	}

	public String getStrikePriceNear() {
		return strikePriceNear;
	}

	public void setStrikePriceNear(String strikePriceNear) {
		this.strikePriceNear = strikePriceNear;
	}

	public String getNoOfStrikes() {
		return noOfStrikes;
	}

	public void setNoOfStrikes(String noOfStrikes) {
		this.noOfStrikes = noOfStrikes;
	}

	public boolean isIncludeWeekly() {
		return includeWeekly;
	}

	public void setIncludeWeekly(boolean includeWeekly) {
		this.includeWeekly = includeWeekly;
	}

	public boolean isSkipAdjusted() {
		return skipAdjusted;
	}

	public void setSkipAdjusted(boolean skipAdjusted) {
		this.skipAdjusted = skipAdjusted;
	}

	public OptionCategory getOptionCategory() {
		return optionCategory;
	}

	public void setOptionCategory(OptionCategory optionCategory) {
		this.optionCategory = optionCategory;
	}

	public ChainType getChainType() {
		return chainType;
	}

	public void setChainType(ChainType chainType) {
		this.chainType = chainType;
	}

	public PriceType getPriceType() {
		return priceType;
	}

	public void setPriceType(PriceType priceType) {
		this.priceType = priceType;
	}
}
