package com.te.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MyController {
	@GetMapping("/test")
	public String test(Model model) {
		String s="Babu";
		model.addAttribute("name",s);
		return "test";
		
	}
	@GetMapping("/test2")
	public String test(ModelMap map) {
		String s="Kattappa";
		map.addAttribute("mama",s);
		return "test";
	}
	

}
