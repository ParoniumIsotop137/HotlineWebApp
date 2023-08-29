package com.ferenc.HotlineWebApp.Controller;

import java.time.LocalDate;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ferenc.HotlineWebApp.entity.HotlineDataWeb;

@Controller

public class AppController {

	
	@GetMapping("/hotlinehome")
	public String HotlineWebApp() {
		
		return "mainPage";
		
	}
	
	@GetMapping("/register")
    public String showRegPage() {
        return "regPage";
    }
	
	@PostMapping("/register")
	public String fromRegPage(@ModelAttribute HotlineDataWeb data, @RequestParam(name = "isClosed", required = false, defaultValue = "false") boolean isClosed) {
		data.setClosed(isClosed);
		data.setDate();
		System.out.println(data.toString());
		return "regPage";
		
	}
	
}
