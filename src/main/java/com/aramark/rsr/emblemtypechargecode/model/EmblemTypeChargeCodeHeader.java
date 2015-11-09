package com.aramark.rsr.emblemtypechargecode.model;

import java.util.ArrayList;

public class EmblemTypeChargeCodeHeader {

	private ArrayList<EmblemTypeChargeCode> data;
	private String header;

	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public ArrayList<EmblemTypeChargeCode> getData() {
		return data;
	}
	public void setData(ArrayList<EmblemTypeChargeCode> data) {
		this.data = data;
	}
}
