package org.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Table {
	
	public static void main(String[]args) throws Throwable {
		
	System.setProperty("webdriver.edge.driver","C:\\Users\\Indiaseah Quality\\eclipse-workspace\\Maybatch\\Library\\Driver\\msedgedriver.exe");
		
	WebDriver driver=new EdgeDriver();
	
	//driver.get("https://www.facebook.com/");
	
	driver.navigate().to("https://www.techlistic.com/p/demo-selenium-practice.html");
	String title=driver.getTitle();
	System.out.println(title);
	String text=driver.getCurrentUrl();
	System.out.println(text);
	driver.manage().window().maximize();
	
	//Single value DropDown
	
	//WebElement single=driver.findElement(By.xpath("(//select)[1]"));
	//WebElement multiple=driver.findElement(By.xpath("(//select)[3]"));
	
	//Select s=new Select(single);
   // s.selectByIndex(0); s.selectByvalue();
   // Thread.sleep(2000);
  //  s.selectByIndex(1);
   // Thread.sleep(2000);
   // s.selectByIndex(2);
   // Thread.sleep(2000);
  //  s.selectByIndex(3);
	
	//   Thread.sleep(2000);
	  // s.selectByValue("Google");
	  ///Thread.sleep(2000);
	  // s.selectByValue("Microsoft");
	  // Thread.sleep(2000);
	  // s.selectByValue("Yahoo");
	 //  Thread.sleep(2000);
	  // 
	 ///  List<WebElement>options=s.getOptions();
	/// for(int i=0;i<options.size();i++) { 
	///	  WebElement element= options.get(i);
	///  String s1=element.getText();
		///  System.out.println(s1);

		  // break;
	///  }
	   
	/// Select s2=new Select(multiple);
	/// s2.selectByIndex(0);
	/// s2.selectByIndex(1);
	/// s2.selectByIndex(2);
	
	/// List<WebElement>Multi=s2.getOptions();
	 
	///(int i=0;i<Multi.size();i++) {
	/// WebElement el=Multi.get(i);
		///	 String t=el.getText();
	/// System.out.println(t);
	///}
	//String ExpectedUrl=("https://www.facebook.com/");

	//  driver.navigate().to(ExpectedUrl);
	 // Thread.sleep(2000);
	 // 
	  
	///  driver.navigate().refresh();
	//  Thread.sleep(2000);
	//  Thread.sleep(2000);
	//  driver.navigate().back();
	//  driver.navigate().forward();
		
		//String s ="Welcome to Java Batch";
		
		//String[] split=s.split("to");
		//System.out.println(split[1]);
	
	List<WebElement>table=driver.findElements(By.tagName("table"));
	
	for(int i=0;i<table.size();i++) {
			WebElement t1=table.get(i);
			WebElement itable=t1.findElement(By.tagName("tbody"));
	 
	}
	}
}
