package com.Tns.userservice;

import java.util.List;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class UserService_Controller {
	@Autowired
	private UserService ur;
	@GetMapping("/userservice")
	public List<User> list()
	{
		return ur.listAll();
	}
	@GetMapping("/userservice/(uid)")
	public ResponseEntity<User> get(@PathVariable Integer uid)
	{
		try
		{
			User us=ur.get(uid);
			return new ResponseEntity<User>(us,HttpStatus.OK);
			
		}
		catch (NoResultException e)
		{
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/user/userservice")
    public void  add(@RequestBody User usr)
    {
		ur.save(usr);
    }
	@PutMapping("/userservice/(uid)")
	public ResponseEntity<?> update(@RequestBody User usr,@PathVariable Integer uid)
	{
    	@SuppressWarnings("unused")
		User existuser=ur.get(uid);
    	ur.save(usr);
    	return new ResponseEntity<>(HttpStatus.OK);
    	
    }
	@DeleteMapping("/userservice/(uid)")
    public void delete (@PathVariable Integer uid)
    {
    	ur.delete(uid);
    }
}
