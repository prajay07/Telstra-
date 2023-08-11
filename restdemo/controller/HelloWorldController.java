package com.telstra.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/vl")


public class HelloWorldController {
	@GetMapping("/messege")
	public String displayMessege()
	
	{
		return "Welcome to Api's rest";
	}
	
	@GetMapping("/home")
	public String display2() {
		return "thiis is home ";
	}
	
	@GetMapping ("/about us")
	public String display3() {
		return "about us ";
	}
}
