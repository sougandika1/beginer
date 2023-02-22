package com.myvision.restapi.beginer.beginer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Add {
	String HomeTitle=null;
	int a=30;
	int b=10;
	//@RequestMapping(method = RequestMethod.GET, path = "/Add")
	@GetMapping(path = "/Add")
	public String Add() {
		
		int c = a+b;
		return "Sum of a&b = "+ c;
	}
}
