package com.example.custapp.customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	List<Customer> customers =  new ArrayList<>( Arrays.asList(
			new Customer("1", "FName1", "LName1", "email1@gmail.com"),
			new Customer("2", "FName2", "LName1", "email2@gmail.com"),
			new Customer("3", "FName3", "LName1", "email3@gmail.com")
			));
	
	public List<Customer> getAllCustomers(){
		return customers;
	}
	
	public Customer getCustomer(String id){
		return customers.stream().filter(c -> c.getId().equals(id)).findFirst().get();
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
		
	}
}
