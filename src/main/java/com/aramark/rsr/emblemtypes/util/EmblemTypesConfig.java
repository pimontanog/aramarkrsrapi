package com.aramark.rsr.emblemtypes.util;

import javax.sql.DataSource;
import com.aramark.rsr.emblemtypes.dao.EmblemTypesDAO;
import com.aramark.rsr.emblemtypes.dao.JdbcEmblemTypesDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

@Configuration
public class EmblemTypesConfig {

	@Bean
	public EmblemTypesDAO emblemtypesDAO(){
		return new JdbcEmblemTypesDAO(dataSource());
	}
	
	@Bean
	public DataSource dataSource(){
		return new JndiDataSourceLookup().getDataSource("jdbc/db/aramarkbuild");
	}
}
