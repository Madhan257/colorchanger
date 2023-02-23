package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class colorchanger {
	@GetMapping("/ok")
	public String my() {
		String color="pink";
		return "My favorite color is "+color;
	}

}

