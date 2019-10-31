package com.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Model{
	
	@Id
	String id;
	int rollno;
	String name;
	int phoneno;
	String email;
	public Model(String name, int phoneno, String email) {
		super();
		
		this.name = name;
		this.phoneno = phoneno;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Model [name=" + name + ", phoneno=" + phoneno + ", email=" + email + "]";
	}
	
}
