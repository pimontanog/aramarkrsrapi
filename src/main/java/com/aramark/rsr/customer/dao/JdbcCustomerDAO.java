package com.aramark.rsr.customer.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;
import oracle.jdbc.OracleTypes;
import com.aramark.rsr.customer.model.Customer;

public class JdbcCustomerDAO implements CustomerDAO {

	private DataSource dataSource;
	
	public void setDataSource(DataSource data){
		this.dataSource = data;
	}
	
	public JdbcCustomerDAO(DataSource data){
		this.setDataSource(data);
	}
	
	@Override
	public ArrayList<Customer> getAllCustomer(long pRouteId) {

		Connection conn = null;
		CallableStatement stmt = null;
		ArrayList<Customer> cust = new ArrayList<Customer>();
		ResultSet rs = null;

		try{
			conn = dataSource.getConnection();
			stmt = conn.prepareCall("{call PK_GET_CUSTS.SP_GET_CUSTS(?,?)}");
            stmt.setLong(1, pRouteId);
            stmt.registerOutParameter(2, OracleTypes.CURSOR);
             
            stmt.execute();
            rs = (ResultSet) stmt.getObject(2);

            while(rs.next()){
            	
            	Customer customer = new Customer();

            	customer.setId(rs.getLong("ID"));
            	customer.setNumber(rs.getLong("NUMBER"));
            	customer.setRoute_id(rs.getLong("ROUTE_ID"));
            	customer.setMarket_center_id(rs.getLong("MARKET_CENTER_ID"));
            	customer.setMaster_cust_number(rs.getString("MASTER_CUST_NUMBER"));
            	customer.setName(rs.getString("NAME"));
            	customer.setAddress(rs.getString("ADDRESS"));
            	customer.setAddress2(rs.getString("ADDRESS_2"));
            	customer.setCity(rs.getString("CITY"));
            	customer.setState(rs.getString("STATE"));
            	customer.setZip(rs.getString("ZIP"));
            	customer.setPhone(rs.getString("PHONE"));
            	customer.setService_contact(rs.getString("SERVICE_CONTACT"));
            	customer.setTerms_code(rs.getString("TERMS_CODE"));
            	customer.setGarment_mark(rs.getString("GARMENT_MARK"));
            	customer.setNac_id(rs.getString("NAC_ID"));
            	customer.setPo_number(rs.getString("PO_NUMBER"));
            	customer.setPo_expire_date(rs.getString("PO_EXPIRE_DATE"));
            	customer.setInvoice_min(rs.getLong("INVOICE_MIN"));
            	customer.setSpl_charge_prcnt(rs.getString("SPL_CHARGE_PRCNT"));
            	customer.setLocker_open_rate(rs.getDouble("LOCKER_OPEN_RATE"));
            	customer.setTax_exempt(rs.getString("TAX_EXEMPT"));
            	customer.setTax_code_1(rs.getString("TAX_CODE_1"));
            	customer.setTax_code_2(rs.getString("TAX_CODE_2"));
            	customer.setTax_code_3(rs.getString("TAX_CODE_3"));
            	customer.setTax_code_4(rs.getString("TAX_CODE_4"));
            	customer.setAccount_status(rs.getString("ACCOUNT_STATUS"));
            	customer.setStatus_expire_date(rs.getString("STATUS_EXPIRE_DATE"));
            	customer.setAux_chg_code_1(rs.getString("AUX_CHG_CODE_1"));
            	customer.setAux_chg_rate_1(rs.getString("AUX_CHG_RATE_1"));
            	customer.setAux_chg_code_2(rs.getString("AUX_CHG_CODE_2"));
            	customer.setAux_chg_rate_2(rs.getString("AUX_CHG_RATE_2"));
            	customer.setAux_chg_code_3(rs.getString("AUX_CHG_CODE_3"));
            	customer.setAux_chg_rate_3(rs.getString("AUX_CHG_RATE_3"));
            	customer.setAux_chg_code_4(rs.getString("AUX_CHG_CODE_4"));
            	customer.setAux_chg_rate_4(rs.getString("AUX_CHG_RATE_4"));
            	customer.setAux_chg_code_5(rs.getString("AUX_CHG_CODE_5"));
            	customer.setAux_chg_rate_5(rs.getString("AUX_CHG_RATE_5"));
            	customer.setAux_chg_code_6(rs.getString("AUX_CHG_CODE_6"));
            	customer.setAux_chg_rate_6(rs.getString("AUX_CHG_RATE_6"));
            	customer.setAux_chg_code_7(rs.getString("AUX_CHG_CODE_7"));
            	customer.setAux_chg_rate_7(rs.getString("AUX_CHG_RATE_7"));
            	customer.setAux_chg_code_8(rs.getString("AUX_CHG_CODE_8"));
            	customer.setAux_chg_rate_8(rs.getString("AUX_CHG_RATE_8"));
            	customer.setAux_chg_code_9(rs.getString("AUX_CHG_CODE_9"));
            	customer.setAux_chg_rate_9(rs.getString("AUX_CHG_RATE_9"));
            	customer.setAge_open_0_30(rs.getDouble("AGE_OPEN_0_30"));
            	customer.setAge_open_31_60(rs.getDouble("AGE_OPEN_31_60"));
            	customer.setAge_open_over_60(rs.getDouble("AGE_OPEN_OVER_60"));
            	customer.setGts_flag(rs.getString("GTS_FLAG"));
            	customer.setStop_no_sat(rs.getLong("STOP_NO_SAT"));
            	customer.setStop_no_sun(rs.getLong("STOP_NO_SUN"));
            	customer.setStop_no_mon(rs.getLong("STOP_NO_MON"));
            	customer.setStop_no_tue(rs.getLong("STOP_NO_TUE"));
            	customer.setStop_no_wed(rs.getLong("STOP_NO_WED"));
            	customer.setStop_no_thu(rs.getLong("STOP_NO_THU"));
            	customer.setStop_no_fri(rs.getLong("STOP_NO_FRI"));
            	customer.setCon_last_ri_date(rs.getString("CON_LAST_RI_DATE"));
            	customer.setTrigger_flag(rs.getString("TRIGGER_FLAG"));
            	customer.setImport_date(rs.getString("IMPORT_DATE"));
            	customer.setSic_id(rs.getLong("SIC_ID"));
            	customer.setEc_status(rs.getString("EC_STATUS"));
            	customer.setEc_start_date(rs.getString("EC_START_DATE"));
            	customer.setEc_decline_date(rs.getString("EC_DECLINE_DATE"));
            	customer.setEc_er_code(rs.getString("EC_ER_CODE"));
            	customer.setEc_print_code(rs.getString("EC_PRINT_CODE"));
            	customer.setEc_hdr_upd_date_time(rs.getString("EC_HDR_UPD_DATE_TIME"));
            	
            	cust.add(customer);
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
		
		return cust;            
	
	}

}
