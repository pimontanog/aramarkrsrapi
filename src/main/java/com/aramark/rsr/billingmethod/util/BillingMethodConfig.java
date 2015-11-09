package com.aramark.rsr.billingmethod.util;

import javax.sql.DataSource;

import com.aramark.rsr.billingmethod.dao.BillingMethodDAO;
import com.aramark.rsr.billingmethod.dao.JdbcBillingMethodDAO;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;


@Configuration
public class BillingMethodConfig {

	
	@Bean
	public BillingMethodDAO billingMethodDAO(){
		
		return new JdbcBillingMethodDAO(dataSource());
	}
	
	@Bean
	public DataSource dataSource(){
		return new JndiDataSourceLookup().getDataSource("jdbc/db/aramarkbuild");
	}
	
	
}
