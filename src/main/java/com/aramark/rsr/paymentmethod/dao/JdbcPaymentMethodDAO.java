package com.aramark.rsr.paymentmethod.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;
import oracle.jdbc.OracleTypes;
import com.aramark.rsr.paymentmethod.model.PaymentMethod;

public class JdbcPaymentMethodDAO implements PaymentMethodDAO {

	private DataSource dataSource;
	
	public void setDataSource(DataSource data){
		this.dataSource = data;
	}
	
	public JdbcPaymentMethodDAO(DataSource data){
		this.setDataSource(data);
	}
	
	@Override
	public ArrayList<PaymentMethod> getAllPaymentMethod() {

		Connection conn = null;
		CallableStatement stmt = null;
		ArrayList<PaymentMethod> pm = new ArrayList<PaymentMethod>();
		ResultSet rs = null;

		try{
			conn = dataSource.getConnection();
			stmt = conn.prepareCall("{call PK_GET_PAYMENT_METHODS.SP_GET_PAYMENT_METHODS(?)}");
            stmt.registerOutParameter(1, OracleTypes.CURSOR);
             
            stmt.execute();
            rs = (ResultSet) stmt.getObject(1);

            while(rs.next()){
            	
            	PaymentMethod paymentmethod = new PaymentMethod();

            	paymentmethod.setId(rs.getLong("ID"));
            	paymentmethod.setMethod(rs.getString("METHOD"));
            	pm.add(paymentmethod);
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
		
		return pm;	
	}

}
