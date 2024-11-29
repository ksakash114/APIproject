package com.Apiproject.model;

import jakarta.persistence.*;
import lombok.Data;

@Data //reduces boilerplate code such as getter setter, tostring, hashcode,equals
@Entity
@Table(name="employe")
public class Employe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="first_name", nullable = false)
	private String firstname;
	
	@Column(name="last_name", nullable = true)
	private String lastname;
	
	@Column(name="email_id",nullable = false,unique = true)
	private String email;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
