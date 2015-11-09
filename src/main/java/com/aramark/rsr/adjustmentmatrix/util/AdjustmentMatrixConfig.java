package com.aramark.rsr.adjustmentmatrix.util;

import javax.sql.DataSource;
import com.aramark.rsr.adjustmentmatrix.dao.AdjustmentMatrixDAO;
import com.aramark.rsr.adjustmentmatrix.dao.JdbcAdjustmentMatrixDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

@Configuration
public class AdjustmentMatrixConfig {

	@Bean
	public AdjustmentMatrixDAO adjustmentmatrixDAO(){
		return new JdbcAdjustmentMatrixDAO(dataSource());
	}
	
	@Bean
	public DataSource dataSource(){
		return new JndiDataSourceLookup().getDataSource("jdbc/db/aramarkbuild");
	}	
}
