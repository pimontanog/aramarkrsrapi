package com.aramark.rsr.deliverymethod.model;

import java.util.ArrayList;

public class DeliveryMethodHeader {

	private ArrayList<DeliveryMethod> data;
	private String header;

	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public ArrayList<DeliveryMethod> getData() {
		return data;
	}
	public void setData(ArrayList<DeliveryMethod> data) {
		this.data = data;
	}	
}
