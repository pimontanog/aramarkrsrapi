package com.aramark.rsr.emblemtypes.model;

import java.util.ArrayList;

public class EmblemTypesHeader {

	private ArrayList<EmblemTypes> data;
	private String header;

	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public ArrayList<EmblemTypes> getData() {
		return data;
	}
	public void setData(ArrayList<EmblemTypes> data) {
		this.data = data;
	}	
}
