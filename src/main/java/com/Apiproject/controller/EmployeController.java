package com.Apiproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Apiproject.model.Employe;
import com.Apiproject.service.Employeservice;

@RestController
@RequestMapping("/api/employe")
public class EmployeController {

	
	private Employeservice employeserivce;
	
	/*
	 * public EmployeController(Employeservice employeserivce) {
	 * this.employeserivce=employeserivce; }
	 */
	
	@PostMapping()
	public  ResponseEntity<Employe> saveemploye(@RequestBody Employe employe)
	{
		return new ResponseEntity<Employe>(employeserivce.saveemployee(employe), HttpStatus.CREATED);
	}
}
