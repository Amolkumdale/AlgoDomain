package com.algodomain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algodomain.dao.ProductDAO;
import com.algodomain.dto.ProductDTO;

@Service
public class ProductService implements ProductServiceInterface{

	@Autowired
	private ProductDAO productDAO;

	@Override
	public ProductDTO addProduct(ProductDTO product) {
		 ProductDTO productDTO=productDAO.save(product);
		return product;
	}

	@Override
	public ProductDTO deleteProduct(ProductDTO product_name) {
		productDAO.delete(product_name);
		return product_name;
	}
}
