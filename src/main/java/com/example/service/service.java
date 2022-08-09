package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.daoRepo;

@Service
public class service {
	
	@Autowired
	daoRepo dao;
	
	public String getdata() {
		
		return dao.getdata();
	}

}
