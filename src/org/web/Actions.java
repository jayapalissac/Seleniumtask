package org.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Actions {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Indiaseah Quality\\eclipse-workspace\\Maybatch\\Library\\Driver\\msedgedriver.exe");
		
		WebDriver driver=new EdgeDriver();
		
		driver.navigate().to("https://www.flipkart.com/");
		
		WebElement elemnt= driver.findElement(By.xpath("(//button)[2]"));
		
		
		
	}

}
