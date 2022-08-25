package org.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {
	
	public static void main(String[]args) throws Throwable  {
		
System.setProperty("webdriver.edge.driver", "C:\\Users\\Indiaseah Quality\\eclipse-workspace\\Maybatch\\Library\\Driver\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
	
		String ExpectedUrl=("https://www.facebook.com/");
		
		driver.navigate().to(ExpectedUrl);
		
		driver.manage().window().maximize();		
	    
	    WebElement user =driver.findElement(By.id("email"));
		WebElement pass =driver.findElement(By.id("pass"));
		WebElement login =driver.findElement(By.xpath("//button[@type='submit']"));
		
	   JavascriptExecutor js =(JavascriptExecutor)driver;	
		js.executeScript("arguments[0].setAttribute('value','selenium')", user);
		
	Object text = js.executeScript("return arguments[0].getAttribute('value')",user);
		System.out.println(text);
		
		js.executeScript("arguments[0].setAttribute('value','java@123')", pass);
		
	Object text1=js.executeScript("return arguments[0].getAttribute('value')",pass);
		System.out.println(text1);	
		//js.executeScript("arguments[0].click()", login);
		
		WebElement down = driver.findElement(By.linkText("Careers"));
		
		js.executeScript("arguments[0].scrollIntoView(true)",down);
		
   
}
	}




