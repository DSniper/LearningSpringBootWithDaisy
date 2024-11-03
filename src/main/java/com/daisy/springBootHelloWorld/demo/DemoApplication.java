package com.daisy.springBootHelloWorld.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//https://start.spring.io/

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}


/*
	MVC Design Pattern == Don't Do Everything in Single Class. Create Functions for Better Code Evolution and Handling
	M -> Model
	V -> View
	C -> Controller  (Entry Point og Request in Your MicroService)

	API -- In Layman Terms API is an Contract or A Function which accepts a defined Input in Contracted Format
	Hence Called Application Programmable Interface

	Good Practices in REST API's
	Representational State Transfer Application Programming Interface
	Guidelines for Rest API's
	~ API Should be Structured Around Resources

*/