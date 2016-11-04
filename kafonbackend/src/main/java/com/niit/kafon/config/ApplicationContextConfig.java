package com.niit.kafon.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.niit.kafon")
@EnableTransactionManagement
public class ApplicationContextConfig {
	
	@Bean(name="datasource")
	public DataSource getH2DataSource(){
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("");
		
		dataSource.setDriverClassName("");
		
	dataSource.setUsername("sa");
    dataSource.setPassword("");
	return dataSource;
		}
	private Properties getHibernateProperties(){
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.h2Dialect");
		return properties;
	}
	@Autowired
	@Bean(name="sessionFactory") //bean is used to create the instances of the classes or methods return type
	public SessionFactory getSessionFactroy(DataSource dataSource){
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
		return sessionBuilder.buildSessionFactory();
	}
	@Autowired
	@Bean(name="transactionManger")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory){
			HibernateTransactionManger transactionManager = new HibernateTransactionManager(sessionFactory)
	return transactionManager;
	}
}
