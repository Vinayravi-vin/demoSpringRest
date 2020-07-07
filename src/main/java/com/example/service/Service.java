package com.example.service;

import java.util.List;

import com.example.model.Customer;

public interface Service {

	public List<Customer> getAllCustomer();
	
	public Customer getcustomeById(int id);
	
	public Customer addCustomer(Customer customer);
	
	public void updateCustomer(Customer customer);
	
	public void deleteCustomer(int id);
	
	
	
	
}
