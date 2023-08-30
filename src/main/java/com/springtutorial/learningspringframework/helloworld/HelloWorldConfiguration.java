package com.springtutorial.learningspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Eliminate verbosity with Java Beans
//Public accessor methods, constructor, equals, hashcode, ToString automatically created
//Released in JDK 16


record Person (String name, int age, Address address) { };
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
		return new Person("John", 25, new Address("Midtown", "Nashville"));
		
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name, age, address3);
	}
	
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name, age, address);
	}
	
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
		return new Person(name, age, address);
	}
	
	@Bean(name = "address2")
	@Primary
	public Address address() {
		return new Address("Gallatin", "Nashville");
	}
	
	@Bean(name = "address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("Gulch", "Nashville");
	}
	
	
}
