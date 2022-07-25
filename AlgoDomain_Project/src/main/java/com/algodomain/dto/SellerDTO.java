package com.algodomain.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Seller_Data")
public class SellerDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7396351163696208206L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int seller_id;
	
	private String seller_name;
	
	private String seller_email;
	

	
}
