package com.example.spring.basics.springin5steps;

import com.example.spring.basics.springin5steps.basics.SortAlgoImpl;
import com.example.spring.basics.springin5steps.cdi.CDIPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@SpringBootApplication
@Configuration
public class SpringIn5StepsApplicationCDI {

	private static Logger logger= LoggerFactory.getLogger(SpringIn5StepsApplicationCDI.class);
	public static void main(String[] args) {

		//ApplicationContext run = SpringApplication.run(SpringIn5StepsApplicationCDI.class, args);
		ApplicationContext run = new AnnotationConfigApplicationContext(SpringIn5StepsApplicationCDI.class);
		CDIPersonDAO cdiPersonDAO = run.getBean(CDIPersonDAO.class);
		logger.info("{}",cdiPersonDAO);


	}

}
