package com.aramark.rsr.paymentmethod.model;

import java.io.Serializable;

public class PaymentMethod implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String method;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
}
