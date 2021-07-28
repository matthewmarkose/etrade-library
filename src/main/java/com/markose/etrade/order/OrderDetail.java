package bot.sdk.order.order;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class OrderDetail {
	private long placedTime;
	private long executedTime;
	private int orderValue;
	private OrderStatus status;
	private OrderTerm orderTerm;
	private PriceType priceType;
	private double limitPrice;
	private int stopPrice;
	private MarketSession marketSession;
	private boolean allOrNone;
	private int netPrice;
	private int netBid;
	private int netAsk;
	private int gcd;
	private String ratio;
	@JsonProperty("Instrument")
	private List<Instrument> instrument;
	private int orderNumber;
	private int bracketedLimitPrice;
	private double initialStopPrice;

	public long getPlacedTime() {
		return placedTime;
	}

	public void setPlacedTime(long placedTime) {
		this.placedTime = placedTime;
	}

	public long getExecutedTime() {
		return executedTime;
	}

	public void setExecutedTime(long executedTime) {
		this.executedTime = executedTime;
	}

	public int getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(int orderValue) {
		this.orderValue = orderValue;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = OrderStatus.fromValue(status);
	}

	public OrderTerm getOrderTerm() {
		return orderTerm;
	}

	public void setOrderTerm(String orderTerm) {
		this.orderTerm = OrderTerm.fromValue(orderTerm);
	}

	public void setOrderTerm(OrderTerm orderTerm) {
		this.orderTerm = orderTerm;
	}

	public PriceType getPriceType() {
		return priceType;
	}

	public void setPriceType(String priceType) {
		this.priceType = PriceType.fromValue(priceType);
	}

	public double getLimitPrice() {
		return limitPrice;
	}

	public void setLimitPrice(double limitPrice) {
		this.limitPrice = limitPrice;
	}

	public int getStopPrice() {
		return stopPrice;
	}

	public void setStopPrice(int stopPrice) {
		this.stopPrice = stopPrice;
	}

	public MarketSession getMarketSession() {
		return marketSession;
	}

	public void setMarketSession(String marketSession) {
		this.marketSession = MarketSession.fromValue(marketSession);
	}

	public void setMarketSession(MarketSession marketSession) {
		this.marketSession = marketSession;
	}

	public boolean isAllOrNone() {
		return allOrNone;
	}

	public void setAllOrNone(boolean allOrNone) {
		this.allOrNone = allOrNone;
	}

	public int getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(int netPrice) {
		this.netPrice = netPrice;
	}

	public int getNetBid() {
		return netBid;
	}

	public void setNetBid(int netBid) {
		this.netBid = netBid;
	}

	public int getNetAsk() {
		return netAsk;
	}

	public void setNetAsk(int netAsk) {
		this.netAsk = netAsk;
	}

	public int getGcd() {
		return gcd;
	}

	public void setGcd(int gcd) {
		this.gcd = gcd;
	}

	public String getRatio() {
		return ratio;
	}

	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

	public List<Instrument> getInstrument() {
		return instrument;
	}

	public void setInstrument(List<Instrument> instrument) {
		this.instrument = instrument;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getBracketedLimitPrice() {
		return bracketedLimitPrice;
	}

	public void setBracketedLimitPrice(int bracketedLimitPrice) {
		this.bracketedLimitPrice = bracketedLimitPrice;
	}

	public double getInitialStopPrice() {
		return initialStopPrice;
	}

	public void setInitialStopPrice(double initialStopPrice) {
		this.initialStopPrice = initialStopPrice;
	}
}
