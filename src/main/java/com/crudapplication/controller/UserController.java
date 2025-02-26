package com.crudapplication.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudapplication.model.UserLogin;

@RestController
public class UserController {
	
	@PostMapping("/user")
	public UserLogin addUser() {
		return null;
		
	}

}
