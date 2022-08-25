package org.web;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task3 {
	
	public static void main(String[]args) throws Throwable {
		
		System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\Indiaseah Quality\\\\eclipse-workspace\\\\Maybatch\\\\Library\\\\Driver\\\\msedgedriver.exe" );
		
		WebDriver driver=new EdgeDriver();
		   
    String Expectedurl=("https://www.flipkart.com");
	
		driver.navigate().to(Expectedurl);
	
		driver.manage().window().maximize();
		 
	WebElement c=driver.findElement(By.xpath("//button[text()='✕']"));
	c.click();
	
	WebElement input =driver.findElement(By.xpath("//input[@name='q']"));
	input.sendKeys("redmeimobiles",Keys.ENTER);
	Thread.sleep(3000);
	WebElement name =driver.findElement(By.xpath("(//div[@class='_4rR01T'])"));
	name.click();
	String text =name.getText();
	System.out.println(text);
	
//	List<WebElement> name =driver.findElements(By.xpath("(//div[@class='_4rR01T'])"));  
//	
//	System.out.println(name.size());
//	
//	 for(int i=0;i<name.size();i++) {
//		 
//		 WebElement element =name.get(i);
//		 
//		 String text=element.getText();
//		 
//		 System.out.println(text);
//	 }
	//String s =((WebElement) name).getText();

//		WebElement user =driver.findElement(By.id("email"));
//		
//		WebElement pass=driver.findElement(By.id("pass"));
//		
//		WebElement button=	driver.findElement(By.xpath("//button[@type='submit']"));
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//	
//		js.executeScript("arguments[0].setAttribute('value','jayapal')",user);
//		Thread.sleep(2000);
//		Object text =js.executeScript("return arguments[0].getAttribute('value')",user);
//		System.out.println(text);
//		
//		js.executeScript("arguments[0].setAttribute('value','636939690')",pass);
//		Thread.sleep(2000);
//		Object text1 =js.executeScript("return arguments[0].getAttribute('value')",pass);
//		System.out.println(text1);
//	
//	    //js.executeScript("arguments[0].click()",login);
//		
//		//Thread.sleep(2000);
//		WebElement sc=driver.findElement(By.linkText("Games"));
//		
//		js.executeScript("arguments[0].scrollIntoView(true)",sc);
//		
//		TakesScreenshot t=(TakesScreenshot)driver;
//		
//		Thread.sleep(3000);
//		js.executeScript("arguments[0].scrollIntoView(false)", user);
//		
		
			
	}

}
