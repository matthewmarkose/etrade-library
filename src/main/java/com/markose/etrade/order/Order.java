package bot.sdk.order.order;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Order {
	private int orderId;
	private String details;
	private OrderType orderType;
	@JsonProperty("OrderDetail")
	private List<OrderDetail> orderDetail;
	private double totalOrderValue;
	private double totalCommission;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = OrderType.fromValue(orderType);
	}

	public List<OrderDetail> getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(List<OrderDetail> orderDetail) {
		this.orderDetail = orderDetail;
	}

	public double getTotalOrderValue() {
		return totalOrderValue;
	}

	public void setTotalOrderValue(double totalOrderValue) {
		this.totalOrderValue = totalOrderValue;
	}

	public double getTotalCommission() {
		return totalCommission;
	}

	public void setTotalCommission(double totalCommission) {
		this.totalCommission = totalCommission;
	}
}
