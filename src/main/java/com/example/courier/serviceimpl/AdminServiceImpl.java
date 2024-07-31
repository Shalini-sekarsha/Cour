package com.example.courier.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.courier.model.Admin;
import com.example.courier.repository.AdminRepo;
import com.example.courier.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminRepo repo;

	
	public String addAdmin(Admin admin) {
		return (repo.save(admin));
	}

	
	public Admin getAdmin(int aid) {

		return repo.findById(aid);
	}

	
	public List<Admin> getAllAdmin() {
		return repo.findAll();
	}

	
	public void updateAdmin(Admin admin) {
		repo.update(admin);
	}

	public String deleteAdmin(int aid) {
		return (repo.deleteById(aid));
	}

	public List<Integer> getAllId() {
		return repo.getIDList();

	}

}
