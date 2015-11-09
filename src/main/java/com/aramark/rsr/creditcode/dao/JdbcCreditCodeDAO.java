package com.aramark.rsr.creditcode.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;
import oracle.jdbc.OracleTypes;
import com.aramark.rsr.creditcode.model.CreditCode;

public class JdbcCreditCodeDAO implements CreditCodeDAO {

	private DataSource dataSource;
	
	public void setDataSource(DataSource data){
		this.dataSource = data;
	}
	
	public JdbcCreditCodeDAO(DataSource data){
		this.setDataSource(data);
	}
	
	@Override
	public ArrayList<CreditCode> getAllCreditCode() {

		Connection conn = null;
		CallableStatement stmt = null;
		ArrayList<CreditCode> cc = new ArrayList<CreditCode>();
		ResultSet rs = null;

		try{
			conn = dataSource.getConnection();
			stmt = conn.prepareCall("{call PK_GET_CREDIT_CODES.SP_GET_CREDIT_CODES(?)}");
            stmt.registerOutParameter(1, OracleTypes.CURSOR);
             
            stmt.execute();
            rs = (ResultSet) stmt.getObject(1);

            while(rs.next()){
            	
            	CreditCode creditcode = new CreditCode();

            	creditcode.setId(rs.getLong("ID"));
            	creditcode.setCode(rs.getString("CODE"));
            	creditcode.setName(rs.getString("NAME"));
            	creditcode.setDisplay(rs.getString("DISPLAY"));
            	
            	cc.add(creditcode);
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
		
		return cc;	
	}

}
