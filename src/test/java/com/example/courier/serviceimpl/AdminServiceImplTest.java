package com.example.courier.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.courier.model.Admin;

@SpringBootTest
class AdminServiceImplTest {
	
	@Autowired
	AdminServiceImpl asi;
//
//	@Test
//	public void testAddAdmin() {
//		Admin admin =new Admin(0,"courier","fdghjutyr",98763);
//		assertEquals("success",asi.addAdmin(admin));
//	}

//	@Test
//	void testGetAdmin() {
//		assertNotNull(asi.getAdmin(3));;
//	}

//	@Test
//	void testGetAllAdmin() {
//		assertNotNull(asi.getAllAdmin());
//
//	}

//	@Test
//	void testUpdateAdmin() {
//		Admin admin=new Admin(0,"sha","thiruvaluvar",789);
//	assertEquals("success",asi.addAdmin(admin));
//	}
//
//	@Test
//	void testDeleteAdmin() {
//		assertEquals("deleted", asi.deleteAdmin(4));
//	}
//
	@Test
	void testGetAllId() {
		assertNotNull(asi.getAllAdmin());
	}

}
