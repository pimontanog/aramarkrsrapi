package com.aramark.rsr.paymentmethod.util;

import javax.sql.DataSource;
import com.aramark.rsr.paymentmethod.dao.PaymentMethodDAO;
import com.aramark.rsr.paymentmethod.dao.JdbcPaymentMethodDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

@Configuration
public class PaymentMethodConfig {

	@Bean
	public PaymentMethodDAO paymentmethodDAO(){
		return new JdbcPaymentMethodDAO(dataSource());
	}
	
	@Bean
	public DataSource dataSource(){
		return new JndiDataSourceLookup().getDataSource("jdbc/db/aramarkbuild");
	}	
}
