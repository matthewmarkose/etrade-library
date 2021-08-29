package bot.sdk.common.client;

public class ClientRequest {

	private Environment env;

	private static final String LIVE_HOST = "https://api.etrade.com";

	private static final String SANDBOX_HOST = "https://apisb.etrade.com";

	private static final String baseAuthorizeUrl = "https://us.etrade.com/e/t/etws/authorize";

	private String consumerKey;

	private String consumerSecret;

	private String token;

	private String tokenSecret;

	private String verifierCode;

	public ClientRequest() {
	}

	public String getLiveHost() {
		return LIVE_HOST;
	}

	public String getSandboxHost() {
		return SANDBOX_HOST;
	}

	public Environment getEnv() {
		return this.env;
	}

	public void setEnv(final Environment env) {
		this.env = env;
	}

	public String getConsumerKey() {
		return this.consumerKey;
	}

	public void setConsumerKey(final String consumerKey) {
		this.consumerKey = consumerKey;
	}

	public String getConsumerSecret() {
		return this.consumerSecret;
	}

	public void setConsumerSecret(final String consumerSecret) {
		this.consumerSecret = consumerSecret;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(final String token) {
		this.token = token;
	}

	public String getTokenSecret() {
		return this.tokenSecret;
	}

	public void setTokenSecret(final String tokenSecret) {
		this.tokenSecret = tokenSecret;
	}

	public String getVerifierCode() {
		return this.verifierCode;
	}

	public void setVerifierCode(final String verifierCode) {
		this.verifierCode = verifierCode;
	}

	public String getBaseAuthorizeUrl() {
		return this.baseAuthorizeUrl;
	}

}
