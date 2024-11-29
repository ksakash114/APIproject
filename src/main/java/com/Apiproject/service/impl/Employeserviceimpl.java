package com.Apiproject.service.impl;

import org.springframework.stereotype.Service;

import com.Apiproject.model.Employe;
import com.Apiproject.repository.Employerepository;
import com.Apiproject.service.Employeservice;

@Service
public class Employeserviceimpl implements Employeservice {

	private Employerepository employerepository;
	
	/*
	 * public Employeserviceimpl(Employerepository employerepository) {
	 * this.employerepository=employerepository; }
	 */
	
	@Override
	public Employe saveemployee(Employe employe) {
		// TODO Auto-generated method stub
		return employerepository.save(employe);
	}

}
