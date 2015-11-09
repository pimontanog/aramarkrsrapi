package com.aramark.rsr.adjustmentmatrix.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;
import oracle.jdbc.OracleTypes;
import com.aramark.rsr.adjustmentmatrix.model.AdjustmentMatrix;

public class JdbcAdjustmentMatrixDAO implements AdjustmentMatrixDAO {

	private DataSource dataSource;
	
	public void setDataSource(DataSource data){
		this.dataSource = data;
	}
	
	public JdbcAdjustmentMatrixDAO(DataSource data){
		this.setDataSource(data);
	}
	
	@Override
	public ArrayList<AdjustmentMatrix> getAllAdjustmentMatrix() {

		Connection conn = null;
		CallableStatement stmt = null;
		ArrayList<AdjustmentMatrix> am = new ArrayList<AdjustmentMatrix>();
		ResultSet rs = null;

		try{
			conn = dataSource.getConnection();
			stmt = conn.prepareCall("{call PK_GET_ADJUSTMENT_MATRIX.SP_GET_ADJUSTMENT_MATRIX(?)}");
            stmt.registerOutParameter(1, OracleTypes.CURSOR);
             
            stmt.execute();
            rs = (ResultSet) stmt.getObject(1);

            while(rs.next()){
            	
            	AdjustmentMatrix adjustmentmatrix = new AdjustmentMatrix();

            	adjustmentmatrix.setId(rs.getLong("ID"));
            	adjustmentmatrix.setTrans_code_id(rs.getString("TRANS_CODE_ID"));
            	adjustmentmatrix.setRec_type(rs.getString("REC_TYPE"));
            	adjustmentmatrix.setLine_type(rs.getString("LINE_TYPE"));
            	adjustmentmatrix.setItem_type(rs.getString("ITEM_TYPE"));
            	adjustmentmatrix.setCategory_name(rs.getString("CATEGORY_NAME"));
            	adjustmentmatrix.setStyle_name(rs.getString("STYLE_NAME"));
            	adjustmentmatrix.setSvc_line_status(rs.getString("SVC_LINE_STATUS"));
            	adjustmentmatrix.setBill_method(rs.getString("BILL_METHOD"));
            	adjustmentmatrix.setCredit_code_id(rs.getLong("CREDIT_CODE_ID"));
            	adjustmentmatrix.setCredit_code(rs.getString("CREDIT_CODE"));
            	adjustmentmatrix.setBill_qty_interactive(rs.getString("BILL_QTY_INTERACTIVE"));
            	adjustmentmatrix.setDel_qty_interactive(rs.getString("DEL_QTY_INTERACTIVE"));
            	adjustmentmatrix.setRts_qty_input(rs.getString("RTS_QTY_INPUT"));
            	adjustmentmatrix.setDel_qty_input(rs.getString("DEL_QTY_INPUT"));
            	adjustmentmatrix.setBill_qty_input(rs.getString("BILL_QTY_INPUT"));
            	adjustmentmatrix.setAdj_amt_input(rs.getString("ADJ_AMT_INPUT"));
            	adjustmentmatrix.setBill_qty_calc_flat(rs.getString("BILL_QTY_CALC_FLAT"));
            	adjustmentmatrix.setBill_qty_calc_piece(rs.getString("BILL_QTY_CALC_PIECE"));
            	adjustmentmatrix.setSvc_calc(rs.getString("SVC_CALC"));
            	adjustmentmatrix.setEc_calc(rs.getString("EC_CALC"));
            	adjustmentmatrix.setRts_default(rs.getString("RTS_DEFAULT"));
            	adjustmentmatrix.setDel_default_0(rs.getString("DEL_DEFAULT_0"));
            	adjustmentmatrix.setDel_default_full(rs.getString("DEL_DEFAULT_FULL"));
            	adjustmentmatrix.setBill_default_0(rs.getString("BILL_DEFAULT_0"));
            	adjustmentmatrix.setBill_default_1(rs.getString("BILL_DEFAULT_1"));
            	adjustmentmatrix.setBill_default_calc(rs.getString("BILL_DEFAULT_CALC"));
            	adjustmentmatrix.setBill_default_full(rs.getString("BILL_DEFAULT_FULL"));
            	adjustmentmatrix.setAmt_default_calc(rs.getString("AMT_DEFAULT_CALC"));
            	adjustmentmatrix.setAmt_default_full(rs.getString("AMT_DEFAULT_FULL"));
            	adjustmentmatrix.setExclude_cc(rs.getString("EXCLUDE_CC"));
            	
            	am.add(adjustmentmatrix);
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
		
		return am;		
		
	}

}
