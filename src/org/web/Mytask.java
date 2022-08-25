package org.web;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mytask {
	
@SuppressWarnings("deprecation")
public static void main(String[]args) throws Exception {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Indiaseah Quality\\eclipse-workspace\\Maybatch\\Library\\Driver\\msedgedriver.exe");
					
		WebDriver driver= new EdgeDriver();
				
		String ExpectedUrl=("https://www.amazon.com/");
					
	    driver.navigate().to(ExpectedUrl);
	    
	    driver.manage().window().maximize();
	    
	    String txt=driver.getWindowHandle();
	    System.out.println(txt);
	    
	 WebElement element=   driver.findElement(By.xpath("//input[@type='text']"));
				   element.sendKeys("Redmimobiles");
				   
				   Actions a =new Actions(driver);
				   
				   WebElement link=driver.findElement(By.xpath("(//a)[6]"));
				   a.moveToElement(link).perform();
				   Thread.sleep(3000); 
				   TakesScreenshot tk=( TakesScreenshot )driver;
				   
				   File source =tk.getScreenshotAs(OutputType.FILE);
				   File taget=new File("C:\\Users\\Indiaseah Quality\\eclipse-workspace\\Maybatch\\Library");
					  
//				   a.doubleClick(element).perform();
//				   Thread.sleep(3000); 
//				   a.contextClick(element).perform();
//				   Thread.sleep(3000); 
//				 
//				  
//				   			   
//				   Robot r=new Robot();
//				    for(int i=0;i<3;i++) {
//				   r.keyPress(KeyEvent.VK_DOWN);
//				   r.keyRelease(KeyEvent.VK_DOWN);
//				    }
//				   Thread.sleep(3000); 
//				    r.keyPress(KeyEvent.VK_ENTER);
//					   r.keyRelease(KeyEvent.VK_ENTER);
//					   
//					  
					   
					 
					   
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//		WebElement element=driver.findElement(By.id("emai"));
//		element.sendKeys("java");
//		
//		String text=element.getAttribute("value");
//		
//		System.out.println(text);	
//		
//		Thread.sleep(2000);	
//	      Actions acc =new Actions(driver);
//	      acc.doubleClick(element).perform();
//	     acc.contextClick(element).perform(); 
//	 	Thread.sleep(2000);	
//		
//	 	Robot r =new Robot();
//		for(int i=0;i<4;i++) {
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		}
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_TAB);
//		r.keyRelease(KeyEvent.VK_TAB);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_V);
//		
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		r.keyRelease(KeyEvent.VK_V);
//		Thread.sleep(2000);
		
		//WebElement hidden=driver.findElement(By.xpath("//div[@id='u_0_4_Mx']"));
		//hidden.click();
//		Thread.sleep(2000);
//	TakesScreenshot tk =(TakesScreenshot)driver;
//	
//	File facebook=tk.getScreenshotAs(OutputType.FILE);
//	
//	File lib =new File("C:\\Users\\Indiaseah Quality\\eclipse-workspace\\Maybatch\\Library/FaceBook");
//	
//	FileUtils.copyFile(facebook,lib);
//	
		
		//Keypress();
		
		//Key Release();
		
		//KeyEvent----java.awt.event.keyEvent;(Package)
		
		// WebElement login=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		 
		//login.sendKeys("6369339690");
		//Thread.sleep(1000);
	//	WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		 
		///	pass.sendKeys("6369339690");
		
  // WebElement cl =driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	////cl.click();
	//Thread.sleep(1000);
   //WebElement ph =driver.findElement(By.xpath("//input[@name='q']"));
	//ph.sendKeys("Redmi");
	
	 // WebElement element=driver.findElement(By.xpath("//button[@type='submit']"));
	  // element.click();
	  // Thread.sleep(2000);
	
    
    //  Robot r =new Robot();
      
      
	// WebElement tv=driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[2]"));
	   //acc.moveToElement(tv).perform();  
	
	// String attribute=ph.getAttribute("Redmi");
	// System.out.println(attribute);
	//Thread.sleep(1000);
	
  
  // Thread.sleep(2000);
 //  WebElement model=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
  // model.click();
  // String text = model.getText();
  // System.out.println(text);
   

   
   
    //String child =driver.getWindowHandle();
  //  System.out.println(child);
    
   // Thread.sleep(2000);
    
  //  Set<String>parent=driver.getWindowHandles();
    
   // for(String s:parent) {

       // driver.switchTo().window(s);
   // }
    
 // JavascriptExecutor js=(JavascriptExecutor)driver;
 //  WebElement down =driver.findElement(By.xpath("(//div)[108]"));
 //  js.executeScript("arguments[0].scrollIntoView(true)",down);
 //  
  // Thread.sleep(2000);
   
  // WebElement buy =driver.findElement(By.xpath("//button[@type='button']"));
 //  buy.click();
  
  // Thread.sleep(2000);
  // WebElement address = driver.findElement(By.xpath("(//span[@class='rPNEXT Br27Zz'])[1]"));
  // String a=address.getText();
  // System.out.println(a);
	 
  // List <WebElement>element1 =driver.findElements(By.xpath("//div[@class='_2npqm0']"));
  // 
   //System.out.println(element1.size());
   
  // for(int i=0;i<element1.size();i++) {
	   
	  // WebElement m=element1.get(i);
	   
	 //  String d=m.getText();
	   
	 //  System.out.println(d);
	   
	   //get Attribute Method
	   
	  
	   
	   
   }
   
}

