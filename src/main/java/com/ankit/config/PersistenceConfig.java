package com.ankit.config;




import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.ankit.dao")
public class PersistenceConfig {
	/*
	@Bean(name="jdsl")
	public DataSource createDS() {
		JndiDataSourceLookup jdsl=null;
		DataSource ds=null;
		jdsl=new JndiDataSourceLookup();
		ds=(DataSource) jdsl.getDataSource("java:/comp/env/DsJndi");
		return ds;
	}
	@Bean(name="jt")
	public JdbcTemplate creatJT() {
		JdbcTemplate jt=null;
		jt=new JdbcTemplate(createDS());
		return jt;
	}*/

}
