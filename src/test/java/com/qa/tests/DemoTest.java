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
	  
}
