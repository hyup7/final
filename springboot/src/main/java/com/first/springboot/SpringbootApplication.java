package com.first.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringbootApplication.class, args);
		String[] beans=context.getBeanDefinitionNames();
		for(String name:beans) {
			System.out.println(name);
		}
		System.out.println(beans.length);
		
	}

}
