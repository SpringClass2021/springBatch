package com.pp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pp.model.UserDto;
import com.pp.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;

	public void userSignIn(UserDto login) {

		List<UserDto> list = loginRepository.adminSignIn(login);
		if(list != null) {
			for (UserDto userDto : list) {
				System.out.println(userDto);
			}
		}else {
			System.out.println("User Not Found!");
		}
	}
}
