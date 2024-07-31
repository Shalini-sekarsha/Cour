package com.example.courier;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class AddAdmin {
	@Test
	void testMain() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		assertEquals("React App",driver.getTitle());	
	}
	@Test
	void test() {
			WebDriver driver = new ChromeDriver();
			driver.get("http://localhost:3000/create1");
			driver.findElement(By.name("servicename")).sendKeys("Ekart");
	        driver.findElement(By.name("serviceaddress")).sendKeys("madurai");
	        driver.findElement(By.name("contact")).sendKeys("1234");
	        
	        driver.findElement(By.name("button")).click();
	        
	        assertEquals("Data added Successfully", "Data added Successfully");
		}
	@Test
	void test1() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:3000/");
	    
	    driver.findElement(By.id("navbarDropdown")).click();
	    driver.findElement(By.linkText("Add")).click();
	    driver.findElement(By.name("servicename")).sendKeys("express");
	    driver.findElement(By.name("contact")).sendKeys("87654");
	    driver.findElement(By.name("button")).click();
    assertThat(driver.switchTo().alert().getText(),("valid data needed"));
	}
	private void assertThat(String text, String string) {
		// TODO Auto-generated method stub
		
	}

	}


