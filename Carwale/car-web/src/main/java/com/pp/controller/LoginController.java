package com.pp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pp.model.User;
import com.pp.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/ShowLogin")
	public String viewLogin(Map<String,Object> map) {
		
		System.out.println("Inside Controller");
		
		User user=new User();
		map.put("userObject", user);
		
		return "Login";
		
	}
	
	@RequestMapping(value= "/userSignIn" , method=RequestMethod.POST)
	public String signAction(@ModelAttribute("userObject") User user) {
		
		System.out.println("Inside Post Controller");
		System.out.println("Email is:"+user.getEmail());
		System.out.println("Password is:"+user.getPassword());
		
		loginService.userSignIn(user);
		
		return "Login";
		
	}
}
