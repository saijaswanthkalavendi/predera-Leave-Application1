package com.application.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.application.model.UserDetails;
import com.application.service.UserDetailsService;

@Controller
public class HomeController {

	@Autowired
	UserDetailsService service1;

	@RequestMapping("/")
	public ModelAndView fun1() {
		System.out.println("HomeController:::@RequestMapping:::/");
		return new ModelAndView("index");
	}

	
	@ModelAttribute("UserDetails")
	public UserDetails fun2() {
		System.out.println("HomeController:::@modelattribute:::UserDetails");
		return new UserDetails();

	}

	

	@RequestMapping(value = "storeUser", method = RequestMethod.POST)
	public String addUser(@Valid @ModelAttribute("UserDetails") UserDetails userDetails, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("HomeController:::@RequestMapping:::storeuser:::haserrors");
			return "registeredsucessfully";
		}

		service1.saveOrupdate(userDetails);
		System.out.println("HomeController:::@RequestMapping:::storeuser:::values saved in db");
		return "registrationfailed";

	}

}