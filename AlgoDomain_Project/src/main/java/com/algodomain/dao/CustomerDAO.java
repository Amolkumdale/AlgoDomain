package com.algodomain.dao;

import org.springframework.data.repository.CrudRepository;

import com.algodomain.dto.CustomerDTO;

public interface CustomerDAO extends CrudRepository<CustomerDTO, Integer> {

}
