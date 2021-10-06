package com.pp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pp.model.UserDto;

@Repository
public class LoginRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public List<UserDto> adminSignIn(String emailId, String password) {
		System.out.println("Repo Email >> "+emailId);
		System.out.println("Repo Password >> "+password);

		@SuppressWarnings("unchecked")
		List<UserDto> login = (List<UserDto>) hibernateTemplate.find("from UserDto al where al.emailId = ? and al.password = ?", emailId, password);
		return login;
	}
}
