package com.aramark.rsr.adjustmentmatrix.model;

import java.util.ArrayList;

public class AdjustmentMatrixHeader {

	private ArrayList<AdjustmentMatrix> data;
	private String header;

	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public ArrayList<AdjustmentMatrix> getData() {
		return data;
	}
	public void setData(ArrayList<AdjustmentMatrix> data) {
		this.data = data;
	}	
}
