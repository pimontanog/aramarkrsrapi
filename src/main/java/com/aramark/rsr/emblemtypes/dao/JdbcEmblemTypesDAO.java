package com.aramark.rsr.emblemtypes.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;
import oracle.jdbc.OracleTypes;
import com.aramark.rsr.emblemtypes.model.EmblemTypes;

public class JdbcEmblemTypesDAO implements EmblemTypesDAO {

	private DataSource dataSource;
	
	public void setDataSource(DataSource data){
		this.dataSource = data;
	}
	
	public JdbcEmblemTypesDAO(DataSource data){
		this.setDataSource(data);
	}
	
	@Override
	public ArrayList<EmblemTypes> getAllEmblemTypes() {
		
		Connection conn = null;
		CallableStatement stmt = null;
		ArrayList<EmblemTypes> emt = new ArrayList<EmblemTypes>();
		ResultSet rs = null;

		try{
			conn = dataSource.getConnection();
			stmt = conn.prepareCall("{call PK_GET_EMBLEM_TYPES.SP_GET_EMBLEM_TYPES(?)}");
            stmt.registerOutParameter(1, OracleTypes.CURSOR);
             
            stmt.execute();
            rs = (ResultSet) stmt.getObject(1);

            while(rs.next()){
            	
            	EmblemTypes emblemtypes = new EmblemTypes();

            	emblemtypes.setCode(rs.getString("CODE"));
            	emblemtypes.setLetter_color(rs.getString("LETTER_COLOR"));
            	emblemtypes.setBkgrd_color(rs.getString("BKGRD_COLOR"));
            	emblemtypes.setBorder_color(rs.getString("BORDER_COLOR"));
            	emblemtypes.setDescription(rs.getString("DESC"));
            	emblemtypes.setCbo_display("CBO_DISPLAY");
            	
            	emt.add(emblemtypes);
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
		
		return emt;
		}

}
