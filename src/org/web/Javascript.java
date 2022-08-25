package org.web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
	
		public static void main(String[]args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AR\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement user=driver.findElement(By.id("email"));
		WebElement pass=driver.findElement(By.id("pass"));
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		
	   JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','selenium')", user);
		js.executeScript("arguments[0].setAttribute('value','java@123')", pass);
		js.executeScript("arguments[0].click()", login);
		
		}
		
		

	}
	

