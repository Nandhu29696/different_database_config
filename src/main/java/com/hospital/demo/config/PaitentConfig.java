package com.hospital.demo.config;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "paitentEntityManagerFactory", basePackages = {
		"com.hospital.demo.paitent.repository" }, transactionManagerRef = "paitentTransactionManager")
public class PaitentConfig {

	@Bean(name = "paitentDatasource")
	@ConfigurationProperties(prefix = "spring.paitent.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "paitentEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(EntityManagerFactoryBuilder builder,
			@Qualifier("paitentDatasource") DataSource dataSource) {

		Map<String, Object> properties = new HashMap<String, Object>();

		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQL81Dialect");

		return builder.dataSource(dataSource).properties(properties).packages("com.hospital.demo.paitent.model")
				.build();

	}

	@Bean(name = "paitentTransactionManager")
	public PlatformTransactionManager transactionManager(
			@Qualifier("paitentEntityManagerFactory") EntityManagerFactory entityManagerFactory) {

		return new JpaTransactionManager(entityManagerFactory);
	}
}