package bot.sdk.account.account;

public class Alert {
	private int id;
	private long createTime;
	private String subject;
	private AlertStatus status;

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(int createTime) {
		this.createTime = createTime;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public AlertStatus getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = AlertStatus.fromValue(status);
	}
}
