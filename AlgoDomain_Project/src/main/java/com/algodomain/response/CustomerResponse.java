package com.algodomain.response;

import com.algodomain.dto.CustomerDTO;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomerResponse {

	private boolean error;
	private String msg;
	private CustomerDTO data;
	private Iterable<CustomerDTO> list;

	public CustomerResponse(boolean error, String msg) {
		super();
		this.error = error;
		this.msg = msg;
	}

	public CustomerResponse(boolean error, String msg, CustomerDTO data) {
		super();
		this.error = error;
		this.msg = msg;
		this.data = data;
	}

	public CustomerResponse(boolean error, String msg, Iterable<CustomerDTO> list) {
		super();
		this.error = error;
		this.msg = msg;
		this.list = list;
	}

}
