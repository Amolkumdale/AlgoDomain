package com.algodomain.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.algodomain.dto.ProductDTO;

@Repository
public interface ProductDAO extends CrudRepository<ProductDTO, String>{

}
