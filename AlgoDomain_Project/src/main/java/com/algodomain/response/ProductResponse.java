package com.algodomain.response;

import com.algodomain.dto.ProductDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductResponse {

	private boolean error;
	private String msg;
	private ProductDTO data;
	private Iterable<ProductDTO> list;

	public ProductResponse(boolean error, String msg) {
		super();
		this.error = error;
		this.msg = msg;
	}

	public ProductResponse(boolean error, String msg, ProductDTO data) {
		super();
		this.error = error;
		this.msg = msg;
		this.data = data;
	}

	public ProductResponse(boolean error, String msg, Iterable<ProductDTO> list) {
		super();
		this.error = error;
		this.msg = msg;
		this.list = list;
	}
	
}
