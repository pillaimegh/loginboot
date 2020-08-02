package com.lti.LoginBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.LoginBoot.dao.LoginDao;
import com.lti.LoginBoot.model.LoginDetails;


@Controller
public class LoginController {
	
	@Autowired
	LoginDao repo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("adddata")
	public String  addStudent(LoginDetails login) {
		repo.save(login);
		return "home.jsp";
	}
	
}
