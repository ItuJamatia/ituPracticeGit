package com.jiffy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long id;
	
	private String cardNumber;
	
	private String cvv;
	
	private String expirationDate;
	
	
	
}
