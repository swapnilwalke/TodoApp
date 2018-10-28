package com.in28minutes.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

//Login controller
//handler
@Controller
//@SessionAttributes("username")
public class WelcomeController {

	/*@Autowired
	LoginService service;*/

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		model.put("username","in28minutes");
		return "welcome";
	}

	/*@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showLoginRequest(@RequestParam String username, @RequestParam String password, ModelMap model) {
		if (service.validateUser(username, password)) {
			model.put("username", username);
			model.put("password", password);
			model.put("success", "Login Successful..Cheers!");
			return "welcome";
		} else {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}

	}*/
}
