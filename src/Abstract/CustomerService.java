package Abstract;

import Entities.Concrete.Customer;

public interface CustomerService {
	void add(Customer customer) throws Exception;

	void delete(Customer customer);

	void update(Customer customer);
}