package com.aramark.rsr.emblemtypechargecode.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;
import oracle.jdbc.OracleTypes;
import com.aramark.rsr.emblemtypechargecode.model.EmblemTypeChargeCode;

public class JdbcEmblemTypeChargeCodeDAO implements EmblemTypeChargeCodeDAO {

	private DataSource dataSource;
	
	public void setDataSource(DataSource data){
		this.dataSource = data;
	}
	
	public JdbcEmblemTypeChargeCodeDAO(DataSource data){
		this.setDataSource(data);
	}
	
	@Override
	public ArrayList<EmblemTypeChargeCode> getAllEmblemTypeChargeCode() {

		Connection conn = null;
		CallableStatement stmt = null;
		ArrayList<EmblemTypeChargeCode> emtcc = new ArrayList<EmblemTypeChargeCode>();
		ResultSet rs = null;

		try{
			conn = dataSource.getConnection();
			stmt = conn.prepareCall("{call PK_GET_EMBLEM_TYPE_CHRG_CODES.SP_EMBLEM_TYPE_CHRG_CODES(?)}");
            stmt.registerOutParameter(1, OracleTypes.CURSOR);
             
            stmt.execute();
            rs = (ResultSet) stmt.getObject(1);

            while(rs.next()){
            	
            	EmblemTypeChargeCode emblemtypechargecode = new EmblemTypeChargeCode();

            	emblemtypechargecode.setType_code(rs.getString("TYPE_CODE"));
            	emblemtypechargecode.setCharge_code(rs.getString("CHARGE_CODE"));
            	emblemtypechargecode.setSearch_sequence(rs.getLong("SEARCH_SEQUENCE"));
            	emtcc.add(emblemtypechargecode);
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
		
		return emtcc;	
		}

}
