package com.qa.demoapp;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService
{
	
	//Spring to manage this bean and create instance of this
	
	public String retriveWelcomeMessage()
	{
		return "Hello, Good Morning !!";
	}
}
