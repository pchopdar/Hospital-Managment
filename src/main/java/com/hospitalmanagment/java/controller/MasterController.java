package com.hospitalmanagment.java.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hospitalmanagment.java.pojo.Login;
import com.hospitalmanagment.java.service.LoginService;

@RestController
public class MasterController {

	@Autowired
	LoginService lservice;
	
	@RequestMapping("/")
	public ModelAndView welcome() {
		
		ModelAndView modelAndView = new ModelAndView();
        Login user = new Login();
        modelAndView.addObject("user", user);
        modelAndView.setViewName("index");
        return modelAndView;
		//return "welcome";
	}
	@RequestMapping("/c")
	public ModelAndView contactus() {
		
		ModelAndView modelAndView = new ModelAndView();
        Login user = new Login();
        modelAndView.setViewName("contact");
        return modelAndView;
		//return "welcome";
	}

	
	
	@RequestMapping(value="/detail", produces="application/json")
	public List LoginDetail() {
		List list=new ArrayList<Login>();
		list=lservice.getLoginDetails();
		System.out.println(list);
		return list;
	}
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
    public ModelAndView showLoginPage(ModelAndView model){
       model.setViewName("login");
		return model;
    }

	
	 @RequestMapping(value="/login", method = RequestMethod.POST)
	    public ModelAndView showWelcomePage(ModelMap model, @RequestParam String mobileno, @RequestParam String passcode ){
		 ModelAndView model1 = new ModelAndView();
		 System.out.println();
	        String isValidUser = lservice.validateUser(mobileno, passcode);

	        if (isValidUser=="error") {
	            model.put("errorMessage", "Invalid Credentials");
	            model1.setViewName("login");
	            return model1;
	        }

	        model.put("emailid", mobileno);
	        model.put("password", passcode);
	        model1.setViewName("welcome");
	        return model1;
	    }

}

