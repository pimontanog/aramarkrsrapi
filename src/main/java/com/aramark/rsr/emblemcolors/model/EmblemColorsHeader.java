package com.aramark.rsr.emblemcolors.model;

import java.util.ArrayList;

public class EmblemColorsHeader {

	private ArrayList<EmblemColors> data;
	private String header;

	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public ArrayList<EmblemColors> getData() {
		return data;
	}
	public void setData(ArrayList<EmblemColors> data) {
		this.data = data;
	}
}
