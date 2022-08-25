package org.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

 public  class Poly {
	
 public static void main (String[]args) throws Throwable {
		
		System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\Indiaseah Quality\\\\eclipse-workspace\\\\Maybatch\\\\Library\\\\Driver\\\\msedgedriver.exe" );
	 
	WebDriver driver=new EdgeDriver();

	 driver.navigate().to("https://www.techlistic.com/p/demo-selenium-practice.html");
	 
	 driver.manage().window().maximize();
	 
	 
	
 }


}
