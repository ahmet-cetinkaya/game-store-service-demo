package Abstract;

import Entities.Concrete.Campaign;
import Entities.Concrete.Customer;
import Entities.Concrete.Game;
import Entities.Concrete.Order;

public interface OrderService {
	void add(Order order);

	void buy(Customer customer, Game game, Campaign campaign);
}
