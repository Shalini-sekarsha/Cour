package com.example.courier.service;
	import java.util.List;

	import org.springframework.stereotype.Service;

import com.example.courier.model.Admin;

@Service
public interface AdminService {
		public String addAdmin(Admin admin);
		public Admin getAdmin(int aid);
		public List<Admin> getAllAdmin();
		void updateAdmin(Admin admin);
		public String deleteAdmin(int aid);
		List<Integer> getAllId();
	}

