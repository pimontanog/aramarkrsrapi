package com.aramark.rsr.emblemtypes.model;

import java.io.Serializable;

public class EmblemTypes implements Serializable {

	private static final long serialVersionUID = 1L;

    private String code;
    private String letter_color;
    private String bkgrd_color;
    private String border_color;
    private String description;
    private String cbo_display;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCbo_display() {
		return cbo_display;
	}
	public void setCbo_display(String cbo_display) {
		this.cbo_display = cbo_display;
	}
    
    
}
