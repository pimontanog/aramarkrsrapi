package com.aramark.rsr.ecarestatus.model;

import java.util.ArrayList;

public class EcareStatusHeader {

	private ArrayList<EcareStatus> data;
	private String header;

	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public ArrayList<EcareStatus> getData() {
		return data;
	}
	public void setData(ArrayList<EcareStatus> data) {
		this.data = data;
	}
}
