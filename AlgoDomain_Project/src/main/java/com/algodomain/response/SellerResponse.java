package com.algodomain.response;

import com.algodomain.dto.SellerDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SellerResponse {

	private boolean error;
	private String msg;
	private SellerDTO data;
	private Iterable<SellerDTO> list;

	public SellerResponse(boolean error, String msg) {
		super();
		this.error = error;
		this.msg = msg;
	}

	public SellerResponse(boolean error, String msg, SellerDTO data) {
		super();
		this.error = error;
		this.msg = msg;
		this.data = data;
	}

	public SellerResponse(boolean error, String msg, Iterable<SellerDTO> list) {
		super();
		this.error = error;
		this.msg = msg;
		this.list = list;
	}
}
