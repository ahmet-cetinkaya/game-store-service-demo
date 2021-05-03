package Concrete;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Concrete.Customer;

public class CustomerManager implements CustomerService {
	CustomerCheckService customerCheckService;

	public CustomerManager(final CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(final Customer customer) throws Exception {
		if (!customerCheckService.CheckIfRealPerson(customer))
			throw new Exception("Not a valid person");
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " isimli müþteri kayýt oldu.");
	}

	@Override
	public void delete(final Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " isimli müþteri silindi.");
	}

	@Override
	public void update(final Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " isimli müþteri güncellendi.");
	}

}
