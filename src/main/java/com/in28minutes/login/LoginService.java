package com.in28minutes.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String username, String password) {
		return username.equalsIgnoreCase("shweta") && password.equalsIgnoreCase("swapnil");
	}
}
