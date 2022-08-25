package org.web;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task6 {
	public static void main(String[]args) throws Throwable {
		
System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\Indiaseah Quality\\\\eclipse-workspace\\\\Maybatch\\\\Library\\\\Driver\\\\msedgedriver.exe" );
	
     WebDriver driver=new EdgeDriver();
	
	//String url=("http//www.facebook.com");
	
	driver.navigate().to("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	  
//    Actions a=new Actions(driver);
//     a.doubleClick(id).perform();
	
  //	TakesScreenshot tk= (TakesScreenshot)driver;
//	
//	File s=tk.getScreenshotAs(OutputType.FILE);
//	
//	File t=new File("C:\\Users\\Indiaseah Quality\\eclipse-workspace\\Maybatch\\Library/flip");
//	
//     FileUtils.copyFile(s,t);
	
 
	WebElement button =driver.findElement(By.xpath("//button[text()='✕']"));
	button.click();
		
	WebElement name=driver.findElement(By.xpath("//input[@type='text']"));
	name.sendKeys("redmimobiles",Keys.ENTER);
	Thread.sleep(2000);
	 WebElement elemnt =driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
	 elemnt.click();
//	 
//	 WebElement elemnt1 =driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]"));
//	 elemnt1.click();
//	 WebElement elemnt2 =driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]"));
//	 elemnt2.click();
//	 WebElement elemnt3 =driver.findElement(By.xpath("(//div[@class='_4rR01T'])[4]"));
//	 elemnt3.click();
//	  
//	 String parent =driver.getWindowHandle();
//	 Set<String>child=driver.getWindowHandles();
//
//	for(String s:child) {
//		//System.out.println(s);
//		driver.switchTo().window(s);
//	if (!parent.equals(s)) {
//		WebElement element =driver.findElement(By.xpath("//span[@class='B_NuCI']"));
//		String text=element.getText();
//		System.out.println(text);
//	}
//		
//	}
//
//	
//	}
// 
//	
	
	
   
	
//	WebElement user=driver.findElement(By.id("email"));
//	user.sendKeys("java");
//	WebElement pass=driver.findElement(By.id("pass"));
//	pass.sendKeys("java");
//	JavascriptExecutor js=(JavascriptExecutor)driver;vv 
	
	
//	
//	js.executeScript("arguments[0].setAttribute('value','java')",user);
//	Object text=js.executeScript("return arguments[0].getAttribute('value')",user);
//	System.out.println(text);
//	Thread.sleep(2000);
//	js.executeScript("arguments[0].setAttribute('value','9876')",pass);
//	Object text2=js.executeScript("return arguments[0].getAttribute('value')",pass);
//	System.out.println(text2);
//	
     
//      WebElement user=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
//      user.sendKeys("6369339690");
//      WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
//      pass.sendKeys("6369339690");
//      Thread.sleep(2000);
      
    //  WebElement login=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
    // login.click();
       
	
//	WebElement bank=driver.findElement(By.xpath("//a[contains(text(),' BANK ')]"));
//	WebElement palce=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
//
//	WebElement m=driver.findElement(By.xpath("(//a[contains(text(),'5000')])[4]"));
//	WebElement f=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
//	Thread.sleep(2000);
//	WebElement sales=driver.findElement(By.xpath("//a[contains(text(),' SALES ')]"));
//	WebElement f2=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
//	Thread.sleep(2000);
//    WebElement m1=driver.findElement(By.xpath("(//a[contains(text(),'5000')])[2]"));
//    WebElement f3=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
//    
//	
//	 Actions a =new Actions(driver);
//	 
//	 a.dragAndDrop(bank,palce).perform();
//	
//	 a.dragAndDrop(m,f).perform();
//	
//	 a.dragAndDrop(sales,f2).perform();
//	
//	 a.dragAndDrop(m1,f3).perform();
	 
      //a.moveToElement(men).perform();
      
   //   a.contextClick(s).perform();
//      
//      Robot r=new Robot();
//     
//      r.keyPress(KeyEvent.VK_SPACE);
//	  
// 	 r.keyRelease(KeyEvent.VK_SPACE);
// 	 
 	 
 	 }
} 
 	 
// 	 TakesScreenshot t=(TakesScreenshot)driver;
// 	 
// 	 File t1=t.getScreenshotAs(OutputType.FILE);
// 	 File f1=new File("C:\\Users\\Indiaseah Quality\\eclipse-workspace\\Maybatch\\Library/TS");
// 	 FileUtils.copyFile(t1,f1);
      
//	}


	
	
	
	

