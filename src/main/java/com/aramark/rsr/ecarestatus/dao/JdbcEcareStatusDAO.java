package com.aramark.rsr.ecarestatus.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;
import oracle.jdbc.OracleTypes;
import com.aramark.rsr.ecarestatus.model.EcareStatus;

public class JdbcEcareStatusDAO implements EcareStatusDAO {

	private DataSource dataSource;
	
	public void setDataSource(DataSource data){
		this.dataSource = data;
	}
	
	public JdbcEcareStatusDAO(DataSource data){
		this.setDataSource(data);
	}	
	
	@Override
	public ArrayList<EcareStatus> getAllEcareStatus() {

		Connection conn = null;
		CallableStatement stmt = null;
		ArrayList<EcareStatus> es = new ArrayList<EcareStatus>();
		ResultSet rs = null;

		try{
			conn = dataSource.getConnection();
			stmt = conn.prepareCall("{call PK_GET_ECARE_STATUSES.SP_GET_ECARE_STATUSES(?)}");
            stmt.registerOutParameter(1, OracleTypes.CURSOR);
             
            stmt.execute();
            rs = (ResultSet) stmt.getObject(1);

            while(rs.next()){
            	
            	EcareStatus ecarestatus = new EcareStatus();

            	ecarestatus.setCode(rs.getString("CODE"));
            	ecarestatus.setDesc(rs.getString("DESC"));
            	
            	es.add(ecarestatus);
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
		
		return es;
		}

}
