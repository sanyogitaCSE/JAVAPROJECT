package com.Tns.userservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class User {
	
	 private Integer uid;
     private String uname;
     private String gender;
     private String location;
     private String mailid;
     private Long phone;
     private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer uid, String uname, String gender, String location, String mailid, Long phone, String password) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.gender = gender;
		this.location = location;
		this.mailid = mailid;
		this.phone = phone;
		this.password = password;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
