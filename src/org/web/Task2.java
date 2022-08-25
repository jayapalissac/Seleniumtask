package org.web;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Task2 {
	
public static void main(String[]args) throws Throwable {
		
		System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\Indiaseah Quality\\\\eclipse-workspace\\\\Maybatch\\\\Library\\\\Driver\\\\msedgedriver.exe" );
		
		WebDriver driver=new EdgeDriver();
		
		String Expectedurl=("https://www.flipkart.com/");
		
		driver.navigate().to(Expectedurl);
		
		driver.manage().window().maximize();
	
		
//		WebElement element=driver.findElement(By.xpath("//button[text()='a']"));
//		element.click();	
//		Thread.sleep(2000);
//		WebElement element1=driver.findElement(By.xpath("//input[@name='q']"));
//		element.sendKeys("Redmi Mobiles");
////		  
//		try {
//			
//			WebElement element1=driver.findElement(By.xpath("//input[@name='q']"));
//			element.sendKeys("Redmi Mobiles");
//			  
//		}
//		  catch(Exception e){
//			   System.out.println(e.toString());
//			  System.out.println("The referenced element is no longer attached to the DOM");
//			  
//			  
//			  
//		  }
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		WebElement element=driver.findElement(By.id("timerAlertButton"));
//		element.click();
		
		

//	     WebDriverWait wait = new WebDriverWait (driver,300    
//	     WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
//	     Alert unt=wait.until(ExpectedConditions.alertIsPresent());
//	    
//	     Alert a=	driver.switchTo().alert();
//	     a.accept();
//	     
//	     WebElement element1=driver.findElement(By.xpath("//button[@id='confirmButton']"));  
//	     element1.click();
//	     Thread.sleep(2000);
//	     a.dismiss();
//
//       JavascriptExecutor js=(JavascriptExecutor)driver;
//	   WebElement down=driver.findElement(By.xpath("//button[@id='confirmButton']"));
//	   Thread.sleep(2000);
//	    js.executeScript("arguments[0].scrollIntoView(true)",down);
//	    Thread.sleep(3000);
//	   WebElement s=driver.findElement(By.xpath("//button[@id='promtButton']"));
//	    s.click();
//	    String text=   a.getText();
//	    System.out.println(text);
//	    Thread.sleep(2000);
//	    a.sendKeys("Selenium");
//	    Thread.sleep(3000);
//	    a.accept();

//		try {
//			
//			WebElement element=driver.findElement(By.xpath("//button[text()='a']"));
//			element.click();	
//			  
//		}
//		  catch(Exception e){
//			   System.out.println(e.toString());
//			  System.out.println("The exception occurs when WebDriver is unable to find and locate elements");
//			  
//		  }
}
}
