package com.qa.demoapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController
{
	//Dependency Injection
	//WelcomeService service = new WelcomeService();
	@Autowired
	WelcomeService service ;
	
	///welcome
	@RequestMapping("/welcome")
	public String welcome()
	{
		return service.retriveWelcomeMessage();
	}
}
