package com.aramark.rsr.transactioncode.model;

import java.io.Serializable;

public class TransactionCode implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String code;
	private String bill_sub_tran_code;
	private String name;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getBill_sub_tran_code() {
		return bill_sub_tran_code;
	}
	public void setBill_sub_tran_code(String bill_sub_tran_code) {
		this.bill_sub_tran_code = bill_sub_tran_code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
