package com.example.courier.repository;


	import java.util.List;

	import org.springframework.stereotype.Repository;

import com.example.courier.model.User;

	


	@Repository
	public interface UserRepo{

		String save(User user);

		User findById(int id);

		List<User> findAll();

		void update(User user);

		String deleteById(int id);

	}

		



