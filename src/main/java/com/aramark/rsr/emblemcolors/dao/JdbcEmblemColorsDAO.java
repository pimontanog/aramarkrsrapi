package com.aramark.rsr.emblemcolors.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;
import oracle.jdbc.OracleTypes;
import com.aramark.rsr.emblemcolors.model.EmblemColors;

public class JdbcEmblemColorsDAO implements EmblemColorsDAO {

	private DataSource dataSource;
	
	public void setDataSource(DataSource data){
		this.dataSource = data;
	}
	
	public JdbcEmblemColorsDAO(DataSource data){
		this.setDataSource(data);
	}	
	
	@Override
	public ArrayList<EmblemColors> getAllEmblemColors() {

		Connection conn = null;
		CallableStatement stmt = null;
		ArrayList<EmblemColors> emc = new ArrayList<EmblemColors>();
		ResultSet rs = null;

		try{
			conn = dataSource.getConnection();
			stmt = conn.prepareCall("{call PKK_GET_EMBLEM_COLORS.SP_GET_EMBLEM_COLORS(?)}");
            stmt.registerOutParameter(1, OracleTypes.CURSOR);
             
            stmt.execute();
            rs = (ResultSet) stmt.getObject(1);

            while(rs.next()){
            	
            	EmblemColors emblemcolors = new EmblemColors();

            	emblemcolors.setCode(rs.getString("CODE"));
            	emblemcolors.setDesc(rs.getString("DESC"));
            	emblemcolors.setCbo_display(rs.getString("CBO_DISPLAY"));
            	emblemcolors.setLetter_color(rs.getString("LETTER_COLOR"));
            	emblemcolors.setBkgrd_color(rs.getString("BKGRD_COLOR"));
            	emblemcolors.setBorder_color(rs.getString("BORDER_COLOR"));
            	emblemcolors.setCode_seq(rs.getLong("CODE_SEQ"));
            	
            	emc.add(emblemcolors);
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
		
		return emc;	
	}

}
