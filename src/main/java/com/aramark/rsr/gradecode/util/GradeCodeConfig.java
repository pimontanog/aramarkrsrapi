package com.aramark.rsr.gradecode.util;

import javax.sql.DataSource;
import com.aramark.rsr.gradecode.dao.GradeCodeDAO;
import com.aramark.rsr.gradecode.dao.JdbcGradeCodeDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

@Configuration
public class GradeCodeConfig {

	@Bean
	public GradeCodeDAO gradecodeDAO(){
		return new JdbcGradeCodeDAO(dataSource());
	}
	
	@Bean
	public DataSource dataSource(){
		return new JndiDataSourceLookup().getDataSource("jdbc/db/aramarkbuild");
	}	
}
