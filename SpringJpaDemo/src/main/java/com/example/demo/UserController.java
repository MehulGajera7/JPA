package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	public ServiceProvider sv;

	@RequestMapping(value = "/save", method = RequestMethod.GET)
	public void saveUser() {
		User user = new User();
		user.setUname("Mehul");
		user.setRollno(7);

		User user1 = new User();
		user1.setUname("Vishal");
		user1.setRollno(10);

		User user2 = new User();
		user2.setUname("Chirag");
		user2.setRollno(11);

		User user3 = new User();
		user3.setUname("Utsav");
		user3.setRollno(12);

		User user4 = new User();
		user4.setUname("Gunjan");
		user4.setRollno(13);

		User user5 = new User();
		user5.setUname("Pratik");
		user5.setRollno(14);

		this.sv.save(user);
		this.sv.save(user1);
		this.sv.save(user2);
		this.sv.save(user3);
		this.sv.save(user4);
		this.sv.save(user5);
	}

	@RequestMapping(value = "/FindById", method = RequestMethod.GET)
	public User getUser() {
		return this.sv.getByUserId(2);
	}

	@RequestMapping(value = "/FindByList", method = RequestMethod.GET)
	public List<User> getAll() {
		return this.sv.getAllUser();
	}
	
	@RequestMapping(value = "/UpdateById",method = RequestMethod.GET)
	public void update()
	{
		User user=this.sv.UpdateUser(2);
		user.setUname("Gopi");
		user.setRollno(18);
		this.sv.update(user);
	}
}
