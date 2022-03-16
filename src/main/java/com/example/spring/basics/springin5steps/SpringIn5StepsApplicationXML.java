package com.example.spring.basics.springin5steps;

import com.example.spring.basics.springin5steps.cdi.CDIPersonDAO;
import com.example.spring.basics.springin5steps.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
//@Configuration
public class SpringIn5StepsApplicationXML {

	private static Logger logger= LoggerFactory.getLogger(SpringIn5StepsApplicationXML.class);
	public static void main(String[] args) {

		//ApplicationContext run = SpringApplication.run(SpringIn5StepsApplicationCDI.class, args);
		try (ClassPathXmlApplicationContext run = new ClassPathXmlApplicationContext("applicationContext.xml")) {

			logger.info("Beans{}",(Object) run.getBeanDefinitionNames());
			XMLPersonDAO cdiPersonDAO = run.getBean(XMLPersonDAO.class);
			logger.info("{}", cdiPersonDAO);
			logger.info("{}", cdiPersonDAO.getJdbcConnection());
		}

	}

}
