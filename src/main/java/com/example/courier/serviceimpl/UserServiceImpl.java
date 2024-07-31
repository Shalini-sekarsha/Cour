package com.example.courier.serviceimpl;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.courier.model.User;
import com.example.courier.repository.UserRepo;




@Service
public class UserServiceImpl  {
	@Autowired
 UserRepo repo;
	
	public String addUser(User user) {
		return (repo.save(user));
	}

	public User getUser(int id) {
		
		return repo.findById(id) ;
	}
 
public List<User> getAllUser(){
	return repo.findAll();
}


public void updateUser(User user) {
	repo.update(user);
}	
public String deleteUser(int id) {
	return (repo.deleteById(id));
}
}
