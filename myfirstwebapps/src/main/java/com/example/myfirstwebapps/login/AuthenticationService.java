package com.example.myfirstwebapps.login;


import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("dumb");
		boolean isValidPassword = password.equalsIgnoreCase("shit");
		
		return isValidUserName && isValidPassword;
	}
}