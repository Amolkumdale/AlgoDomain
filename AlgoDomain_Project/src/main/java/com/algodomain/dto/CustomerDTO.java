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
@Table(name = "Customer_Data")
public class CustomerDTO implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 8876401261603074530L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customer_id;
	
	private String customer_name;

	private String customer_email;

	private long customer_phNo;

	private String customer_address;

}
