package com.algodomain.service;

import com.algodomain.dto.SellerDTO;

public interface SellerServiceInterface {

	SellerDTO addSeller(SellerDTO seller);

	SellerDTO deleteSeller(SellerDTO seller_id);
}
