//package com.example.courier;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//class Add {
//
//	@Test
//	void testMain() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://localhost:3000/");
//		assertEquals("React App",driver.getTitle());	
//	}
//	@Test
//	void test() {
//			WebDriver driver = new ChromeDriver();
//			driver.get("http://localhost:3000/create");
//			driver.findElement(By.name("name")).sendKeys("Ekart");
//	        driver.findElement(By.name("address")).sendKeys("madurai");
//	        driver.findElement(By.name("scity")).sendKeys("chennai");
//	        driver.findElement(By.name("ptype")).sendKeys("package");
//	        driver.findElement(By.name("selectId")).sendKeys("4");
//
//	        driver.findElement(By.name("button")).click();
//	        
//	        assertEquals("Data added Successfully", "Data added");
//		}
//	@Test
//	void test1() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://localhost:3000/create");
//	    driver.findElement(By.name("name")).sendKeys("Wrapper");
//	    driver.findElement(By.name("address")).sendKeys("Street");
//	    driver.findElement(By.name("scity")).sendKeys("Thambaram");
//	    driver.findElement(By.name("ptype")).sendKeys("Documents");
//	    driver.findElement(By.name("selectId")).sendKeys("4");
//	    driver.findElement(By.name("button")).click();
//	   
//    
//	}
//		
//}
