package com.aramark.rsr.adjustmentmatrix.model;

import java.io.Serializable;

public class AdjustmentMatrix implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String trans_code_id;
	private String rec_type;
	private String line_type;
	private String item_type;
	private String category_name;
	private String style_name;
	private String svc_line_status;
	private String bill_method;
	private Long credit_code_id;
	private String credit_code;
	private String bill_qty_interactive;
	private String del_qty_interactive;
	private String rts_qty_input;
	private String del_qty_input;
	private String bill_qty_input;
	private String adj_amt_input;
	private String bill_qty_calc_flat;
	private String bill_qty_calc_piece;
	private String svc_calc;
	private String ec_calc;
	private String rts_default;
	private String del_default_0;
	private String del_default_full;
	private String bill_default_0;
	private String bill_default_1;
	private String bill_default_calc;
	private String bill_default_full;
	private String amt_default_calc;
	private String amt_default_full;
	private String exclude_cc;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTrans_code_id() {
		return trans_code_id;
	}
	public void setTrans_code_id(String trans_code_id) {
		this.trans_code_id = trans_code_id;
	}
	public String getRec_type() {
		return rec_type;
	}
	public void setRec_type(String rec_type) {
		this.rec_type = rec_type;
	}
	public String getLine_type() {
		return line_type;
	}
	public void setLine_type(String line_type) {
		this.line_type = line_type;
	}
	public String getItem_type() {
		return item_type;
	}
	public void setItem_type(String item_type) {
		this.item_type = item_type;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getStyle_name() {
		return style_name;
	}
	public void setStyle_name(String style_name) {
		this.style_name = style_name;
	}
	public String getSvc_line_status() {
		return svc_line_status;
	}
	public void setSvc_line_status(String svc_line_status) {
		this.svc_line_status = svc_line_status;
	}
	public String getBill_method() {
		return bill_method;
	}
	public void setBill_method(String bill_method) {
		this.bill_method = bill_method;
	}
	public Long getCredit_code_id() {
		return credit_code_id;
	}
	public void setCredit_code_id(Long credit_code_id) {
		this.credit_code_id = credit_code_id;
	}
	public String getCredit_code() {
		return credit_code;
	}
	public void setCredit_code(String credit_code) {
		this.credit_code = credit_code;
	}
	public String getBill_qty_interactive() {
		return bill_qty_interactive;
	}
	public void setBill_qty_interactive(String bill_qty_interactive) {
		this.bill_qty_interactive = bill_qty_interactive;
	}
	public String getDel_qty_interactive() {
		return del_qty_interactive;
	}
	public void setDel_qty_interactive(String del_qty_interactive) {
		this.del_qty_interactive = del_qty_interactive;
	}
	public String getRts_qty_input() {
		return rts_qty_input;
	}
	public void setRts_qty_input(String rts_qty_input) {
		this.rts_qty_input = rts_qty_input;
	}
	public String getDel_qty_input() {
		return del_qty_input;
	}
	public void setDel_qty_input(String del_qty_input) {
		this.del_qty_input = del_qty_input;
	}
	public String getBill_qty_input() {
		return bill_qty_input;
	}
	public void setBill_qty_input(String bill_qty_input) {
		this.bill_qty_input = bill_qty_input;
	}
	public String getAdj_amt_input() {
		return adj_amt_input;
	}
	public void setAdj_amt_input(String adj_amt_input) {
		this.adj_amt_input = adj_amt_input;
	}
	public String getBill_qty_calc_flat() {
		return bill_qty_calc_flat;
	}
	public void setBill_qty_calc_flat(String bill_qty_calc_flat) {
		this.bill_qty_calc_flat = bill_qty_calc_flat;
	}
	public String getBill_qty_calc_piece() {
		return bill_qty_calc_piece;
	}
	public void setBill_qty_calc_piece(String bill_qty_calc_piece) {
		this.bill_qty_calc_piece = bill_qty_calc_piece;
	}
	public String getSvc_calc() {
		return svc_calc;
	}
	public void setSvc_calc(String svc_calc) {
		this.svc_calc = svc_calc;
	}
	public String getEc_calc() {
		return ec_calc;
	}
	public void setEc_calc(String ec_calc) {
		this.ec_calc = ec_calc;
	}
	public String getRts_default() {
		return rts_default;
	}
	public void setRts_default(String rts_default) {
		this.rts_default = rts_default;
	}
	public String getDel_default_0() {
		return del_default_0;
	}
	public void setDel_default_0(String del_default_0) {
		this.del_default_0 = del_default_0;
	}
	public String getDel_default_full() {
		return del_default_full;
	}
	public void setDel_default_full(String del_default_full) {
		this.del_default_full = del_default_full;
	}
	public String getBill_default_0() {
		return bill_default_0;
	}
	public void setBill_default_0(String bill_default_0) {
		this.bill_default_0 = bill_default_0;
	}
	public String getBill_default_1() {
		return bill_default_1;
	}
	public void setBill_default_1(String bill_default_1) {
		this.bill_default_1 = bill_default_1;
	}
	public String getBill_default_calc() {
		return bill_default_calc;
	}
	public void setBill_default_calc(String bill_default_calc) {
		this.bill_default_calc = bill_default_calc;
	}
	public String getBill_default_full() {
		return bill_default_full;
	}
	public void setBill_default_full(String bill_default_full) {
		this.bill_default_full = bill_default_full;
	}
	public String getAmt_default_calc() {
		return amt_default_calc;
	}
	public void setAmt_default_calc(String amt_default_calc) {
		this.amt_default_calc = amt_default_calc;
	}
	public String getAmt_default_full() {
		return amt_default_full;
	}
	public void setAmt_default_full(String amt_default_full) {
		this.amt_default_full = amt_default_full;
	}
	public String getExclude_cc() {
		return exclude_cc;
	}
	public void setExclude_cc(String exclude_cc) {
		this.exclude_cc = exclude_cc;
	}
	
}
