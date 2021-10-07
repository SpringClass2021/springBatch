package com.pp.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pp.model.Registration;
import com.pp.model.UserDto;
import com.pp.repository.LoginRepository;
import com.pp.service.LoginService;


@Controller
public class LoginController{
	
	@Autowired
	public LoginService logSer;
	
	@Autowired
	public LoginRepository loginRepo;
	
	@RequestMapping("/showLogin")
	public String showLogin(Map<String, Object> map) {
		System.out.println("Inside Login Controller");
		map.put("UserDtoKey", new UserDto());
		return "login";
	}
	
	@RequestMapping(value = "/submitLogin", method = RequestMethod.POST)
	public String submitLogin(@ModelAttribute("UserDtoKey") UserDto login, Map<String, Object> map) {
		System.out.println("Email: "+login.getEmailId());
		System.out.println("Password: "+login.getPassword());
		
		//Service call
		logSer.userSignIn(login);
		
		map.put("UserDtoKey", login);
		return "login";
	}
	
	@RequestMapping("/showRegistration")
	public String showRegistration(Map<String, Object> map) {
		System.out.println("Inside Login Controller");
		map.put("registrationKey", new Registration());
		return "registration";
	}
	
	@RequestMapping(value = "/submitRegistration", method = RequestMethod.POST)
	public String submitRegistration(@ModelAttribute("RegistrationKey") Registration reg, Map<String, Object> map) {
		System.out.println("firstname: "+reg.getFirstname());
		System.out.println("lastname: "+reg.getFirstname());
		
		loginRepo.userRegistration(reg);
		
		map.put("registrationKey", reg);
		return "login";
	}
}