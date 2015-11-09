package com.aramark.rsr.emblemswitch.model;

import java.io.Serializable;

public class EmblemSwitch implements Serializable {

	private static final long serialVersionUID = 1L;

    private Long id;
    private String code;
    private String descr;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescr() {
		return descr;
	}
	public void setDescr(String descr) {
		this.descr = descr;
	}

}
