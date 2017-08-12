package com.theironyard.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller //tells java to work with HTTP
@RequestMapping("/calculate") //this controller will handle things that start with /calculate

public class CalculateController {
	
	@GetMapping("")
	public String pointsToThePage() {
		return "calculation/calculation-form-holder";
	}
	
	@PostMapping("")
	public String returnsTheSum(double left, double right, Model model) {
		double result = left + right; 
		model.addAttribute("result", result);	//must create a model so that {{mustache}} can display it in HTML, blue quotes correlate to HTML value 	
		
		return "calculation/calculation-result";
	}
	

}
