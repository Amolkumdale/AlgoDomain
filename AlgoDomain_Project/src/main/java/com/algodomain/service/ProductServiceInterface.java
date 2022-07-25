package com.algodomain.service;

import com.algodomain.dto.ProductDTO;

public interface ProductServiceInterface {

	ProductDTO addProduct(ProductDTO product);
	
	ProductDTO deleteProduct(ProductDTO seller_name);
}
