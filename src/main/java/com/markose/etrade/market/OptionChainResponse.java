package bot.sdk.market.market;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OptionChainResponse {
	@JsonProperty("OptionPair")
	private List<OptionChainPair> optionPair;
	private long timestamp;
	private String quoteType;
	private double nearPrice;
	@JsonProperty("SelectedED")
	private SelectedED selectedED;

	public List<OptionChainPair> getOptionPair() {
		return optionPair;
	}

	public void setOptionPair(List<OptionChainPair> optionPair) {
		this.optionPair = optionPair;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getQuoteType() {
		return quoteType;
	}

	public void setQuoteType(String quoteType) {
		this.quoteType = quoteType;
	}

	public double getNearPrice() {
		return nearPrice;
	}

	public void setNearPrice(double nearPrice) {
		this.nearPrice = nearPrice;
	}

	public SelectedED getSelectedED() {
		return selectedED;
	}

	public void setSelectedED(SelectedED selectedED) {
		this.selectedED = selectedED;
	}
}
