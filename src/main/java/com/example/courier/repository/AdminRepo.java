package com.example.courier.repository;


	import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.courier.model.Admin;





		@Repository
		public interface AdminRepo{
			@Query("select aid from Admin")
			public List<Integer> getIDList();

			public String save(Admin admin);

			public Admin findById(int pid);

			public List<Admin> findAll();

			public void update(Admin admin);

			public String deleteById(int aid);
		}
		


