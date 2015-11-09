package com.aramark.rsr.customeritem.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;
import oracle.jdbc.OracleTypes;
import com.aramark.rsr.customeritem.model.CustomerItem;

public class JdbcCustomerItemDAO implements CustomerItemDAO {

	private DataSource dataSource;
	
	public void setDataSource(DataSource data){
		this.dataSource = data;
	}
	
	public JdbcCustomerItemDAO(DataSource data){
		this.setDataSource(data);
	}

	@Override
	public ArrayList<CustomerItem> getAllCustomerItem(long pRouteId) {

		Connection conn = null;
		CallableStatement stmt = null;
		ArrayList<CustomerItem> custitem = new ArrayList<CustomerItem>();
		ResultSet rs = null;

		try{
			conn = dataSource.getConnection();
			stmt = conn.prepareCall("{call PK_GET_CUST_ITEMS.SP_GET_CUST_ITEMS(?,?)}");
            stmt.setLong(1, pRouteId);
            stmt.registerOutParameter(2, OracleTypes.CURSOR);
             
            stmt.execute();
            rs = (ResultSet) stmt.getObject(2);

            while(rs.next()){
            	
            	CustomerItem ci = new CustomerItem();
            
            	ci.setCustomer_id(rs.getLong("CUSTOMER_ID"));
            	ci.setLine_number(rs.getLong("LINE_NUMBER"));
            	ci.setLine_status(rs.getString("LINE_STATUS"));
            	ci.setSvc_week(rs.getString("SVC_WEEK"));
            	ci.setSvc_days(rs.getString("SVC_DAYS"));
            	ci.setTransaction_code(rs.getString("TRANSACTION_CODE"));
            	ci.setId(rs.getLong("ID"));
            	ci.setSub_trans_code(rs.getString("SUB_TRANS_CODE"));
            	ci.setNum_puc_to_print(rs.getString("NUM_PUC_TO_PRINT"));
            	ci.setBilling_code(rs.getString("BILLING_CODE"));
            	ci.setSalesperson(rs.getString("SALESPERSON"));
            	ci.setSvc_begin_date(rs.getString("SVC_BEGIN_DATE"));
            	ci.setTermination_date(rs.getString("TERMINATION_DATE"));
            	ci.setItem_id(rs.getLong("ITEM_ID"));
            	ci.setWearer_id(rs.getLong("WEARER_ID"));
            	ci.setInv_qty(rs.getLong("INV_QTY"));
            	ci.setGrade_code(rs.getString("GRADE_CODE"));
            	ci.setSwing_back_in(rs.getString("SWING_BACK_IN"));
            	ci.setSwing_back_out(rs.getString("SWING_BACK_OUT"));
            	ci.setSwing_back_quantity(rs.getLong("SWING_BACK_QUANTITY"));
            	ci.setReplacement_pct(rs.getDouble("REPLACEMENT_PCT"));
            	ci.setDelivery_method(rs.getString("DELIVERY_METHOD"));
            	ci.setBilling_method(rs.getString("BILLING_METHOD"));
            	ci.setFlat_rate(rs.getDouble("FLAT_RATE"));
            	ci.setFlat_quantity(rs.getLong("FLAT_QUANTITY"));
            	ci.setPiece_rate(rs.getDouble("PIECE_RATE"));
            	ci.setPercent_inv(rs.getDouble("PERCENT_INV"));
            	ci.setReplace_rate(rs.getDouble("REPLACE_RATE"));
            	ci.setEmblem_switch(rs.getString("EMBLEM_SWITCH"));
            	ci.setChg_date(rs.getString("CHG_DATE"));
            	ci.setFrequency_code(rs.getString("FREQUENCY_CODE"));
            	ci.setStatus(rs.getString("STATUS"));
            	ci.setHh_new_flag(rs.getString("HH_NEW_FLAG"));
            	ci.setSvc_week1(rs.getString("SVC_WEEK1"));
            	ci.setSvc_week2(rs.getString("SVC_WEEK2"));
            	ci.setSvc_week3(rs.getString("SVC_WEEK3"));
            	ci.setSvc_week4(rs.getString("SVC_WEEK4"));
            	ci.setSvc_day1(rs.getString("SVC_DAY1"));
            	ci.setSvc_day2(rs.getString("SVC_DAY2"));
            	ci.setSvc_day3(rs.getString("SVC_DAY3"));
            	ci.setSvc_day4(rs.getString("SVC_DAY4"));
            	ci.setSvc_day5(rs.getString("SVC_DAY5"));
            	ci.setSvc_day6(rs.getString("SVC_DAY6"));
            	ci.setSvc_day7(rs.getString("SVC_DAY7"));
            	ci.setKeeprecatserver(rs.getShort("KeepRecAtServer"));
            	ci.setImport_date(rs.getString("IMPORT_DATE"));
            	ci.setLogical_del_flag(rs.getShort("LOGICAL_DEL_FLAG"));
            	ci.setTrigger_flag(rs.getString("TRIGGER_FLAG"));
            	ci.setEffective_piece_rate(rs.getDouble("EFFECTIVE_PIECE_RATE"));
            	
            	custitem.add(ci);
            }
            
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
		}
		return custitem;
	}

}
