package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue
	private  Long ID;
	
	private String name;

	
	protected Course() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getID() {
		return ID;
	}


	
}
