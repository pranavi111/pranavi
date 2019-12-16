package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC_01 extends Common_Annotations {
 @Test
 public void test()
 {
	 driver.findElement(By.xpath("//a[text()='Computers '][1]")).click();
	driver.findElement(By.xpath("//a[text()=' Desktops ']")).click();
	 driver.findElement(By.xpath("//ul[@class='group price-range-group']//a[1]")).click();
	 
	 List<WebElement> all =driver.findElements(By.xpath("//h2[@class='product-title']//child::*"));
	 
	 int elementsCount=all.size();
	 System.out.println(elementsCount);
	
	 
	 
	 
	 
	 
 }
}
      