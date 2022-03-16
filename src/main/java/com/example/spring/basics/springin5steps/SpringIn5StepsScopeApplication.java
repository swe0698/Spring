package com.example.spring.basics.springin5steps;

import com.example.spring.basics.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringIn5StepsScopeApplication {


	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	public static void main(String[] args) {

		//ApplicationContext run = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		ApplicationContext run = new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class);
		PersonDAO personDAO = run.getBean(PersonDAO.class);
		LOGGER.info("{}",personDAO.getJdbcConnection());
		PersonDAO personDAO1 = run.getBean(PersonDAO.class);
		LOGGER.info("{}",personDAO1.getJdbcConnection());

	}

}
