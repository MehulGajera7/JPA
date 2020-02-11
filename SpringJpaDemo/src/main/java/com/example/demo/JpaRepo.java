package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRepo extends JpaRepository<User, Integer>{

	//public User getAllDetails();
	public User findByUid(Integer id);
}
