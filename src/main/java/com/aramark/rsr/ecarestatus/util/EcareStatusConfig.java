package com.aramark.rsr.ecarestatus.util;

import javax.sql.DataSource;
import com.aramark.rsr.ecarestatus.dao.EcareStatusDAO;
import com.aramark.rsr.ecarestatus.dao.JdbcEcareStatusDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

@Configuration
public class EcareStatusConfig {

	@Bean
	public EcareStatusDAO ecarestatusDAO(){
		return new JdbcEcareStatusDAO(dataSource());
	}
	
	@Bean
	public DataSource dataSource(){
		return new JndiDataSourceLookup().getDataSource("jdbc/db/aramarkbuild");
	}	
}
