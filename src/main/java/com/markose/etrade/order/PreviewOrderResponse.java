package bot.sdk.order.order;

import java.util.List;

public class PreviewOrderResponse {
	private String orderType;
	private List<Order> order;
	private long clientOrderId;

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public long getClientOrderId() {
		return clientOrderId;
	}

	public void setClientOrderId(long clientOrderId) {
		this.clientOrderId = clientOrderId;
	}
}
