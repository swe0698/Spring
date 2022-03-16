package com.example.spring.basics.springin5steps;

import com.example.spring.basics.springin5steps.basics.SortAlgoImpl;
import com.example.spring.basics.springin5steps.properties.sweprop;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	public static void main(String[] args) {

		//ApplicationContext run = SpringApplication.run(SpringIn5StepsApplication.class, args);
		try (AnnotationConfigApplicationContext run = new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class)) {
			sweprop swe = run.getBean(sweprop.class);
			System.out.println(swe.sendUrl());
		}
	}
}
