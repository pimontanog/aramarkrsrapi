package com.aramark.rsr.invoiceheader.model;

import java.util.ArrayList;

public class InvoiceHeaderHeader {

	private ArrayList<InvoiceHeader> data;
	private String header;

	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public ArrayList<InvoiceHeader> getData() {
		return data;
	}
	public void setData(ArrayList<InvoiceHeader> data) {
		this.data = data;
	}
}
