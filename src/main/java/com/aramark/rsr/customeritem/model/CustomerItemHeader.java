package com.aramark.rsr.customeritem.model;

import java.util.ArrayList;

public class CustomerItemHeader {

	private ArrayList<CustomerItem> data;
	private String header;

	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public ArrayList<CustomerItem> getData() {
		return data;
	}
	public void setData(ArrayList<CustomerItem> data) {
		this.data = data;
	}
	
}
