package com.schoolify.configuration.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class MemberProfileConfiguration {
	
	@Autowired
	Environment environment; 
	
	public String getDataBaseUserName() {
		return environment.getProperty("spring.datasource.username");
	}

	public String getDataBasePassword() {
		return environment.getProperty("spring.datasource.password");
	}
	
	public String getHibernateDialect() {
		return environment.getProperty("spring.jpa.properties.hibernate.dialect");
	}
	
	public String getDataBaseURI() {
		return environment.getProperty("spring.datasource.url");
	}
	
	public String getDataBaseDriver() {
		return environment.getProperty("spring.datasource.driver-class-name");
	}
}
