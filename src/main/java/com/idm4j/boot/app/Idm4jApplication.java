package com.idm4j.boot.app;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ConfigurationProperties
@ComponentScan(
  basePackages ={ "com.idm4j.boot.app" }, 
  excludeFilters = { 
    @Filter(value = Configuration.class)
  }
)
public class Idm4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(Idm4jApplication.class, args);
	}
	@Bean  
	public SessionFactory sessionFactory(HibernateEntityManagerFactory hemf){  
	    return hemf.getSessionFactory();  
	} 
}
