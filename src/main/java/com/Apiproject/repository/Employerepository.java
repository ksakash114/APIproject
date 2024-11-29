package com.Apiproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Apiproject.model.Employe;

//@Repository --  no need to add the @repository annotation as jparepository will internally provides @repository annotation
public interface Employerepository extends JpaRepository<Employe,Long>{

	
}
