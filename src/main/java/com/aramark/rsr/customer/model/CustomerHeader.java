package com.aramark.rsr.customer.model;

import java.util.ArrayList;

public class CustomerHeader {

	private ArrayList<Customer> data;
	private String header;

	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public ArrayList<Customer> getData() {
		return data;
	}
	public void setData(ArrayList<Customer> data) {
		this.data = data;
	}

}
