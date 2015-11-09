package com.aramark.rsr.invoiceheader.model;

import java.io.Serializable;
import java.util.Date;

public class InvoiceHeader implements Serializable {

	private static final long serialVersionUID = 1L;
    private Long id;
    private Long route_header_id;
    private String invoice_date;
    private String number;
    private Long customer_id;
    private String terms_code;
    private String taxable_customer;
    private String service_days;
    private String service_weeks;
    private Double prebilled_amt;
    private Double adjustment_amt;
    private Double collected_amt;
    private String manual_invoice_flag;
    private Long adjustment_counter;
    private Long invoice_credit_code_id;
    private String lpc_code_flag;
    private Double office_adjustment;
    private String e4w_rental_invoice;
    private String processed_flag;
    private String irm_generate_flag;
    private Long spc_irm_requests;
    private Double total_loss_ruin_chrgs;
    private Long number_of_pages;
    private String original_invoice;
    private String oversize_msg_print_flag;
    private String rate_control_flag;
    private String special_rounding_flag;
    private Double auto_loss_perc;
    private Double invoice_minimum;
    private Double svc_charge_perc;
    private String inv_adj_flag;
    private Long status_id;
    private Long nbr_of_lines_up;
    private String explanation;
    private Double tax_adjustment_amt;
    private Double svc_adjustment_amt;
    private Double tax_amt_1;
    private Double tax_amt_2;
    private Double tax_amt_3;
    private Double tax_amt_4;
    private Double tax_on_1;
    private Double tax_on_2;
    private Double tax_on_3;
    private Double tax_on_4;
    private Double tax_perc_1;
    private Double tax_perc_2;
    private Double tax_perc_3;
    private Double tax_perc_4;
    private Long soil_message_id;
    private Long soil_approval_status;
    private Double ec_adjustment_amt;
    private String soil_approval_rank;
    private String display_approval_rank;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getRoute_header_id() {
		return route_header_id;
	}
	public void setRoute_header_id(Long route_header_id) {
		this.route_header_id = route_header_id;
	}
	public String getInvoice_date() {
		return invoice_date;
	}
	public void setInvoice_date(String invoice_date) {
		this.invoice_date = invoice_date;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Long getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	public String getTerms_code() {
		return terms_code;
	}
	public void setTerms_code(String terms_code) {
		this.terms_code = terms_code;
	}
	public String getTaxable_customer() {
		return taxable_customer;
	}
	public void setTaxable_customer(String taxable_customer) {
		this.taxable_customer = taxable_customer;
	}
	public String getService_days() {
		return service_days;
	}
	public void setService_days(String service_days) {
		this.service_days = service_days;
	}
	public String getService_weeks() {
		return service_weeks;
	}
	public void setService_weeks(String service_weeks) {
		this.service_weeks = service_weeks;
	}
	public Double getPrebilled_amt() {
		return prebilled_amt;
	}
	public void setPrebilled_amt(Double prebilled_amt) {
		this.prebilled_amt = prebilled_amt;
	}
	public Double getAdjustment_amt() {
		return adjustment_amt;
	}
	public void setAdjustment_amt(Double adjustment_amt) {
		this.adjustment_amt = adjustment_amt;
	}
	public Double getCollected_amt() {
		return collected_amt;
	}
	public void setCollected_amt(Double collected_amt) {
		this.collected_amt = collected_amt;
	}
	public String getManual_invoice_flag() {
		return manual_invoice_flag;
	}
	public void setManual_invoice_flag(String manual_invoice_flag) {
		this.manual_invoice_flag = manual_invoice_flag;
	}
	public Long getAdjustment_counter() {
		return adjustment_counter;
	}
	public void setAdjustment_counter(Long adjustment_counter) {
		this.adjustment_counter = adjustment_counter;
	}
	public Long getInvoice_credit_code_id() {
		return invoice_credit_code_id;
	}
	public void setInvoice_credit_code_id(Long invoice_credit_code_id) {
		this.invoice_credit_code_id = invoice_credit_code_id;
	}
	public String getLpc_code_flag() {
		return lpc_code_flag;
	}
	public void setLpc_code_flag(String lpc_code_flag) {
		this.lpc_code_flag = lpc_code_flag;
	}
	public Double getOffice_adjustment() {
		return office_adjustment;
	}
	public void setOffice_adjustment(Double office_adjustment) {
		this.office_adjustment = office_adjustment;
	}
	public String getE4w_rental_invoice() {
		return e4w_rental_invoice;
	}
	public void setE4w_rental_invoice(String e4w_rental_invoice) {
		this.e4w_rental_invoice = e4w_rental_invoice;
	}
	public String getProcessed_flag() {
		return processed_flag;
	}
	public void setProcessed_flag(String processed_flag) {
		this.processed_flag = processed_flag;
	}
	public String getIrm_generate_flag() {
		return irm_generate_flag;
	}
	public void setIrm_generate_flag(String irm_generate_flag) {
		this.irm_generate_flag = irm_generate_flag;
	}
	public Long getSpc_irm_requests() {
		return spc_irm_requests;
	}
	public void setSpc_irm_requests(Long spc_irm_requests) {
		this.spc_irm_requests = spc_irm_requests;
	}
	public Double getTotal_loss_ruin_chrgs() {
		return total_loss_ruin_chrgs;
	}
	public void setTotal_loss_ruin_chrgs(Double total_loss_ruin_chrgs) {
		this.total_loss_ruin_chrgs = total_loss_ruin_chrgs;
	}
	public Long getNumber_of_pages() {
		return number_of_pages;
	}
	public void setNumber_of_pages(Long number_of_pages) {
		this.number_of_pages = number_of_pages;
	}
	public String getOriginal_invoice() {
		return original_invoice;
	}
	public void setOriginal_invoice(String original_invoice) {
		this.original_invoice = original_invoice;
	}
	public String getOversize_msg_print_flag() {
		return oversize_msg_print_flag;
	}
	public void setOversize_msg_print_flag(String oversize_msg_print_flag) {
		this.oversize_msg_print_flag = oversize_msg_print_flag;
	}
	public String getRate_control_flag() {
		return rate_control_flag;
	}
	public void setRate_control_flag(String rate_control_flag) {
		this.rate_control_flag = rate_control_flag;
	}
	public String getSpecial_rounding_flag() {
		return special_rounding_flag;
	}
	public void setSpecial_rounding_flag(String special_rounding_flag) {
		this.special_rounding_flag = special_rounding_flag;
	}
	public Double getAuto_loss_perc() {
		return auto_loss_perc;
	}
	public void setAuto_loss_perc(Double auto_loss_perc) {
		this.auto_loss_perc = auto_loss_perc;
	}
	public Double getInvoice_minimum() {
		return invoice_minimum;
	}
	public void setInvoice_minimum(Double invoice_minimum) {
		this.invoice_minimum = invoice_minimum;
	}
	public Double getSvc_charge_perc() {
		return svc_charge_perc;
	}
	public void setSvc_charge_perc(Double svc_charge_perc) {
		this.svc_charge_perc = svc_charge_perc;
	}
	public String getInv_adj_flag() {
		return inv_adj_flag;
	}
	public void setInv_adj_flag(String inv_adj_flag) {
		this.inv_adj_flag = inv_adj_flag;
	}
	public Long getStatus_id() {
		return status_id;
	}
	public void setStatus_id(Long status_id) {
		this.status_id = status_id;
	}
	public Long getNbr_of_lines_up() {
		return nbr_of_lines_up;
	}
	public void setNbr_of_lines_up(Long nbr_of_lines_up) {
		this.nbr_of_lines_up = nbr_of_lines_up;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public Double getTax_adjustment_amt() {
		return tax_adjustment_amt;
	}
	public void setTax_adjustment_amt(Double tax_adjustment_amt) {
		this.tax_adjustment_amt = tax_adjustment_amt;
	}
	public Double getSvc_adjustment_amt() {
		return svc_adjustment_amt;
	}
	public void setSvc_adjustment_amt(Double svc_adjustment_amt) {
		this.svc_adjustment_amt = svc_adjustment_amt;
	}
	public Double getTax_amt_1() {
		return tax_amt_1;
	}
	public void setTax_amt_1(Double tax_amt_1) {
		this.tax_amt_1 = tax_amt_1;
	}
	public Double getTax_amt_2() {
		return tax_amt_2;
	}
	public void setTax_amt_2(Double tax_amt_2) {
		this.tax_amt_2 = tax_amt_2;
	}
	public Double getTax_amt_3() {
		return tax_amt_3;
	}
	public void setTax_amt_3(Double tax_amt_3) {
		this.tax_amt_3 = tax_amt_3;
	}
	public Double getTax_amt_4() {
		return tax_amt_4;
	}
	public void setTax_amt_4(Double tax_amt_4) {
		this.tax_amt_4 = tax_amt_4;
	}
	public Double getTax_on_1() {
		return tax_on_1;
	}
	public void setTax_on_1(Double tax_on_1) {
		this.tax_on_1 = tax_on_1;
	}
	public Double getTax_on_2() {
		return tax_on_2;
	}
	public void setTax_on_2(Double tax_on_2) {
		this.tax_on_2 = tax_on_2;
	}
	public Double getTax_on_3() {
		return tax_on_3;
	}
	public void setTax_on_3(Double tax_on_3) {
		this.tax_on_3 = tax_on_3;
	}
	public Double getTax_on_4() {
		return tax_on_4;
	}
	public void setTax_on_4(Double tax_on_4) {
		this.tax_on_4 = tax_on_4;
	}
	public Double getTax_perc_1() {
		return tax_perc_1;
	}
	public void setTax_perc_1(Double tax_perc_1) {
		this.tax_perc_1 = tax_perc_1;
	}
	public Double getTax_perc_2() {
		return tax_perc_2;
	}
	public void setTax_perc_2(Double tax_perc_2) {
		this.tax_perc_2 = tax_perc_2;
	}
	public Double getTax_perc_3() {
		return tax_perc_3;
	}
	public void setTax_perc_3(Double tax_perc_3) {
		this.tax_perc_3 = tax_perc_3;
	}
	public Double getTax_perc_4() {
		return tax_perc_4;
	}
	public void setTax_perc_4(Double tax_perc_4) {
		this.tax_perc_4 = tax_perc_4;
	}
	public Long getSoil_message_id() {
		return soil_message_id;
	}
	public void setSoil_message_id(Long soil_message_id) {
		this.soil_message_id = soil_message_id;
	}
	public Long getSoil_approval_status() {
		return soil_approval_status;
	}
	public void setSoil_approval_status(Long soil_approval_status) {
		this.soil_approval_status = soil_approval_status;
	}
	public Double getEc_adjustment_amt() {
		return ec_adjustment_amt;
	}
	public void setEc_adjustment_amt(Double ec_adjustment_amt) {
		this.ec_adjustment_amt = ec_adjustment_amt;
	}
	public String getSoil_approval_rank() {
		return soil_approval_rank;
	}
	public void setSoil_approval_rank(String soil_approval_rank) {
		this.soil_approval_rank = soil_approval_rank;
	}
	public String getDisplay_approval_rank() {
		return display_approval_rank;
	}
	public void setDisplay_approval_rank(String display_approval_rank) {
		this.display_approval_rank = display_approval_rank;
	}
    

	
}

