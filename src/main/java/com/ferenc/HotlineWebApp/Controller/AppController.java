package com.ferenc.HotlineWebApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class AppController {

	
	@RequestMapping("/hotlinehome")
	public String HotlineWebApp() {
		
		return "mainPage";
		
	}
	
}
