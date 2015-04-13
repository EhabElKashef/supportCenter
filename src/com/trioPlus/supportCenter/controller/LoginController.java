package com.trioPlus.supportCenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/")

public class LoginController {
	 @RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	    public String login(ModelMap model) {
	        return "login";
	    }
	 
	    @RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
	    public String loginerror(ModelMap model) {
	        model.addAttribute("error", "true");
	        return "denied";
	    }
	    @RequestMapping(value = "/login", method = RequestMethod.GET)
		public String login() {
			//logger.info("user logged in");
			return "index";
		}
	    @RequestMapping(value = "/logout", method = RequestMethod.GET)
	    public String logout(ModelMap model) {
	        return "logout";
	    }
	    
	    @RequestMapping(value = "/landing", method = RequestMethod.GET)
		public String landing() {
			//logger.info("user logged in");
			return "landing";
		}
	 
}
