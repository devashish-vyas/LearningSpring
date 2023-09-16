package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingBasicJava {
	public static void main(String[] args) {
		
		//Launch a spring context
		var context=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class); 
		//System.out.println("Hello World");
		//Configure the things that we want spring to do.-@Configuration class
		//HelloWorldConfigurationClass - @Configuration
		//name - @Bean
		//System.out.println(context.getBean("name"));
		//System.out.println(context.getBean("age"));
		//System.out.println(context.getBean("person"));
		System.out.println(context.getBean("person2UsingParameters"));
		System.out.println(context.getBean("person2usingMethodCalls"));
		
		
	}
	 

}
