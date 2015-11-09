package com.aramark.rsr.billingmethod.model;

import java.util.ArrayList;

public class BillingMethodHeader {

	private ArrayList<BillingMethod> data;
	private String header;

	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public ArrayList<BillingMethod> getData() {
		return data;
	}
	public void setData(ArrayList<BillingMethod> data) {
		this.data = data;
	}
	
	
	
}
