package com.aramark.rsr.paymentmethod.model;

import java.util.ArrayList;

public class PaymentMethodHeader {

	private ArrayList<PaymentMethod> data;
	private String header;

	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public ArrayList<PaymentMethod> getData() {
		return data;
	}
	public void setData(ArrayList<PaymentMethod> data) {
		this.data = data;
	}	
}
