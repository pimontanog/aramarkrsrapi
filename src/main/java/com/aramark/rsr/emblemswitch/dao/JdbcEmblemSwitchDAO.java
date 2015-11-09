package com.aramark.rsr.emblemswitch.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;
import oracle.jdbc.OracleTypes;
import com.aramark.rsr.emblemswitch.model.EmblemSwitch;

public class JdbcEmblemSwitchDAO implements EmblemSwitchDAO {

	private DataSource dataSource;
	
	public void setDataSource(DataSource data){
		this.dataSource = data;
	}
	
	public JdbcEmblemSwitchDAO(DataSource data){
		this.setDataSource(data);
	}
	
	@Override
	public ArrayList<EmblemSwitch> getAllEmblemSwitch() {

		Connection conn = null;
		CallableStatement stmt = null;
		ArrayList<EmblemSwitch> ems = new ArrayList<EmblemSwitch>();
		ResultSet rs = null;

		try{
			conn = dataSource.getConnection();
			stmt = conn.prepareCall("{call PK_GET_EMBLEM_SWITCH.SP_GET_EMBLEM_SWITCH(?)}");
            stmt.registerOutParameter(1, OracleTypes.CURSOR);
             
            stmt.execute();
            rs = (ResultSet) stmt.getObject(1);

            while(rs.next()){
            	
            	EmblemSwitch emblemswitch = new EmblemSwitch();

            	emblemswitch.setId(rs.getLong("ID"));
            	emblemswitch.setCode(rs.getString("CODE"));
            	emblemswitch.setDescr(rs.getString("DESC"));
            	
            	ems.add(emblemswitch);
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
		
		return ems;	
	}

}
