package Backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Backend.model.Customer;
import Backend.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	/*
	 * API loginCustomer: Handle login request from customer
	 * param1: customer's email
	 * param2: customer's password
	 * returned value: (JSON) a Customer object contain customer's information if login successful or NULL if login failed
	 */
	@GetMapping(value = "/login")
	public Customer loginCustomer(@RequestParam("email")String email, @RequestParam("pass")String pass)
	{
		return customerService.loginFunction(email, pass);
	}
	
	/*
	 * API getInfor: Get personal information
	 * param1: customer's ID
	 * returned value: (JSON) a Customer object contain customer's information if ID customer exists or NULL if not exists
	 */
	@GetMapping(value="/home/personal-Information/{customerID}")
	public Customer getInfor(@PathVariable("customerID") int customerID)
	{
		return customerService.getCustomerInformation(customerID);
	}
	
	/*
	 * API updateCustomer: Update customer's information(only phone number and address)
	 * param1: phone Number
	 * param2: address
	 * returned value: (JSON) a Customer object contain customer's information with iNformation after being updated
	 */
	@PutMapping(value="home/personal-change")
	public Customer updateCustomer(@RequestParam("customerID") int customerID, @RequestParam("phoneNumber") String phoneNumber, @RequestParam("address") String address)
	{
		return customerService.updateCustomer(customerID, phoneNumber, address);
	}
}
