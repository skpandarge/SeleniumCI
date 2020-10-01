package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  



public class DemoTest {

	@Test
	public void sum() {
		System.out.println("SUM");
		int a = 10;
		int b=20;
		Assert.assertEquals(30, a+b);
		
	}
	@Test
	public void sub() {
		System.out.println("SUB");
		int a = 10;
		int b=20;
		Assert.assertEquals(10, b-a);
		
	}
	@Test
	public void mul() {
		System.out.println("MUL");
		int a = 10;
		int b=20;
		Assert.assertEquals(200, a*b);
		
	}
	@Test
	public void div() {
		System.out.println("DIV");
		int a = 10;
		int b=20;
		Assert.assertEquals(2, b/a);
		
	}
	@Test
		public void launchcrome() {	
      
           // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver", "C:\\SHIV\\Backup\\Selenium\\software\\chromedriver_win32\\chromedriver.exe");  
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website 
		System.out.println("Launching website javatpoint");
        driver.navigate().to("http://www.javatpoint.com/");  
          
         //Maximize the browser  
          driver.manage().window().maximize();  
          
          //Scroll down the webpage by 5000 pixels  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 5000)");   
          
         // Click on the Search button  
        driver.findElement(By.linkText("Core Java")).click();     
  
    }  
}
