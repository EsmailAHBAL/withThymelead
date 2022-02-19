package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.service.JServiceImp;

@Controller
public class Jcontroller {

	@Autowired
	JServiceImp  imp;
	
	@GetMapping(value="/com")
	public String Test(Model model)
	{  
		model.addAttribute("joke",imp.getJokes());
		return "index";
	}
	
}
