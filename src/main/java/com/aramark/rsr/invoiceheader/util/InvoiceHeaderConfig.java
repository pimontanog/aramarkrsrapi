package com.aramark.rsr.invoiceheader.util;

import javax.sql.DataSource;
import com.aramark.rsr.invoiceheader.dao.InvoiceHeaderDAO;
import com.aramark.rsr.invoiceheader.dao.JdbcInvoiceHeaderDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

@Configuration
public class InvoiceHeaderConfig {

	@Bean
	public InvoiceHeaderDAO invoiceHeaderDAO(){
		return new JdbcInvoiceHeaderDAO(dataSource());
	}
	
	@Bean
	public DataSource dataSource(){
		return new JndiDataSourceLookup().getDataSource("jdbc/db/aramarkbuild");
	}
	
}
