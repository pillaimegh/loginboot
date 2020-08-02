package com.lti.LoginBoot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoginDetails {

	@Id
	private int lid;
	private String firstname;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
}
