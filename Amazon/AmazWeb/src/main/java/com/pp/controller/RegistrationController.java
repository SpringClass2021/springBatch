package com.pp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pp.model.UserDto;
import com.pp.service.RegistrationService;

@Controller
public class RegistrationController {

	@Autowired
	private RegistrationService registrationService;
	
	@RequestMapping("/showRegistration")
	public String showRegistration(Map<String, Object> map) {
		System.out.println("Inside Show Registration method");
		map.put("RegistrationKey", new UserDto());
		return "registration";
	}
	
	@RequestMapping(value="/submitRegistration" , method = RequestMethod.POST)
	public String submitRegistration(@ModelAttribute("RegistrationKey") UserDto registration) {
		System.out.println("Inside submitRegistration method");
		
		System.out.println("Email :"+registration.getEmailId());
		System.out.println("Password :"+registration.getPassword());
		
		registrationService.userRegistration(registration);
		return "registration";	
	}
	
}
