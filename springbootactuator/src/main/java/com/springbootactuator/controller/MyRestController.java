package com.springbootactuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@GetMapping(value = "welcome")
	public String sayHello()
	{
		return "welcome to actuator";
	}
}
