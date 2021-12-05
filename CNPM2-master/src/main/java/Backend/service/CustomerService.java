package Backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import Backend.model.Customer;

@Service
public interface CustomerService  {
	public Customer loginFunction(String email,String pass);
	public Customer getCustomerInformation(int customerID);
	public Customer updateCustomer(int customerID,String phoneNumber, String address);
}
