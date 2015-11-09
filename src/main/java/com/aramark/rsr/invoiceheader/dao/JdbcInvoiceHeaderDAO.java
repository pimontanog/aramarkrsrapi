package com.aramark.rsr.invoiceheader.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.aramark.rsr.invoiceheader.controller.InvoiceHeaderController;
import com.aramark.rsr.invoiceheader.model.InvoiceHeader;

import oracle.jdbc.OracleTypes;

public class JdbcInvoiceHeaderDAO implements InvoiceHeaderDAO {

	private static final Logger logger = LoggerFactory.getLogger(JdbcInvoiceHeaderDAO.class);
	private DataSource dataSource;
	
	public void setDataSource(DataSource data){
		this.dataSource = data;
	}
	
	public JdbcInvoiceHeaderDAO(DataSource data){
		this.setDataSource(data);
	}
	
	@Override
	public ArrayList<InvoiceHeader> getAllInvoiceHeader(Date pDownloadDate, long pRouteId, long pEmployeeId) {

		Connection conn = null;
		CallableStatement stmt = null;
		ArrayList<InvoiceHeader> inh = new ArrayList<InvoiceHeader>();
		ResultSet rs = null;
		
		try{
			logger.info("inside JdbcInvoiceHeaderDAO");
			conn = dataSource.getConnection();
			stmt = conn.prepareCall("{call PK_GET_INVOICE_HEADER.SP_GET_INVOICE_HEADER(?,?,?,?)}");
            stmt.setDate(1, new java.sql.Date(pDownloadDate.getTime()));
            logger.info(pDownloadDate.toString());
            stmt.setLong(2, pRouteId);
            logger.info(Long.toString(pRouteId));
            stmt.setLong(3, pEmployeeId);
            logger.info(Long.toString(pEmployeeId));
			stmt.registerOutParameter(4, OracleTypes.CURSOR);
             
            stmt.execute();
            rs = (ResultSet) stmt.getObject(4);
            
            logger.info("just before looping cursor");
            while(rs.next()){
            	
            	logger.info("in cursor");
            	InvoiceHeader invh = new InvoiceHeader();
            	invh.setId(rs.getLong("ID"));
            	invh.setRoute_header_id(rs.getLong("ROUTE_HEADER_ID"));
            	invh.setInvoice_date(rs.getString("INVOICE_DATE"));
            	invh.setNumber(rs.getString("NUMBER"));
            	invh.setCustomer_id(rs.getLong("CUSTOMER_ID"));
            	invh.setTerms_code(rs.getString("TERMS_CODE"));
            	invh.setTaxable_customer(rs.getString("TAXABLE_CUSTOMER"));
            	invh.setService_days(rs.getString("SERVICE_DAYS"));
            	invh.setService_weeks(rs.getString("SERVICE_WEEKS"));
            	invh.setPrebilled_amt(rs.getDouble("PREBILLED_AMT"));
            	invh.setAdjustment_amt(rs.getDouble("ADJUSTMENT_AMT"));
            	invh.setCollected_amt(rs.getDouble("COLLECTED_AMT"));
            	invh.setManual_invoice_flag(rs.getString("MANUAL_INVOICE_FLAG"));
            	invh.setAdjustment_counter(rs.getLong("ADJUSTMENT_COUNTER"));
            	invh.setInvoice_credit_code_id(rs.getLong("INVOICE_CREDIT_CODE_ID"));
            	invh.setLpc_code_flag(rs.getString("LPC_CODE_FLAG"));
            	invh.setOffice_adjustment(rs.getDouble("OFFICE_ADJUSTMENT"));
            	invh.setE4w_rental_invoice(rs.getString("E4W_RENTAL_INVOICE"));	
            	invh.setProcessed_flag(rs.getString("PROCESSED_FLAG"));
            	invh.setIrm_generate_flag(rs.getString("IRM_GENERATE_FLAG"));
            	invh.setSpc_irm_requests(rs.getLong("SPC_IRM_REQUESTS"));
            	invh.setTotal_loss_ruin_chrgs(rs.getDouble("TOTAL_LOSS_RUIN_CHRGS"));
            	invh.setNumber_of_pages(rs.getLong("NUMBER_OF_PAGES"));
            	invh.setOriginal_invoice(rs.getString("ORIGINAL_INVOICE"));
            	invh.setOversize_msg_print_flag(rs.getString("OVERSIZE_MSG_PRINT_FLAG"));
            	invh.setRate_control_flag(rs.getString("RATE_CONTROL_FLAG"));
            	invh.setSpecial_rounding_flag(rs.getString("SPECIAL_ROUNDING_FLAG"));
            	invh.setAuto_loss_perc(rs.getDouble("AUTO_LOSS_PERC"));
            	invh.setInvoice_minimum(rs.getDouble("INVOICE_MINIMUM"));
            	invh.setSvc_charge_perc(rs.getDouble("SVC_CHARGE_PERC"));
            	invh.setInv_adj_flag(rs.getString("INV_ADJ_FLAG"));
            	invh.setStatus_id(rs.getLong("STATUS_ID"));
            	invh.setNbr_of_lines_up(rs.getLong("NBR_OF_LINES_UP"));
            	invh.setExplanation(rs.getString("EXPLANATION"));
            	invh.setTax_adjustment_amt(rs.getDouble("TAX_ADJUSTMENT_AMT"));
            	invh.setSvc_adjustment_amt(rs.getDouble("SVC_ADJUSTMENT_AMT"));
            	invh.setTax_amt_1(rs.getDouble("TAX_AMT_1"));
            	invh.setTax_amt_2(rs.getDouble("TAX_AMT_2"));
            	invh.setTax_amt_3(rs.getDouble("TAX_AMT_3"));
            	invh.setTax_amt_4(rs.getDouble("TAX_AMT_4"));
            	invh.setTax_on_1(rs.getDouble("TAX_ON_1"));
            	invh.setTax_on_2(rs.getDouble("TAX_ON_2"));
            	invh.setTax_on_3(rs.getDouble("TAX_ON_3"));
            	invh.setTax_on_4(rs.getDouble("TAX_ON_4"));
            	invh.setTax_perc_1(rs.getDouble("TAX_PERC_1"));
            	invh.setTax_perc_2(rs.getDouble("TAX_PERC_2"));
            	invh.setTax_perc_3(rs.getDouble("TAX_PERC_3"));
            	invh.setTax_perc_4(rs.getDouble("TAX_PERC_4"));
            	invh.setSoil_message_id(rs.getLong("SOIL_MESSAGE_ID"));
            	invh.setSoil_approval_status(rs.getLong("SOIL_APPROVAL_STATUS"));
            	invh.setEc_adjustment_amt(rs.getDouble("EC_ADJUSTMENT_AMT"));
            	invh.setSoil_approval_rank(rs.getString("SOIL_APPROVAL_RANK"));
            	invh.setDisplay_approval_rank(rs.getString("DISPLAY_APPROVAL_RANK"));
            	
            	inh.add(invh);
            }
			
		} catch(Exception ex){
			ex.printStackTrace();
		} finally{
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
		}
		
		return inh;
	}

}
