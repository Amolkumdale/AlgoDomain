package com.algodomain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algodomain.dao.CustomerDAO;
import com.algodomain.dto.CustomerDTO;

@Service
public class CustomerService implements CustomerServiceInterface{

	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public CustomerDTO addCustomer(CustomerDTO customer) {
		 CustomerDTO dto=customerDAO.save(customer);
		return dto;
	}

	@Override
	public CustomerDTO deleteCustomer(CustomerDTO customer_id) {
		 customerDAO.delete(customer_id);
		return customer_id;
	}
	
	
}
