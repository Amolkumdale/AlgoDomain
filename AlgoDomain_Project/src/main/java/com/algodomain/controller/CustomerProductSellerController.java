package com.algodomain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.algodomain.dto.CustomerDTO;
import com.algodomain.dto.ProductDTO;
import com.algodomain.dto.SellerDTO;
import com.algodomain.response.CustomerResponse;
import com.algodomain.response.ProductResponse;
import com.algodomain.response.SellerResponse;
import com.algodomain.service.CustomerService;
import com.algodomain.service.ProductService;
import com.algodomain.service.SellerService;

@RestController
public class CustomerProductSellerController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private SellerService sellerService;
	
	@Autowired
	private CustomerService customerService;
	
	
	
	// To Add a new Customer
	
	@PostMapping("/addCustomer")
	public ResponseEntity<CustomerResponse> addCustomer(@RequestBody CustomerDTO customerDTO){
		CustomerDTO dto=customerService.addCustomer(customerDTO);
		if(dto!=null) {
			return new ResponseEntity<CustomerResponse>(new CustomerResponse(false,"Customer Added Successfully..!",dto),HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<CustomerResponse>(new CustomerResponse(true, "Not Added Please try Again..!"),HttpStatus.BAD_REQUEST);
	}
	
	
	
	
	//To Delete a Customer using primary key(customer_id)
	
	@DeleteMapping("/deleteCustomer")
	public ResponseEntity<CustomerResponse> deleteCustomer(@RequestBody CustomerDTO customer_id){
		CustomerDTO dto=customerService.deleteCustomer(customer_id);
		if(dto!=null) {
			return new ResponseEntity<CustomerResponse>(new CustomerResponse(false, "Customer Deleted"),HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<CustomerResponse>(new CustomerResponse(true, "Customer Deleted Please try again..!"),HttpStatus.BAD_REQUEST);
	}
	

	
	//  To Add new Seller 
	
		@PostMapping("/addSeller")
		public ResponseEntity<SellerResponse> addSeller(@RequestBody SellerDTO sellerDTO){
			SellerDTO dto=sellerService.addSeller(sellerDTO);
			if(dto!=null) {
				return new ResponseEntity<SellerResponse>(new SellerResponse(false,"Seller Added Successfully..!",dto),HttpStatus.ACCEPTED);
			}
			return new ResponseEntity<SellerResponse>(new SellerResponse(true, "Not Added Please try Again..!"),HttpStatus.BAD_REQUEST);
		}
	
	
	
	// Deleting Seller using primary key(seller_id)
	@DeleteMapping("/deleteSeller")
	public ResponseEntity<SellerResponse> deleteSeller(@RequestBody SellerDTO seller_id){
		SellerDTO dto=sellerService.deleteSeller(seller_id);
		if(dto!=null) {
			return new ResponseEntity<SellerResponse>(new SellerResponse(false, "Seller Deleted"),HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<SellerResponse>(new SellerResponse(true, "Seller Deleted Please try again..!"),HttpStatus.BAD_REQUEST);
	}
	
	
	// Adding new product
		@PostMapping("/addProduct")
		public ResponseEntity<ProductResponse> addProduct(@RequestBody ProductDTO productDTO){
			ProductDTO dto=productService.addProduct(productDTO);
			if(dto!=null) {
				return new ResponseEntity<ProductResponse>(new ProductResponse(false,"Product Added Successfully..!",dto),HttpStatus.ACCEPTED);
			}
			return new ResponseEntity<ProductResponse>(new ProductResponse(true, "Not Added Please try Again..!"),HttpStatus.BAD_REQUEST);
		}
	
	
	// Deleting Product using primary key(product_name)
	@DeleteMapping("/deleteProduct")
	public ResponseEntity<ProductResponse> deleteProduct(@RequestBody ProductDTO product_name){
		ProductDTO dto=productService.deleteProduct(product_name);
		if(dto!=null) {
			return new ResponseEntity<ProductResponse>(new ProductResponse(false, "Product Deleted"),HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<ProductResponse>(new ProductResponse(true, "Product Deleted Please try again..!"),HttpStatus.BAD_REQUEST);
	}
}
