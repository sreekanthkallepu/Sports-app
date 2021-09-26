package com.play.SPORTS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelowWorldController {
	
	@GetMapping("/getWelcome")
	public String welcomeAPI() {
		
		return "welcome to srikanth";
		
	}
	
	

}
