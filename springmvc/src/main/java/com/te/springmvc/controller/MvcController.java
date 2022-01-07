package com.te.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.te.springmvc.register.Register;
@Controller
public class MvcController {
	
	@RequestMapping("/spider")
	public String home() {
		return "home";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping(path = "/login" ,method = RequestMethod.POST)
	public String log(@RequestParam("username") String username,@RequestParam("password")String password) {
//		String username = req.getParameter("username");
//		String password = req.getParameter("password");
		if(username.isEmpty()) {
			return "failure";
		}
		return "success";
		
	}
	
	@GetMapping("/register")
	public String reg() {
		return "register";
		
	}
	@PostMapping("/register")
	public String register(@ModelAttribute Register reg) {
		System.out.println(reg.getName()+","+reg.getEmail()+","+reg.getPhoneNo()+","+reg.getAddress());
	
		return "success";
		
	}
	

}
