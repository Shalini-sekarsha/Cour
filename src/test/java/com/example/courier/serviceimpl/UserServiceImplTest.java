package com.example.courier.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.courier.model.User;
@SpringBootTest
class UserServiceImplTest {
@Autowired
UserServiceImpl usi;
//	@Test
//	void testAddUser() {
//		User user=new User(0,"sha","thirubaluvar","madurai","doc",null);
//		assertEquals("success",usi.addUser(user));
//	}

//
//	@Test
//	void testGetUser() {
//		assertNotNull(usi.getUser(3));
//	}

//	@Test
//	void testGetAllUser() {
//		assertNotNull(usi.getAllUser());	
//		}

//	@Test
//void testUpdateUser() {
//		User user=new User(0,"sha","thiruvaluvar","madurai","doc",null);
//	assertEquals("success",usi.addUser(user));
//}

	@Test
	void testDeleteUser() {
		assertEquals("deleted", usi.deleteUser(3));
}


}
