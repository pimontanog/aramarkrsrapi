package com.aramark.rsr.emblemswitch.model;

import java.util.ArrayList;

public class EmblemSwitchHeader {

	private ArrayList<EmblemSwitch> data;
	private String header;

	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public ArrayList<EmblemSwitch> getData() {
		return data;
	}
	public void setData(ArrayList<EmblemSwitch> data) {
		this.data = data;
	}	
}
