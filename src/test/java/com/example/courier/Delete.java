package com.example.courier;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Delete {
WebDriver driver=new ChromeDriver();
	@Test
	void test() {
		 driver.get("http://localhost:3001/view");
		 WebElement deleteButton =   driver.findElement(By.xpath("//*[@id=\"body\"]/div/table/tbody/tr[5]/td[7]/button"));
		 deleteButton.click();
		    
		  }
	

}
