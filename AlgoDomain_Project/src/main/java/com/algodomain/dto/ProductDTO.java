package com.algodomain.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Product_Data")
public class ProductDTO implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 2151824371938455887L;

	@Id
	private String product_name;
	
	private String product_type;
	
	private String product_category;
	
	private double product_price;
}
