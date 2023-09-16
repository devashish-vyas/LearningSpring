package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age,Address address) {}; // dont need to create setter and constructors.
record Address(String firstLine,String city) {};
@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Devashish";
	}
	@Bean
	public int age() {
		return 21;
	}
	
	@Bean
	public Person person() {
		var person=new Person("Ravi",23,new Address("Shree","Beawar"));
		return person;
	}
	
	@Bean(name="address2") // Your custom bean name.
	public Address address() {
		var address=new Address("Baker Street","London");
		return address;
	}
	
	@Bean
	public Person person2UsingParameters(String name,int age,Address address) {  //using other bean methods we have created this bean method.
		return new Person(name,age,address);
	}
	@Bean
	public Person person2usingMethodCalls() {
		return new Person(name(),age(),address());
	}
	
	
	
	

}
