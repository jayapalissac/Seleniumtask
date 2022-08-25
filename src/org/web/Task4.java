package org.web;
import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task4 {
	
	public static void main(String[]args) throws Throwable {
		
System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\Indiaseah Quality\\\\eclipse-workspace\\\\Maybatch\\\\Library\\\\Driver\\\\msedgedriver.exe" );
		
		WebDriver driver=new EdgeDriver();
		   
    String Expectedurl=("https://www.techlistic.com/p/demo-selenium-practice.html");
	
		driver.navigate().to(Expectedurl);
		driver.manage().window().maximize();
		
		List<WebElement> table=driver.findElements(By.tagName("table"));
		
		for(int i=0;i<table.size();i++) {
			WebElement tbody=table.get(i);
		WebElement tb=tbody.findElement(By.tagName("tbody"));	
		
		
			
			
		}
		
		//driver.switchTo().frame("frame1");
		//driver.switchTo().frame("frame3");
		//driver.switchTo().frame("frame2");
		
//		WebElement el=driver.findElement(By.xpath("//input[@id='a']"));
//		el.click();
//		Thread.sleep(3000);
//		driver.switchTo().parentFrame();
//		WebElement element=driver.findElement(By.xpath("//b[@id='topic']"));
//		String text=element.getText();
//		System.out.println(text);
//		Thread.sleep(3000);
//		WebElement element2=driver.findElement(By.xpath("(//input)[1]"));
//		element2.sendKeys("Selenium");
//		Thread.sleep(3000);
//		String att=element2.getAttribute("value");
//		System.out.println(att);	
//		driver.switchTo().defaultContent();
//		WebElement elem=driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
//		String s=elem.getText();
//		System.out.println(s);
		
//		TakesScreenshot tk =(TakesScreenshot)driver;
//		
//		File frame =tk.getScreenshotAs(OutputType.FILE);
//		
//		File lib =new File("C:\\Users\\Indiaseah Quality\\eclipse-workspace\\Maybatch\\Library/frames");
//		
//		FileUtils.copyFile(frame,lib);
	
			
//		WebElement sinle=driver.findElement(By.xpath("//select[@id='animals']"));
//		
//		Select s1= new Select(sinle);
//		
//		s1.selectByIndex(2);
//		Thread.sleep(3000);
//		s1.selectByIndex(0);
//		Thread.sleep(3000);
//		s1.selectByIndex(1);
//		  
//		Boolean r=s1.isMultiple();
//		
//		System.out.println(r);
//		
//		List <WebElement> d=s1.getOptions();
//		System.out.println(d.size());
//		
//		for(int i=0;i<d.size();i++) {
//		
//		WebElement f=d.get(i);
//		
//		String text=f.getText();
//		
//		System.out.println(text);
//		
//		
//	}
	}

}
