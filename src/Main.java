import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Entities.Concrete.Campaign;
import Entities.Concrete.Customer;
import Entities.Concrete.Game;

public class Main {

	public static void main(final String[] args) throws Exception {
		final CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		final Customer customer = new Customer(1, "ahmet4cetinkaya@outlook.com", "123456", "Ahmet", "Çetinkaya",
				"J4UNE", LocalDate.of(1999, 11, 8), "11111111111");
		customerManager.add(customer);

		final GameManager gameManager = new GameManager();
		final Game game = new Game(1, "Age of Empires II HD", 31.00);
		gameManager.add(game);

		final CampaignManager campaignManager = new CampaignManager();
		final Campaign campaign = new Campaign(1, "Öðrenci", (byte) 25, true);
		campaignManager.add(campaign);

		final OrderManager orderManager = new OrderManager();
		orderManager.buy(customer, game, campaign);
	}

}
