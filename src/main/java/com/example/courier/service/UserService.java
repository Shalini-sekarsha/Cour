package com.example.courier.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.courier.model.User;

	@Service
	public interface UserService {
	public String addUser(User user);
	public User getUser(int id);
	public List<User> getAllUser();
	void updateUser(User user);
	public String deleteUser(int id);
	}

