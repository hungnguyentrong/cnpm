package Backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Backend.model.Customer;
import Backend.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public Customer loginFunction(String email, String pass) {
		// TODO Auto-generated method stub
		return customerRepository.loginCustomer(email, pass);
	}
	@Override
	public Customer getCustomerInformation(int customerID) {
		// TODO Auto-generated method stub
		return customerRepository.getById(customerID);
	}
	@Override
	public Customer updateCustomer(int customerID, String phoneNumber, String address) {
		// TODO Auto-generated method stub
		Customer customer = customerRepository.getById(customerID);
		customer.setAddress(address);
		customer.setPhoneNumber(phoneNumber);
		customerRepository.save(customer);
		return customer;
	}

}
