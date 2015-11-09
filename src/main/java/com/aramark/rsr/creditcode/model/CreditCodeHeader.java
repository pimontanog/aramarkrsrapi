package com.aramark.rsr.creditcode.model;

import java.util.ArrayList;

public class CreditCodeHeader {

	private ArrayList<CreditCode> data;
	private String header;

	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public ArrayList<CreditCode> getData() {
		return data;
	}
	public void setData(ArrayList<CreditCode> data) {
		this.data = data;
	}	
}
