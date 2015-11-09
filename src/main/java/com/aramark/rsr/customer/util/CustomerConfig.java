package com.aramark.rsr.customer.util;

import javax.sql.DataSource;
import com.aramark.rsr.customer.dao.CustomerDAO;
import com.aramark.rsr.customer.dao.JdbcCustomerDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

@Configuration
public class CustomerConfig {

	@Bean
	public CustomerDAO customerDAO(){
		return new JdbcCustomerDAO(dataSource());
	}
	
	@Bean
	public DataSource dataSource(){
		return new JndiDataSourceLookup().getDataSource("jdbc/db/aramarkbuild");
	}

}
