package com.voluntrix.Voluntrix.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.voluntrix.Voluntrix.services.DbService;

import jakarta.annotation.PostConstruct;

@Configuration
@Profile("dev")
public class DevConfig {
	
	@Autowired
	DbService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	String value;
	
	@PostConstruct
	public void iniciaDbDev() {
		if(value.equals("update")) {
			dbService.instanciaDb();
		}
	}

}
