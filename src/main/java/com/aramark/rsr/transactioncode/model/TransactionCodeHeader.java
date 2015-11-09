package com.aramark.rsr.transactioncode.model;

import java.util.ArrayList;

public class TransactionCodeHeader {

	private ArrayList<TransactionCode> data;
	private String header;

	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public ArrayList<TransactionCode> getData() {
		return data;
	}
	public void setData(ArrayList<TransactionCode> data) {
		this.data = data;
	}	
}
