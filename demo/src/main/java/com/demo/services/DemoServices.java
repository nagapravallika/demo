package com.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Model;
import com.demo.repository.DemoRepository;
@Service
public class DemoServices 
{

	@Autowired
	private DemoRepository DemoRepository;
	//create Operation
	public Model create(String name, int phoneno, String email)
	{
		return DemoRepository.save(new Model(name, phoneno, email));
		 
	}
	
	//Retrieve Operation
	public List<Model> getAll()
	{
		 return DemoRepository.findAll();
	}
	public Model getByname(String name)
	{
		return DemoRepository.findByname(name);
	}
	//Update Operation
	public Model update(String name, int phoneno, String email)
	{
		Model m=DemoRepository.findByname(name);
		m.setName(name);
		m.setPhoneno(phoneno);
		m.setEmail(email);
		return DemoRepository.save(m);
		
	}
	//Delete Operation
	public void deleteAll()
	{
		DemoRepository.deleteAll();
	}
	public void delete(String name)
	{
		Model m=DemoRepository.findByname(name);
		DemoRepository.delete(m);
	}
} 
