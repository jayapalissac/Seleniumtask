package org.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Wtable {
	
public static void main(String[]args) throws Exception {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Indiaseah Quality\\eclipse-workspace\\Maybatch\\Library\\Driver\\msedgedriver.exe");
					
		WebDriver driver= new EdgeDriver();
				
		String ExpectedUrl=("https://www.techlistic.com/p/demo-selenium-practice.html");
					
	    driver.navigate().to(ExpectedUrl);
					
		driver.manage().window().maximize();
		
		List<WebElement>table=driver.findElements(By.tagName("table"));//to find the Web Table by
		
		for( int i=table.size()-1;i<table.size();i++) {
			
			WebElement a =table.get(i);
			
			WebElement tbody= a.findElement(By.tagName("tbody"));//To find the <tbody in 0th index web table
				
			List<WebElement>row=tbody.findElements(By.tagName("tr"));//To find the <trow values in 0th index  web table
			
			//System.out.println(row.size());
			for(int j=row.size()-1;j<=row.size()-1;j++) {
			
			WebElement b =row.get(j);
		
			List<WebElement>data=b.findElements(By.tagName("td"));//To find the <tdata values in 0th index  web table
		
			for(int k=0;k<data.size();k++) {
		
	     	   WebElement c =data.get(k);
				
				String text1= c.getText();
				
				System.out.println(text1);
			
			}
			
			
			
			//String text1= c.getText();
				//if(text1.equals("Microsoft")) {
				//System.out.println("Text Is Present");
				//System.out.println("Row no: "+j);
				//System.out.println("column no: "+j);
			}
			
			
			}
			
			}	
		}
		
		




