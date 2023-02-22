package com.myvision.restapi.beginer.beginer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// display static string 
//@RestController
public class homeEx1 {
String HomeTitle=null;

@RequestMapping(method = RequestMethod.GET, path = "/Home")
	public String homepage() {
	HomeTitle="Welcome to MyVision \n "
			+ "	1. ADD \n"
			+ "	2. SUB \n"
			+ " 3. Mul";
		return HomeTitle;
		
	}

}
