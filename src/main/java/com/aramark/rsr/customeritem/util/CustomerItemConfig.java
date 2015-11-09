package com.aramark.rsr.customeritem.util;

import javax.sql.DataSource;
import com.aramark.rsr.customeritem.dao.CustomerItemDAO;
import com.aramark.rsr.customeritem.dao.JdbcCustomerItemDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

@Configuration
public class CustomerItemConfig {

	@Bean
	public CustomerItemDAO customeritemDAO(){
		return new JdbcCustomerItemDAO(dataSource());
	}
	
	@Bean
	public DataSource dataSource(){
		return new JndiDataSourceLookup().getDataSource("jdbc/db/aramarkbuild");
	}
}
