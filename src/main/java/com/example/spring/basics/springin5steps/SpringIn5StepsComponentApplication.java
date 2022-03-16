package com.example.spring.basics.springin5steps;

import com.example.spring.basics.componentscan.PersonDAOone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.example.spring.basics.componentscan")
public class SpringIn5StepsComponentApplication {


	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentApplication.class);
	public static void main(String[] args) {

		//ApplicationContext run = SpringApplication.run(SpringIn5StepsComponentApplication.class, args);
		ApplicationContext run = new AnnotationConfigApplicationContext(SpringIn5StepsComponentApplication.class);
		PersonDAOone personDAO1 = run.getBean(PersonDAOone.class);
		LOGGER.info("{}",personDAO1.getJdbcConnection());

	}

}
