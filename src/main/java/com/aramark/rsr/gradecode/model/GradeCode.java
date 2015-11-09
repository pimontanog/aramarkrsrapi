package com.aramark.rsr.gradecode.model;

import java.io.Serializable;

public class GradeCode implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String code;
	private String desc;
	private Long display_sequence;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Long getDisplay_sequence() {
		return display_sequence;
	}
	public void setDisplay_sequence(Long display_sequence) {
		this.display_sequence = display_sequence;
	}
	
}
