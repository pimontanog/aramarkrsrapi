package com.aramark.rsr.emblemcolors.util;

import javax.sql.DataSource;
import com.aramark.rsr.emblemcolors.dao.EmblemColorsDAO;
import com.aramark.rsr.emblemcolors.dao.JdbcEmblemColorsDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

@Configuration
public class EmblemColorsConfig {

	@Bean
	public EmblemColorsDAO emblemcolorsDAO(){
		return new JdbcEmblemColorsDAO(dataSource());
	}
	
	@Bean
	public DataSource dataSource(){
		return new JndiDataSourceLookup().getDataSource("jdbc/db/aramarkbuild");
	}
}
