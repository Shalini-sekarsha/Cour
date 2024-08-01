//package com.example.courier;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//class Update {
//
//	@Test
//	void test() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://localhost:3001/update/:id");
//        driver.findElement(By.name("name")).sendKeys("romo");
//        driver.findElement(By.name("address")).sendKeys("Kolathur");
//        driver.findElement(By.name("scity")).sendKeys("Thiruchy");
//        driver.findElement(By.name("ptype")).sendKeys("package");
//        driver.findElement(By.name("button")).click();
//        assertEquals("User added Successfully", "User added ");
//	}
//	
//
//}
