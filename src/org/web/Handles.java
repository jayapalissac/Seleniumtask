package org.web;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Handles {
	
	public static void main(String[]args) throws Throwable {
		
System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\Indiaseah Quality\\\\eclipse-workspace\\\\Maybatch\\\\Library\\\\Driver\\\\msedgedriver.exe" );
		
		WebDriver driver=new EdgeDriver();
		   
    String Expectedurl=("https://www.flipkart.com");
	
		driver.navigate().to(Expectedurl);
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//button[text()='✕']"));
		button.click();
		
		WebElement name=driver.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("Redmi Mobiles",Keys.ENTER);
		Thread.sleep(2000);
		WebElement mobname=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		mobname.click();
		Thread.sleep(2000);
		WebElement mobname1=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]"));
		mobname1.click();
		Thread.sleep(2000);
		WebElement mobname2=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]"));
		mobname2.click();
		Thread.sleep(2000);
		WebElement mobname3=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[4]"));
		mobname3.click();
		
		//String parent=driver.getWindowHandle();//to handle the parent window
		///System.out.println(parent);
		
		Set<String>child=driver.getWindowHandles();//to handle the child window
		System.out.println(child);
		
		List<String>li=new ArrayList<>(child);
		
		driver.switchTo().window(li.get(4));
	
		WebElement b =driver.findElement(By.xpath("//span[@class='B_NuCI']"));
		String text=b.getText();
		System.out.println(text);
		
		WebElement c =driver.findElement(By.xpath("(//span[@class='_1rcQuH'])[1]"));
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		j.executeScript("arguments[0].scrollIntoView(true)",c);
		
		WebElement d =driver.findElement(By.xpath("//button[@type='button']"));
		d.click();
		
		TakesScreenshot tk =(TakesScreenshot)driver;
		
		File flipkart=tk.getScreenshotAs(OutputType.FILE);
		
		File Storeage=new File("C:\\Users\\Indiaseah Quality\\eclipse-workspace\\Maybatch\\Library/Flipkart");
		
		FileUtils.copyFile(flipkart, Storeage);
		
		
		WebElement signup=driver.findElement(By.xpath("//input[@type='text']"));
		signup.sendKeys("6369339690");
		
		WebElement cont =driver.findElement(By.xpath("//button[@type='submit']"));
		cont.click();
		Thread.sleep(3000);
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("6369339690",Keys.ENTER);
		Thread.sleep(3000);
		WebElement add =driver.findElement(By.xpath("(//span[@class='rPNEXT Br27Zz'])[1]"));
		String a=add.getText();
		System.out.println(a);
	}
	
	}


