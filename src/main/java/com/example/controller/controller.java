package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.service.service;

@Controller
@RequestMapping("/karthik")
public class controller {
	
	
	@Autowired
	service serv;
	
	@RequestMapping(value="/getinfo",method=RequestMethod.GET)
	public String getvalue() {
		return serv.getdata();		
	}

}
