package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;

import antlr.collections.List;

@Service
public class ServiceProvider{

	@Autowired
	public JpaRepo jr;
	
	public void save(User user)
	{
		this.jr.save(user);
	}
	
	public User getByUserId(Integer uid)
	{
		return this.jr.findByUid(uid);
	}
	
	public List<User> getAllUser()
	{
		return this.jr.findAll();
	}
}
