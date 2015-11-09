package com.aramark.rsr.customeritem.model;

import java.io.Serializable;
import java.util.Date;

public class CustomerItem implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long customer_id;
    private Long line_number;
    private String line_status;
    private String svc_week;
    private String svc_days;
    private String transaction_code;
    private Long id;
    private String sub_trans_code;
    private String num_puc_to_print;
    private String billing_code;
    private String salesperson;
    private String svc_begin_date;
    private String termination_date;
    private Long item_id;
    private Long wearer_id;
    private Long inv_qty;
    private String grade_code;
    private String swing_back_in;
    private String swing_back_out;
    private Long swing_back_quantity;
    private Double replacement_pct;
    private String delivery_method;
    private String billing_method;
    private Double flat_rate;
    private Long flat_quantity;
    private Double piece_rate;
    private Double percent_inv;
    private Double replace_rate;
    private String emblem_switch;
    private String chg_date;
    private String frequency_code;
    private String status;
    private String hh_new_flag;
	private String svc_week1;
    private String svc_week2;
    private String svc_week3;
    private String svc_week4;
    private String svc_day1;
    private String svc_day2;
    private String svc_day3;
    private String svc_day4;
    private String svc_day5;
    private String svc_day6;
    private String svc_day7;
    private Short keeprecatserver;
    private String import_date;
    private Short logical_del_flag;
    private String trigger_flag;
    private Double effective_piece_rate;
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public Long getLine_number() {
		return line_number;
	}
	public void setLine_number(Long line_number) {
		this.line_number = line_number;
	}
	public String getLine_status() {
		return line_status;
	}
	public void setLine_status(String line_status) {
		this.line_status = line_status;
	}
	public String getSvc_week() {
		return svc_week;
	}
	public void setSvc_week(String svc_week) {
		this.svc_week = svc_week;
	}
	public String getSvc_days() {
		return svc_days;
	}
	public void setSvc_days(String svc_days) {
		this.svc_days = svc_days;
	}
	public String getTransaction_code() {
		return transaction_code;
	}
	public void setTransaction_code(String transaction_code) {
		this.transaction_code = transaction_code;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSub_trans_code() {
		return sub_trans_code;
	}
	public void setSub_trans_code(String sub_trans_code) {
		this.sub_trans_code = sub_trans_code;
	}
	public String getNum_puc_to_print() {
		return num_puc_to_print;
	}
	public void setNum_puc_to_print(String num_puc_to_print) {
		this.num_puc_to_print = num_puc_to_print;
	}
	public String getBilling_code() {
		return billing_code;
	}
	public void setBilling_code(String billing_code) {
		this.billing_code = billing_code;
	}
	public String getSalesperson() {
		return salesperson;
	}
	public void setSalesperson(String salesperson) {
		this.salesperson = salesperson;
	}
	public String getSvc_begin_date() {
		return svc_begin_date;
	}
	public void setSvc_begin_date(String svc_begin_date) {
		this.svc_begin_date = svc_begin_date;
	}
	public String getTermination_date() {
		return termination_date;
	}
	public void setTermination_date(String termination_date) {
		this.termination_date = termination_date;
	}
	public Long getItem_id() {
		return item_id;
	}
	public void setItem_id(Long item_id) {
		this.item_id = item_id;
	}
	public Long getWearer_id() {
		return wearer_id;
	}
	public void setWearer_id(Long wearer_id) {
		this.wearer_id = wearer_id;
	}
	public Long getInv_qty() {
		return inv_qty;
	}
	public void setInv_qty(Long inv_qty) {
		this.inv_qty = inv_qty;
	}
	public String getGrade_code() {
		return grade_code;
	}
	public void setGrade_code(String grade_code) {
		this.grade_code = grade_code;
	}
	public String getSwing_back_in() {
		return swing_back_in;
	}
	public void setSwing_back_in(String swing_back_in) {
		this.swing_back_in = swing_back_in;
	}
	public String getSwing_back_out() {
		return swing_back_out;
	}
	public void setSwing_back_out(String swing_back_out) {
		this.swing_back_out = swing_back_out;
	}
	public Long getSwing_back_quantity() {
		return swing_back_quantity;
	}
	public void setSwing_back_quantity(Long swing_back_quantity) {
		this.swing_back_quantity = swing_back_quantity;
	}
	public Double getReplacement_pct() {
		return replacement_pct;
	}
	public void setReplacement_pct(Double replacement_pct) {
		this.replacement_pct = replacement_pct;
	}
	public String getDelivery_method() {
		return delivery_method;
	}
	public void setDelivery_method(String delivery_method) {
		this.delivery_method = delivery_method;
	}
	public String getBilling_method() {
		return billing_method;
	}
	public void setBilling_method(String billing_method) {
		this.billing_method = billing_method;
	}
	public Double getFlat_rate() {
		return flat_rate;
	}
	public void setFlat_rate(Double flat_rate) {
		this.flat_rate = flat_rate;
	}
	public Long getFlat_quantity() {
		return flat_quantity;
	}
	public void setFlat_quantity(Long flat_quantity) {
		this.flat_quantity = flat_quantity;
	}
	public Double getPiece_rate() {
		return piece_rate;
	}
	public void setPiece_rate(Double piece_rate) {
		this.piece_rate = piece_rate;
	}
	public Double getPercent_inv() {
		return percent_inv;
	}
	public void setPercent_inv(Double percent_inv) {
		this.percent_inv = percent_inv;
	}
	public Double getReplace_rate() {
		return replace_rate;
	}
	public void setReplace_rate(Double replace_rate) {
		this.replace_rate = replace_rate;
	}
	public String getEmblem_switch() {
		return emblem_switch;
	}
	public void setEmblem_switch(String emblem_switch) {
		this.emblem_switch = emblem_switch;
	}
	public String getChg_date() {
		return chg_date;
	}
	public void setChg_date(String chg_date) {
		this.chg_date = chg_date;
	}
	public String getFrequency_code() {
		return frequency_code;
	}
	public void setFrequency_code(String frequency_code) {
		this.frequency_code = frequency_code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getHh_new_flag() {
		return hh_new_flag;
	}
	public void setHh_new_flag(String hh_new_flag) {
		this.hh_new_flag = hh_new_flag;
	}
	public String getSvc_week1() {
		return svc_week1;
	}
	public void setSvc_week1(String svc_week1) {
		this.svc_week1 = svc_week1;
	}
	public String getSvc_week2() {
		return svc_week2;
	}
	public void setSvc_week2(String svc_week2) {
		this.svc_week2 = svc_week2;
	}
	public String getSvc_week3() {
		return svc_week3;
	}
	public void setSvc_week3(String svc_week3) {
		this.svc_week3 = svc_week3;
	}
	public String getSvc_week4() {
		return svc_week4;
	}
	public void setSvc_week4(String svc_week4) {
		this.svc_week4 = svc_week4;
	}
	public String getSvc_day1() {
		return svc_day1;
	}
	public void setSvc_day1(String svc_day1) {
		this.svc_day1 = svc_day1;
	}
	public String getSvc_day2() {
		return svc_day2;
	}
	public void setSvc_day2(String svc_day2) {
		this.svc_day2 = svc_day2;
	}
	public String getSvc_day3() {
		return svc_day3;
	}
	public void setSvc_day3(String svc_day3) {
		this.svc_day3 = svc_day3;
	}
	public String getSvc_day4() {
		return svc_day4;
	}
	public void setSvc_day4(String svc_day4) {
		this.svc_day4 = svc_day4;
	}
	public String getSvc_day5() {
		return svc_day5;
	}
	public void setSvc_day5(String svc_day5) {
		this.svc_day5 = svc_day5;
	}
	public String getSvc_day6() {
		return svc_day6;
	}
	public void setSvc_day6(String svc_day6) {
		this.svc_day6 = svc_day6;
	}
	public String getSvc_day7() {
		return svc_day7;
	}
	public void setSvc_day7(String svc_day7) {
		this.svc_day7 = svc_day7;
	}
	public Short getKeeprecatserver() {
		return keeprecatserver;
	}
	public void setKeeprecatserver(Short keeprecatserver) {
		this.keeprecatserver = keeprecatserver;
	}
	public String getImport_date() {
		return import_date;
	}
	public void setImport_date(String import_date) {
		this.import_date = import_date;
	}
	public Short getLogical_del_flag() {
		return logical_del_flag;
	}
	public void setLogical_del_flag(Short logical_del_flag) {
		this.logical_del_flag = logical_del_flag;
	}
	public String getTrigger_flag() {
		return trigger_flag;
	}
	public void setTrigger_flag(String trigger_flag) {
		this.trigger_flag = trigger_flag;
	}
	public Double getEffective_piece_rate() {
		return effective_piece_rate;
	}
	public void setEffective_piece_rate(Double effective_piece_rate) {
		this.effective_piece_rate = effective_piece_rate;
	}

}
