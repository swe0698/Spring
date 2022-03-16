package com.example.spring.basics.springin5steps;

import com.example.spring.basics.springin5steps.basics.SortAlgoImpl;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsApplication {

	public static void main(String[] args) {

		//ApplicationContext run = SpringApplication.run(SpringIn5StepsApplication.class, args);
		try (AnnotationConfigApplicationContext run = new AnnotationConfigApplicationContext(SpringIn5StepsApplication.class)) {
			SortAlgoImpl sortAlgo = run.getBean(SortAlgoImpl.class);
			System.out.println(sortAlgo);
			SortAlgoImpl sortAlgo1 = run.getBean(SortAlgoImpl.class);
			System.out.println(sortAlgo1);
			//System.out.println(sortAlgo.sortAlgorithm.sort());
			sortAlgo.Chinnakani();
		}
	}
}
