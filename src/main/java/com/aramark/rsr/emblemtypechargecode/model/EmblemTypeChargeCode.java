package com.aramark.rsr.emblemtypechargecode.model;

import java.io.Serializable;

public class EmblemTypeChargeCode implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String type_code;
	private String charge_code;
	private Long search_sequence;
	
	public String getType_code() {
		return type_code;
	}
	public void setType_code(String type_code) {
		this.type_code = type_code;
	}
	public String getCharge_code() {
		return charge_code;
	}
	public void setCharge_code(String charge_code) {
		this.charge_code = charge_code;
	}
	public Long getSearch_sequence() {
		return search_sequence;
	}
	public void setSearch_sequence(Long search_sequence) {
		this.search_sequence = search_sequence;
	}
	
}
