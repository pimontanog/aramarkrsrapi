package com.aramark.rsr.gradecode.model;

import java.util.ArrayList;

public class GradeCodeHeader {

	private ArrayList<GradeCode> data;
	private String header;

	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public ArrayList<GradeCode> getData() {
		return data;
	}
	public void setData(ArrayList<GradeCode> data) {
		this.data = data;
	}
}
