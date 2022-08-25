package org.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Actionsroobot {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Indiaseah Quality\\eclipse-workspace\\Maybatch\\Library\\Driver\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
				
		String ExpectedUrl=("https://www.flipkart.com/");
					
	    driver.navigate().to(ExpectedUrl);
				
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		
		
	 //  WebElement tv=driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[2]"));
	   
	 
		
	}

}
