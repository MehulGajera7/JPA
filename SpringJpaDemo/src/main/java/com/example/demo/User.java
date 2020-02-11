package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer uid;
	
	@Column
	private String uname;
	
	@Column
	//@UniqueElements(message = "Please Enter Unique Roll No")
	private Integer rollno;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Integer getRollno() {
		return rollno;
	}

	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	
	
}
