package com.example.courier.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.courier.model.User;
import com.example.courier.serviceimpl.UserServiceImpl;


@RestController
@RequestMapping("/use")
@CrossOrigin("*")
public class UserController {
	@Autowired
	UserServiceImpl service;

	@PostMapping
	public String insertUser(@RequestBody User u)

	{
		String msg = "";

		try {
			service.addUser(u);
			msg = "add Success";
		} catch (Exception s) {

			msg = "add Failure";
		}

		return msg;
	}

	@GetMapping("{id}")
	public User getUserById(@PathVariable("id") int id) {
		return service.getUser(id);

	}

	@GetMapping("/all")
	public List<User> getUser() {
		return service.getAllUser();

	}

	@PutMapping
	public String updateUser(@RequestBody User u)

	{
		String msg = "";

		try {
			service.updateUser(u);
			msg = "update Success";
		} catch (Exception s) {

			msg = "update Failure";
		}

		return msg;
	}

	@DeleteMapping("{id}")
	public String deleteUser(@PathVariable("id") int id)

	{
		String msg = "";

		try {
			service.deleteUser(id);
			msg = "del Success";
		} catch (Exception s) {

			msg = "del Failure";
		}

		return msg;
	}

}

