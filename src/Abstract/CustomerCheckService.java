package Abstract;

import Entities.Concrete.Customer;

public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer);
}
