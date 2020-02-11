package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


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
	
	public User UpdateUser(Integer id)
	{
		return this.jr.findByUid(id);
	}
	
	public void update(User user)
	{
		this.jr.save(user);
	}
}
