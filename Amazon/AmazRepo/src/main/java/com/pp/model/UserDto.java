package com.pp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class UserDto {

	@Id
	@Column(name="firstname")
	private String firstname;

	@Column(name="lastname")
	private String lastname;

	@Column(name="mobile")
	private String mobile;

	@Column(name="emailId")
	private String emailId;

	@Column(name="password")
	private String password;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return "[firstname:"+this.getFirstname()+" lastname:"+this.getLastname()+" mobile:"+this.getMobile()+" email:"+this.getEmailId()+" password:"+this.getPassword()+"]";
	}
}
