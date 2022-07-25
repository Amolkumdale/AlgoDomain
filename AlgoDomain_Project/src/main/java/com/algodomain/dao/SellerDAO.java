package com.algodomain.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.algodomain.dto.SellerDTO;

@Repository
public interface SellerDAO extends CrudRepository<SellerDTO, Integer> {

}
