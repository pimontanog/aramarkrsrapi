package com.aramark.rsr.deliverymethod.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;
import oracle.jdbc.OracleTypes;
import com.aramark.rsr.deliverymethod.model.DeliveryMethod;

public class JdbcDeliveryMethodDAO implements DeliveryMethodDAO {

	private DataSource dataSource;
	
	public void setDataSource(DataSource data){
		this.dataSource = data;
	}
	
	public JdbcDeliveryMethodDAO(DataSource data){
		this.setDataSource(data);
	}
	
	@Override
	public ArrayList<DeliveryMethod> getAllDeliveryMethod() {
		
		Connection conn = null;
		CallableStatement stmt = null;
		ArrayList<DeliveryMethod> dm = new ArrayList<DeliveryMethod>();
		ResultSet rs = null;

		try{
			conn = dataSource.getConnection();
			stmt = conn.prepareCall("{call PK_GET_DELIVERY_METHODS.SP_GET_DELIVERY_METHODS(?)}");
            stmt.registerOutParameter(1, OracleTypes.CURSOR);
             
            stmt.execute();
            rs = (ResultSet) stmt.getObject(1);

            while(rs.next()){
            	
            	DeliveryMethod deliverymethod = new DeliveryMethod();

            	deliverymethod.setCode(rs.getString("CODE"));
            	deliverymethod.setDesc(rs.getString("DESC"));
            	
            	dm.add(deliverymethod);
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
		
		return dm;
	}

}
