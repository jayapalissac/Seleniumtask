package org.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Get {
	
	public static void main(String[]args) {
		
System.setProperty("webdriver.edge.driver", "C:\\Users\\Indiaseah Quality\\eclipse-workspace\\Maybatch\\Library\\Driver\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
	
		String ExpectedUrl=("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.navigate().to(ExpectedUrl);
		
		driver.manage().window().maximize();
		
	 //WebElement user =driver.findElement(By.xpath("//input[@type='text']"));
	 
	 //user.sendKeys("Selenium");
	 
	// String attribute =user.getAttribute("value");
	 
	 //System.out.println(attribute);
	 
	 
	 driver.switchTo().frame("frame1");
     driver.switchTo().frame("frame3");
     
     driver.findElement(By.xpath("//input[@id='a']")).click();
	 driver.switchTo().parentFrame();
	 WebElement element =driver.findElement(By.xpath("//b[@id='topic']"));
	 
	 String text = element.getText();
	 System.out.println(text); 
	 WebElement input =driver.findElement(By.xpath("(//input)[1]")); 
	 input.sendKeys("Frame Concept");
	 
	driver.switchTo().defaultContent();
	 WebElement element1 =driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
	String print=element1.getText();
	System.out.println(print);
	 
	//WebElement name= driver.findElement(By.xpath("//b[@style='color:green']"));
	
//	String text1 = name.getText();
	
	//System.out.println(text1);
	
	
	
	
	 
	
	
	  
	 
		
		
	}

}
