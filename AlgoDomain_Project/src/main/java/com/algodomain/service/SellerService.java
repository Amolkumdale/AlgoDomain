package com.algodomain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algodomain.dao.SellerDAO;
import com.algodomain.dto.SellerDTO;

@Service
public class SellerService implements SellerServiceInterface{

	@Autowired
	private SellerDAO sellerDAO;

	@Override
	public SellerDTO addSeller(SellerDTO seller) {
		 SellerDTO sellerDTO=sellerDAO.save(seller);
		return seller;
	}

	@Override
	public SellerDTO deleteSeller(SellerDTO seller_id) {
		sellerDAO.delete(seller_id);
		return seller_id;
	}

	
	
	
}
