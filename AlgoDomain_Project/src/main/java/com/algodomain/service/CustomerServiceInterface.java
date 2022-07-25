package com.algodomain.service;

import com.algodomain.dto.CustomerDTO;

public interface CustomerServiceInterface {

	CustomerDTO addCustomer(CustomerDTO customer);
	
	CustomerDTO deleteCustomer(CustomerDTO customer_id);
}
