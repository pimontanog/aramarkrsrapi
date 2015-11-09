package com.aramark.rsr.emblemswitch.util;

import javax.sql.DataSource;
import com.aramark.rsr.emblemswitch.dao.EmblemSwitchDAO;
import com.aramark.rsr.emblemswitch.dao.JdbcEmblemSwitchDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

@Configuration
public class EmblemSwitchConfig {

	@Bean
	public EmblemSwitchDAO emblemswitchDAO(){
		return new JdbcEmblemSwitchDAO(dataSource());
	}
	
	@Bean
	public DataSource dataSource(){
		return new JndiDataSourceLookup().getDataSource("jdbc/db/aramarkbuild");
	}
}
