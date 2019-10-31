 package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Model;
import com.demo.services.DemoServices;
@RestController 
public class DemoController 
{
	@Autowired
	private DemoServices DemoServices;
	
//	@RequestMapping("/home")
//	public String home()
//	{
//		return "home";
//	}

	@RequestMapping("/create")
	public String create(@RequestParam String name, @RequestParam int phoneno, @RequestParam String email)
	{
	Model m=DemoServices.create(name, phoneno, email);
		return m.toString();
	}
	
	@RequestMapping("/get")
	public Model getmodel(@RequestParam String name)
	{
		return DemoServices.getByname(name);
	}
	@RequestMapping("/getAll")
	public List<Model> getAll()
	{
	return DemoServices.getAll();
	}
	@RequestMapping("/update")
	public String update(@RequestParam String name, @RequestParam int phoneno, @RequestParam String email)
	{
		Model m=DemoServices.update(name, phoneno, email);
		return m.toString();
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam String name)
	{
	DemoServices.delete(name);
	return "Deleted "+name;
	}
	@RequestMapping("/deleteAll")
	public String deleteAll()
	{
		DemoServices.deleteAll();
		return "deleted All records";
		
	}
}
