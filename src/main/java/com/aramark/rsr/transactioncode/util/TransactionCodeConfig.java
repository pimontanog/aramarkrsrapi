package com.aramark.rsr.transactioncode.util;

import javax.sql.DataSource;
import com.aramark.rsr.transactioncode.dao.TransactionCodeDAO;
import com.aramark.rsr.transactioncode.dao.JdbcTransactionCodeDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

@Configuration
public class TransactionCodeConfig {

	@Bean
	public TransactionCodeDAO transactioncodeDAO(){
		return new JdbcTransactionCodeDAO(dataSource());
	}
	
	@Bean
	public DataSource dataSource(){
		return new JndiDataSourceLookup().getDataSource("jdbc/db/aramarkbuild");
	}
}
