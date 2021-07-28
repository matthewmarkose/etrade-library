package bot.sdk.market.market;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import bot.sdk.account.sdk.client.AccountClient;
import bot.sdk.alert.AlertClient;
import bot.sdk.common.client.ClientRequest;
import bot.sdk.market.sdk.client.MarketClient;
import bot.sdk.order.sdk.client.OrderClient;
import bot.strategy.NoOpStrategy;
import bot.strategy.Strategy;

@Component
public class RetrievalSchedule {

	private final Strategy strategy;

	private boolean receivedRequest;

	public RetrievalSchedule(NoOpStrategy strategy) {
		this.strategy = strategy;
		this.receivedRequest = false;

	}

	public void setClientRequest(ClientRequest request) {
		setClients(request);
		this.receivedRequest = true;

	}

	@Scheduled(cron = "${schedule.cron.startofday}", zone = "CST")
	public void beforeDay() {
		if (receivedRequest)
			strategy.beforeDay();
	}

	@Scheduled(cron = "${schedule.cron.query}", zone = "CST")
	public void trade() {
		if (receivedRequest)
			strategy.retrieveQuote();
	}

	@Scheduled(cron = "${schedule.cron.endofday}", zone = "CST")
	private void endOfDay() {
		if (receivedRequest) {
			strategy.endOfDay();
			setClients(null);
		}

	}

	private void setClients(ClientRequest request) {

		AccountClient.setClientRequest(request);
		AlertClient.setClientRequest(request);
		OrderClient.setClientRequest(request);
		MarketClient.setClientRequest(request);
	}

}
