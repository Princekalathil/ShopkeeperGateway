package com.diviso.graeshoppe.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.diviso.graeshoppe.client.customer.domain.Customer;

public interface CustomerQueryService {
	
		
	public Page<Customer> findAllCustomers(Pageable pageable);

	public Page<Customer> findAllCustomersByName(String searchTerm, Pageable pageable);

}
