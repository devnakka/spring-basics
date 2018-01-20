package com.srikanthnakka.spring.basics.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsScopeApplication.class);

	public static void main(String[] args) {
		 ApplicationContext context = SpringApplication.run(SpringBasicsScopeApplication.class, args);
		 
		 PersonDAO personDAO = context.getBean(PersonDAO.class);
		 PersonDAO personDAO2 = context.getBean(PersonDAO.class);
		 
		 LOGGER.info("{}",personDAO);
		 LOGGER.info("{}",personDAO.getJdbcConnection());
		 
		 //LOGGER.info("{}",personDAO2);
		 LOGGER.info("{}",personDAO.getJdbcConnection());
		 LOGGER.info("{}",personDAO.getJdbcConnection());
		 LOGGER.info("{}",personDAO.getJdbcConnection());
		 LOGGER.info("{}",personDAO.getJdbcConnection());
		 
		 
	}
}
