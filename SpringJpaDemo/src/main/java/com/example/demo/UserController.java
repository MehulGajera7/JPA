package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	public ServiceProvider sv;
	
	@RequestMapping(value = "/save",method = RequestMethod.GET)
	public void saveUser()
	{
		User user=new User();
		user.setUname("Mehul");
		user.setRollno(7);
		
		this.sv.save(user);
	}
	
	@RequestMapping(value = "/FindById",method = RequestMethod.GET)
	public User getUser()
	{
		return this.sv.getByUserId(1);
	}
	
	@RequestMapping(value = "/FindByList",method = RequestMe)
	public  List<User> getAll()
	{
		return this.sv.getAllUser();
	}
}
