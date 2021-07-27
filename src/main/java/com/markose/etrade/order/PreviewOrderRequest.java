package bot.sdk.order.order;

import java.util.List;

public class PreviewOrderRequest {
	private OrderType orderType;
	private List<OrderDetail> order;
	private final long clientOrderId;

	public PreviewOrderRequest() {
		clientOrderId = System.currentTimeMillis();
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(OrderType orderType) {
		this.orderType = orderType;
	}

	public List<OrderDetail> getOrder() {
		return order;
	}

	public void setOrder(List<OrderDetail> order) {
		this.order = order;
	}

	public long getClientOrderId() {
		return clientOrderId;
	}
}
