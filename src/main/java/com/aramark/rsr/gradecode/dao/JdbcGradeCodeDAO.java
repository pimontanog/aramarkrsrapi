package com.aramark.rsr.gradecode.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.sql.DataSource;
import oracle.jdbc.OracleTypes;
import com.aramark.rsr.gradecode.model.GradeCode;

public class JdbcGradeCodeDAO implements GradeCodeDAO {

	private DataSource dataSource;
	
	public void setDataSource(DataSource data){
		this.dataSource = data;
	}
	
	public JdbcGradeCodeDAO(DataSource data){
		this.setDataSource(data);
	}
	
	@Override
	public ArrayList<GradeCode> getAllGradeCode() {

		Connection conn = null;
		CallableStatement stmt = null;
		ArrayList<GradeCode> gc = new ArrayList<GradeCode>();
		ResultSet rs = null;

		try{
			conn = dataSource.getConnection();
			stmt = conn.prepareCall("{call PK_GET_GRADE_CODES.SP_GET_GRADE_CODES(?)}");
            stmt.registerOutParameter(1, OracleTypes.CURSOR);
             
            stmt.execute();
            rs = (ResultSet) stmt.getObject(1);

            while(rs.next()){
            	
            	GradeCode gradecode = new GradeCode();

            	gradecode.setCode(rs.getString("CODE"));
            	gradecode.setDesc(rs.getString("DESC"));
            	gradecode.setDisplay_sequence(rs.getLong("DISPLAY_SEQUENCE"));
            	
            	gc.add(gradecode);
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
		
		return gc;
	}

}
