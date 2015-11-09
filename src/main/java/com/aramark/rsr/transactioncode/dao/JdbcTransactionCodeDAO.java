package com.aramark.rsr.transactioncode.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;
import oracle.jdbc.OracleTypes;
import com.aramark.rsr.transactioncode.model.TransactionCode;

public class JdbcTransactionCodeDAO implements TransactionCodeDAO {

	private DataSource dataSource;
	
	public void setDataSource(DataSource data){
		this.dataSource = data;
	}
	
	public JdbcTransactionCodeDAO(DataSource data){
		this.setDataSource(data);
	}
	
	@Override
	public ArrayList<TransactionCode> getAllTransactionCode() {

		Connection conn = null;
		CallableStatement stmt = null;
		ArrayList<TransactionCode> tc = new ArrayList<TransactionCode>();
		ResultSet rs = null;

		try{
			conn = dataSource.getConnection();
			stmt = conn.prepareCall("{call PK_GET_TRANSACTION_CODES.SP_GET_TRANSACTION_CODES(?)}");
            stmt.registerOutParameter(1, OracleTypes.CURSOR);
             
            stmt.execute();
            rs = (ResultSet) stmt.getObject(1);

            while(rs.next()){
            	
            	TransactionCode transactioncode = new TransactionCode();

            	transactioncode.setId(rs.getLong("ID"));
            	transactioncode.setCode(rs.getString("CODE"));
            	transactioncode.setBill_sub_tran_code(rs.getString("BILL_SUB_TRAN_CODE"));
            	transactioncode.setName(rs.getString("NAME"));
            	tc.add(transactioncode);
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
		
		return tc;	
	}

}
