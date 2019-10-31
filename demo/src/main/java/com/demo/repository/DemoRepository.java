package com.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Model;
@Repository
public interface DemoRepository extends MongoRepository<Model, String> {

	public Model findByname(String name);
	public List<Model> findByemail(String email);
}
