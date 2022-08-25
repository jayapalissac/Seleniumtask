package org.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowsHandling {
	
	public static void main(String[]args) throws Exception {
		
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Indiaseah Quality\\eclipse-workspace\\Maybatch\\Library\\Driver\\msedgedriver.exe");
				
	WebDriver driver= new EdgeDriver();
			
	String ExpectedUrl=("https://flipkart.com");
				
    driver.navigate().to(ExpectedUrl);
				
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
 	
	WebElement quit = driver.findElement(By.xpath("(//button)[2]"));
	
	quit.click();
	
    WebElement name = driver.findElement(By.xpath("//input[@name='q']"));
	
	  name.sendKeys("redmi mobiles",Keys.ENTER);
	 
	  Thread.sleep(2000);
	  
	  String parent = driver.getWindowHandle(); 
	  System.out.println(parent);
	  Thread.sleep(2000);
	  WebElement select = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")); 
	  select.click();
	  Thread.sleep(2000);
	  driver.switchTo().window(parent);  
	  WebElement select1 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]")); 
	  select1.click();
	  Thread.sleep(2000);
	  driver.switchTo().window(parent);
	  WebElement select2 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]")); 
	  select2.click();
	  Thread.sleep(2000);
	  driver.switchTo().window(parent);
	 
	  Set<String> child =driver.getWindowHandles();
	  System.out.println(child); 
	  Thread.sleep(2000);
	  List<String>multiwindow =new ArrayList<>(child);
	  driver.switchTo().window(multiwindow.get(1)); 
	  Thread.sleep(2000);
	  WebElement print =driver.findElement(By.xpath("//span[@class='B_NuCI']")); 
	  Thread.sleep(2000);
	  String text=print.getText();  
	  System.out.println(text);	   
	   
}
}