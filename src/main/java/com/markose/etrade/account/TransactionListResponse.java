package bot.sdk.account.account;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TransactionListResponse {

	private String pageMarkers;
	private boolean moreTransactions;
	private int transactionCount;
	private int totalCount;
	@JsonProperty("Transaction")
	private List<Transaction> transaction;
	private String next;
	private String marker;

	public String getPageMarkers() {
		return pageMarkers;
	}

	public void setPageMarkers(String pageMarkers) {
		this.pageMarkers = pageMarkers;
	}

	public boolean isMoreTransactions() {
		return moreTransactions;
	}

	public void setMoreTransactions(boolean moreTransactions) {
		this.moreTransactions = moreTransactions;
	}

	public int getTransactionCount() {
		return transactionCount;
	}

	public void setTransactionCount(int transactionCount) {
		this.transactionCount = transactionCount;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public List<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}

	public String getMarker() {
		return marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
	}
}
