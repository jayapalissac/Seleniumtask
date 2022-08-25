package org.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webtable {
	
	public static void main(String[]args) throws Exception {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Indiaseah Quality\\eclipse-workspace\\Maybatch\\Library\\Driver\\msedgedriver.exe");
					
		WebDriver driver= new EdgeDriver();
				
		String ExpectedUrl=("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
					
	    driver.navigate().to(ExpectedUrl);
					
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement single= driver.findElement(By.xpath("(//select)[1]"));
		//String a =single.getText();
		//System.out.println(a);
		WebElement animals= driver.findElement(By.xpath("(//select)[2]"));
		//String a2=animals.getText();
		//System.out.println(a2);	
		WebElement food= driver.findElement(By.xpath("(//select)[3]"));
		//String a3=food.getText();
		//System.out.println(a3);
		
		Thread.sleep(2000);
		Select options =new Select(single);	
		Thread.sleep(2000);
		options.selectByIndex(3);
		Thread.sleep(2000);
		options.selectByValue("Microsoft");
		Thread.sleep(2000);
		options.selectByVisibleText("Google");	
		
				
		Select options1 =new Select(animals);	
		Thread.sleep(2000);
		options1.selectByIndex(3);
		Thread.sleep(2000);
		options1.selectByValue("babycat");
		Thread.sleep(2000);
		options1.selectByVisibleText("Avatar");		
		
		boolean result = options.isMultiple();
		System.out.println(result);
	
		List<WebElement>li=options1.getOptions();	
		for(int i=0;i<li.size();i++){	
			WebElement element=li.get(i);
			String text =element.getText();
			System.out.println(text);
		}
		
		Select m =new Select(food);
		m.selectByIndex(0);
		m.selectByIndex(1);
		m.selectByIndex(2);
		m.selectByIndex(3);
		m.deselectByIndex(3);
		m.deselectAll();
	
		//WebElement first=m.getFirstSelectedOption();
	//	String print=first.getText();
//System.out.println(print);
		
		//List<WebElement>all=m.getAllSelectedOptions();
		
		//for(int i=0;i<all.size();i++) {
		//	WebElement element=all.get(i);
			//String text=element.getText();
			//System.out.println(text);
		//}
		
		
		
		
		
		
	

}
}