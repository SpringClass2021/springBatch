package com.pp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.pp.model.UserDto;

@Repository
public class RegistrationRepository {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public UserDto userRegistration(UserDto registration) {
		System.out.println("Inside Repo userRegistration method");
		if(registration != null) {
			hibernateTemplate.save(registration);
			
			return registration;
		}else {
			return null;
		}
	}

}
