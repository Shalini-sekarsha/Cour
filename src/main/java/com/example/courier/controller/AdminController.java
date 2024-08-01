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

import com.example.courier.model.Admin;
import com.example.courier.service.AdminService;

@RestController
@RequestMapping("/adm")
@CrossOrigin("http://localhost:3000")
public class AdminController {
	

	@Autowired
	AdminService service;
	
@PostMapping
public String insertAdmin(@RequestBody Admin a)

{
	String msg="";
	
	try
	{
		service.addAdmin(a);
		msg=" add Success";
	}
	catch(Exception s) 
	{
		
		msg=" add Failure";
	}

	return msg;
}
@GetMapping("{aid}")	
public Admin getAdminById(@PathVariable("aid")int aid) {
return service.getAdmin(aid);

}
@GetMapping("/all")	
public List <Admin> getAdminl()
{
return service.getAllAdmin();

}
@PutMapping
public String updateAdmin(@RequestBody Admin a)

{
	String msg="";
	
	try
	{
		service.updateAdmin(a);
		msg="update Success";
	}
	catch(Exception s) 
	{
		
		msg="update Failure";
	}

	return msg;
}
@DeleteMapping("{aid}")
public String deleteAdmin(@PathVariable("aid") int aid )

{
	String msg="";
	
	try
	{
		service.deleteAdmin(aid);
		msg="del Success";
	}
	catch(Exception s) 
	{
	
		msg="del Failure";
	}

	return msg;
}
@GetMapping("/idlist")
public List<Integer> getIDList(){
	return service.getAllId();
}
}






