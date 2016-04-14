package com.anna.poc.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/")
	public String index() {
		return "Hello, this is my first spring boot project!!";
	}

}
