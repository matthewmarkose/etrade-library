package com.markose.etrade.account;

import com.markose.etrade.order.MarketSession;

public class PortfolioRequest {
	private String accountIdKey;
	private int count;
	private String sortBy;
	private SortOrder order;
	private MarketSession session;
	private boolean totalsRequired;
	private boolean lotsRequired;
	private View view;

	public String getAccountIdKey() {
		return accountIdKey;
	}

	public void setAccountIdKey(String accountIdKey) {
		this.accountIdKey = accountIdKey;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public SortOrder getOrder() {
		return order;
	}

	public void setOrder(SortOrder order) {
		this.order = order;
	}

	public MarketSession getSession() {
		return session;
	}

	public void setSession(MarketSession session) {
		this.session = session;
	}

	public boolean isTotalsRequired() {
		return totalsRequired;
	}

	public void setTotalsRequired(boolean totalsRequired) {
		this.totalsRequired = totalsRequired;
	}

	public boolean isLotsRequired() {
		return lotsRequired;
	}

	public void setLotsRequired(boolean lotsRequired) {
		this.lotsRequired = lotsRequired;
	}

	public View getView() {
		return view;
	}

	public void setView(View view) {
		this.view = view;
	}
}
