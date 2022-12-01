package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(value = "/")
	public String guestDetails() {
		return "Welcome to Heineken Experience Amsterdam";
	}
	@GetMapping (value = "say/{name}")
	public String sayGreetings (@PathVariable ("name") String name){
		return "Welcome to Amsterdam " + name;
		
	}

}
