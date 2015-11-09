package com.aramark.rsr.customer.model;

import java.io.Serializable;

public class Customer implements Serializable {
    
	private static final long serialVersionUID = 1L;
    
    private Long id;
    private Long number;
    private Long route_id;
    private Long market_center_id;
    private String master_cust_number;
    private String name;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String service_contact;
    private String terms_code;
    private String garment_mark;
    private String nac_id;
    private String po_number;
    private String po_expire_date;
    private Long invoice_min;
    private String spl_charge_prcnt;
    private Double locker_open_rate;
    private String tax_exempt;
    private String tax_code_1;
    private String tax_code_2;
    private String tax_code_3;
    private String tax_code_4;
    private String account_status;
    private String status_expire_date;
    private String aux_chg_code_1;
    private String aux_chg_rate_1;
    private String aux_chg_code_2;
    private String aux_chg_rate_2;
    private String aux_chg_code_3;
    private String aux_chg_rate_3;
    private String aux_chg_code_4;
    private String aux_chg_rate_4;
    private String aux_chg_code_5;
    private String aux_chg_rate_5;
    private String aux_chg_code_6;
    private String aux_chg_rate_6;
    private String aux_chg_code_7;
    private String aux_chg_rate_7;
    private String aux_chg_code_8;
    private String aux_chg_rate_8;
    private String aux_chg_code_9;
    private String aux_chg_rate_9;
    private Double age_open_0_30;
    private Double age_open_31_60;
    private Double age_open_over_60;
    private String gts_flag;
    private Long stop_no_sat;
    private Long stop_no_sun;
    private Long stop_no_mon;
    private Long stop_no_tue;
    private Long stop_no_wed;
    private Long stop_no_thu;
    private Long stop_no_fri;
    private String con_last_ri_date;
    private String trigger_flag;
    private String import_date;
    private Long sic_id;
    private String ec_status;
    private String ec_start_date;
    private String ec_decline_date;
    private String ec_er_code;
    private String ec_print_code;
    private String ec_hdr_upd_date_time;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	public Long getRoute_id() {
		return route_id;
	}
	public void setRoute_id(Long route_id) {
		this.route_id = route_id;
	}
	public Long getMarket_center_id() {
		return market_center_id;
	}
	public void setMarket_center_id(Long market_center_id) {
		this.market_center_id = market_center_id;
	}
	public String getMaster_cust_number() {
		return master_cust_number;
	}
	public void setMaster_cust_number(String master_cust_number) {
		this.master_cust_number = master_cust_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getService_contact() {
		return service_contact;
	}
	public void setService_contact(String service_contact) {
		this.service_contact = service_contact;
	}
	public String getTerms_code() {
		return terms_code;
	}
	public void setTerms_code(String terms_code) {
		this.terms_code = terms_code;
	}
	public String getGarment_mark() {
		return garment_mark;
	}
	public void setGarment_mark(String garment_mark) {
		this.garment_mark = garment_mark;
	}
	public String getNac_id() {
		return nac_id;
	}
	public void setNac_id(String nac_id) {
		this.nac_id = nac_id;
	}
	public String getPo_number() {
		return po_number;
	}
	public void setPo_number(String po_number) {
		this.po_number = po_number;
	}
	public String getPo_expire_date() {
		return po_expire_date;
	}
	public void setPo_expire_date(String po_expire_date) {
		this.po_expire_date = po_expire_date;
	}
	public Long getInvoice_min() {
		return invoice_min;
	}
	public void setInvoice_min(Long invoice_min) {
		this.invoice_min = invoice_min;
	}
	public String getSpl_charge_prcnt() {
		return spl_charge_prcnt;
	}
	public void setSpl_charge_prcnt(String spl_charge_prcnt) {
		this.spl_charge_prcnt = spl_charge_prcnt;
	}
	public Double getLocker_open_rate() {
		return locker_open_rate;
	}
	public void setLocker_open_rate(Double locker_open_rate) {
		this.locker_open_rate = locker_open_rate;
	}
	public String getTax_exempt() {
		return tax_exempt;
	}
	public void setTax_exempt(String tax_exempt) {
		this.tax_exempt = tax_exempt;
	}
	public String getTax_code_1() {
		return tax_code_1;
	}
	public void setTax_code_1(String tax_code_1) {
		this.tax_code_1 = tax_code_1;
	}
	public String getTax_code_2() {
		return tax_code_2;
	}
	public void setTax_code_2(String tax_code_2) {
		this.tax_code_2 = tax_code_2;
	}
	public String getTax_code_3() {
		return tax_code_3;
	}
	public void setTax_code_3(String tax_code_3) {
		this.tax_code_3 = tax_code_3;
	}
	public String getTax_code_4() {
		return tax_code_4;
	}
	public void setTax_code_4(String tax_code_4) {
		this.tax_code_4 = tax_code_4;
	}
	public String getAccount_status() {
		return account_status;
	}
	public void setAccount_status(String account_status) {
		this.account_status = account_status;
	}
	public String getStatus_expire_date() {
		return status_expire_date;
	}
	public void setStatus_expire_date(String status_expire_date) {
		this.status_expire_date = status_expire_date;
	}
	public String getAux_chg_code_1() {
		return aux_chg_code_1;
	}
	public void setAux_chg_code_1(String aux_chg_code_1) {
		this.aux_chg_code_1 = aux_chg_code_1;
	}
	public String getAux_chg_rate_1() {
		return aux_chg_rate_1;
	}
	public void setAux_chg_rate_1(String aux_chg_rate_1) {
		this.aux_chg_rate_1 = aux_chg_rate_1;
	}
	public String getAux_chg_code_2() {
		return aux_chg_code_2;
	}
	public void setAux_chg_code_2(String aux_chg_code_2) {
		this.aux_chg_code_2 = aux_chg_code_2;
	}
	public String getAux_chg_rate_2() {
		return aux_chg_rate_2;
	}
	public void setAux_chg_rate_2(String aux_chg_rate_2) {
		this.aux_chg_rate_2 = aux_chg_rate_2;
	}
	public String getAux_chg_code_3() {
		return aux_chg_code_3;
	}
	public void setAux_chg_code_3(String aux_chg_code_3) {
		this.aux_chg_code_3 = aux_chg_code_3;
	}
	public String getAux_chg_rate_3() {
		return aux_chg_rate_3;
	}
	public void setAux_chg_rate_3(String aux_chg_rate_3) {
		this.aux_chg_rate_3 = aux_chg_rate_3;
	}
	public String getAux_chg_code_4() {
		return aux_chg_code_4;
	}
	public void setAux_chg_code_4(String aux_chg_code_4) {
		this.aux_chg_code_4 = aux_chg_code_4;
	}
	public String getAux_chg_rate_4() {
		return aux_chg_rate_4;
	}
	public void setAux_chg_rate_4(String aux_chg_rate_4) {
		this.aux_chg_rate_4 = aux_chg_rate_4;
	}
	public String getAux_chg_code_5() {
		return aux_chg_code_5;
	}
	public void setAux_chg_code_5(String aux_chg_code_5) {
		this.aux_chg_code_5 = aux_chg_code_5;
	}
	public String getAux_chg_rate_5() {
		return aux_chg_rate_5;
	}
	public void setAux_chg_rate_5(String aux_chg_rate_5) {
		this.aux_chg_rate_5 = aux_chg_rate_5;
	}
	public String getAux_chg_code_6() {
		return aux_chg_code_6;
	}
	public void setAux_chg_code_6(String aux_chg_code_6) {
		this.aux_chg_code_6 = aux_chg_code_6;
	}
	public String getAux_chg_rate_6() {
		return aux_chg_rate_6;
	}
	public void setAux_chg_rate_6(String aux_chg_rate_6) {
		this.aux_chg_rate_6 = aux_chg_rate_6;
	}
	public String getAux_chg_code_7() {
		return aux_chg_code_7;
	}
	public void setAux_chg_code_7(String aux_chg_code_7) {
		this.aux_chg_code_7 = aux_chg_code_7;
	}
	public String getAux_chg_rate_7() {
		return aux_chg_rate_7;
	}
	public void setAux_chg_rate_7(String aux_chg_rate_7) {
		this.aux_chg_rate_7 = aux_chg_rate_7;
	}
	public String getAux_chg_code_8() {
		return aux_chg_code_8;
	}
	public void setAux_chg_code_8(String aux_chg_code_8) {
		this.aux_chg_code_8 = aux_chg_code_8;
	}
	public String getAux_chg_rate_8() {
		return aux_chg_rate_8;
	}
	public void setAux_chg_rate_8(String aux_chg_rate_8) {
		this.aux_chg_rate_8 = aux_chg_rate_8;
	}
	public String getAux_chg_code_9() {
		return aux_chg_code_9;
	}
	public void setAux_chg_code_9(String aux_chg_code_9) {
		this.aux_chg_code_9 = aux_chg_code_9;
	}
	public String getAux_chg_rate_9() {
		return aux_chg_rate_9;
	}
	public void setAux_chg_rate_9(String aux_chg_rate_9) {
		this.aux_chg_rate_9 = aux_chg_rate_9;
	}
	public Double getAge_open_0_30() {
		return age_open_0_30;
	}
	public void setAge_open_0_30(Double age_open_0_30) {
		this.age_open_0_30 = age_open_0_30;
	}
	public Double getAge_open_31_60() {
		return age_open_31_60;
	}
	public void setAge_open_31_60(Double age_open_31_60) {
		this.age_open_31_60 = age_open_31_60;
	}
	public Double getAge_open_over_60() {
		return age_open_over_60;
	}
	public void setAge_open_over_60(Double age_open_over_60) {
		this.age_open_over_60 = age_open_over_60;
	}
	public String getGts_flag() {
		return gts_flag;
	}
	public void setGts_flag(String gts_flag) {
		this.gts_flag = gts_flag;
	}
	public Long getStop_no_sat() {
		return stop_no_sat;
	}
	public void setStop_no_sat(Long stop_no_sat) {
		this.stop_no_sat = stop_no_sat;
	}
	public Long getStop_no_sun() {
		return stop_no_sun;
	}
	public void setStop_no_sun(Long stop_no_sun) {
		this.stop_no_sun = stop_no_sun;
	}
	public Long getStop_no_mon() {
		return stop_no_mon;
	}
	public void setStop_no_mon(Long stop_no_mon) {
		this.stop_no_mon = stop_no_mon;
	}
	public Long getStop_no_tue() {
		return stop_no_tue;
	}
	public void setStop_no_tue(Long stop_no_tue) {
		this.stop_no_tue = stop_no_tue;
	}
	public Long getStop_no_wed() {
		return stop_no_wed;
	}
	public void setStop_no_wed(Long stop_no_wed) {
		this.stop_no_wed = stop_no_wed;
	}
	public Long getStop_no_thu() {
		return stop_no_thu;
	}
	public void setStop_no_thu(Long stop_no_thu) {
		this.stop_no_thu = stop_no_thu;
	}
	public Long getStop_no_fri() {
		return stop_no_fri;
	}
	public void setStop_no_fri(Long stop_no_fri) {
		this.stop_no_fri = stop_no_fri;
	}
	public String getCon_last_ri_date() {
		return con_last_ri_date;
	}
	public void setCon_last_ri_date(String con_last_ri_date) {
		this.con_last_ri_date = con_last_ri_date;
	}
	public String getTrigger_flag() {
		return trigger_flag;
	}
	public void setTrigger_flag(String trigger_flag) {
		this.trigger_flag = trigger_flag;
	}
	public String getImport_date() {
		return import_date;
	}
	public void setImport_date(String import_date) {
		this.import_date = import_date;
	}
	public Long getSic_id() {
		return sic_id;
	}
	public void setSic_id(Long sic_id) {
		this.sic_id = sic_id;
	}
	public String getEc_status() {
		return ec_status;
	}
	public void setEc_status(String ec_status) {
		this.ec_status = ec_status;
	}
	public String getEc_start_date() {
		return ec_start_date;
	}
	public void setEc_start_date(String ec_start_date) {
		this.ec_start_date = ec_start_date;
	}
	public String getEc_decline_date() {
		return ec_decline_date;
	}
	public void setEc_decline_date(String ec_decline_date) {
		this.ec_decline_date = ec_decline_date;
	}
	public String getEc_er_code() {
		return ec_er_code;
	}
	public void setEc_er_code(String ec_er_code) {
		this.ec_er_code = ec_er_code;
	}
	public String getEc_print_code() {
		return ec_print_code;
	}
	public void setEc_print_code(String ec_print_code) {
		this.ec_print_code = ec_print_code;
	}
	public String getEc_hdr_upd_date_time() {
		return ec_hdr_upd_date_time;
	}
	public void setEc_hdr_upd_date_time(String ec_hdr_upd_date_time) {
		this.ec_hdr_upd_date_time = ec_hdr_upd_date_time;
	}
       
    
}
