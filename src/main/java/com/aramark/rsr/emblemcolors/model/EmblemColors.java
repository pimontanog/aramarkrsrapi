package com.aramark.rsr.emblemcolors.model;

import java.io.Serializable;

public class EmblemColors implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String code;
	private String desc;
	private String cbo_display;
	private String letter_color;
	private String bkgrd_color;
	private String border_color;
	private Long code_seq;
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
	public String getCbo_display() {
		return cbo_display;
	}
	public void setCbo_display(String cbo_display) {
		this.cbo_display = cbo_display;
	}
	public String getLetter_color() {
		return letter_color;
	}
	public void setLetter_color(String letter_color) {
		this.letter_color = letter_color;
	}
	public String getBkgrd_color() {
		return bkgrd_color;
	}
	public void setBkgrd_color(String bkgrd_color) {
		this.bkgrd_color = bkgrd_color;
	}
	public String getBorder_color() {
		return border_color;
	}
	public void setBorder_color(String border_color) {
		this.border_color = border_color;
	}
	public Long getCode_seq() {
		return code_seq;
	}
	public void setCode_seq(Long code_seq) {
		this.code_seq = code_seq;
	}
	
	
}
