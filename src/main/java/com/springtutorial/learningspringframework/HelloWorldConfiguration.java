package com.springtutorial.learningspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Eliminate verbosity with Java Beans
//Public accessor methods, constructor, equals, hashcode, ToString automatically created
//Released in JDK 16


record Person (String name, int age) { };
record Address (String firstLine, String city) { };

@Configuration 
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Daryn";
	}
	
	@Bean
	public int age() {
		return 30;
	}
	
	@Bean
	public Person person() {
		return new Person("John", 25);
		
	}
	
	@Bean
	public Address address() {
		return new Address("Gallatin", "Nashville");
	}
	
	
	
}
