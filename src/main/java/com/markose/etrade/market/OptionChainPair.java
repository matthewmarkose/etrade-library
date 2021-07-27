package bot.sdk.market.market;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OptionChainPair {
	@JsonProperty("Call")
	private Call call;
	@JsonProperty("Put")
	private Put put;

	public Call getCall() {
		return call;
	}

	public void setCall(Call call) {
		this.call = call;
	}

	public Put getPut() {
		return put;
	}

	public void setPut(Put put) {
		this.put = put;
	}
}
