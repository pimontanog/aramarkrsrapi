package com.aramark.rsr.billingmethod.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import com.aramark.rsr.billingmethod.model.BillingMethod;

import oracle.jdbc.OracleTypes;


public class JdbcBillingMethodDAO implements BillingMethodDAO {

private DataSource dataSource;
	
	
	public void setDataSource(DataSource data){
		this.dataSource = data;
	}
	
	public JdbcBillingMethodDAO(DataSource data){
		this.setDataSource(data);
	}
	
	@Override
	public ArrayList<BillingMethod> getAllBillingMethod() {
		// TODO Auto-generated method stub

		Connection conn = null;
		CallableStatement stmt = null;
		ArrayList<BillingMethod> btm = new ArrayList<BillingMethod>();
		ResultSet rs = null;
		
		
		try{
			conn = dataSource.getConnection();
			
            stmt = conn.prepareCall("{call PK_GET_BILLING_METHODS.SP_GET_BILLING_METHODS(?)}");
            stmt.registerOutParameter(1, OracleTypes.CURSOR);
             
            stmt.execute();

            rs = (ResultSet) stmt.getObject(1);

         // loop it like normal
         while (rs.next()) {
        	 
        	BillingMethod bmod = new BillingMethod(); 
        	 
        	bmod.setCode(rs.getString("CODE"));
        	bmod.setDesc(rs.getString("DESC"));

        	btm.add(bmod);
         }			
            
             
            //read the OUT parameter now
			
		} catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
		}
		return btm;
	}
	
	
	
}
