package bot.sdk.market.market;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OptionExpireDateResponse {
	@JsonProperty("ExpirationDate")
	private List<ExpirationDate> expirationDate;

	public List<ExpirationDate> getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(List<ExpirationDate> expirationDate) {
		this.expirationDate = expirationDate;
	}
}
