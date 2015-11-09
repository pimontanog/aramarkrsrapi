package com.aramark.rsr.creditcode.util;

import javax.sql.DataSource;
import com.aramark.rsr.creditcode.dao.CreditCodeDAO;
import com.aramark.rsr.creditcode.dao.JdbcCreditCodeDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

@Configuration
public class CreditCodeConfig {
	
	@Bean
	public CreditCodeDAO creditcodeDAO(){
		return new JdbcCreditCodeDAO(dataSource());
	}
	
	@Bean
	public DataSource dataSource(){
		return new JndiDataSourceLookup().getDataSource("jdbc/db/aramarkbuild");
	}
}
