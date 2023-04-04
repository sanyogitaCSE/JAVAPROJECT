package com.Tns.userservice;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserServiceRepository repo;
	public List<User> listAll()
	{
		return repo.findAll();
		
	}
	public User get(Integer uid)
	{
		return repo.findById(uid).get();
		
	}
	public void delete(Integer uid)
	{
		repo.deleteById(uid);
	}
	public void save(User usr) {
     repo.save(usr);}
}
