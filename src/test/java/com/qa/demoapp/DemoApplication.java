package com.qa.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.qa.demoapp")	//Package in which where spring looks for component
public class DemoApplication
{

	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

	}

}
