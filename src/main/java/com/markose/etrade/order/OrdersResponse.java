package bot.sdk.order.order;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OrdersResponse {
	private String marker;
	private String next;
	@JsonProperty("Order")
	private List<Order> order;

	public String getMarker() {
		return marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}
}
