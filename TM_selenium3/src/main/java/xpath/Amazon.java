package xpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
			System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		     String url = "https://www.amazon.in/";
			driver.get(url);
          driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 11");
          driver.findElement(By.xpath("//input[@type='submit']")).click();
          List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
          List<Integer> prices = new ArrayList<Integer>();
          
          /*for(WebElement whole : price )
          {
        	  String i = whole.getAttribute("innerHTML");
        		//System.out.println(whole .getText());
        	  prices.add(Integer.valueOf(i));
        	  Collections.sort(prices);
        	  System.out.println(prices);
	     }*/
          for(WebElement whole : price )
          {
        	  prices.add(Integer.valueOf(prices));
	      }
          Collections.Sort();
          System.out.println(prices.get(0));
          System.out.println(prices.size()-1);
          
	  
}
}