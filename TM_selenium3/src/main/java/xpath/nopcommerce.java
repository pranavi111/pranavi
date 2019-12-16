package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nopcommerce {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();                  	
	
	String url ="https://demo.nopcommerce.com/";              
	
	driver.get(url);
  
    driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();  
   
  driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("madhupranu");
    
  driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("pranavi");
  //driver.findElement(By.id("LastName")).sendKeys("bbbbb");//not using xpath
   
   driver.findElement(By.xpath(" //input[@id='Company']")).sendKeys("genpact");
   
  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("madhupranu@gmail.com");
   
   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("777777");
   
   driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("777777");
   
  driver .findElement(By.xpath( "(//select[@ name='DateOfBirthDay']/option)[5]")).click();
  
  driver .findElement(By.xpath( "(//select[@name='DateOfBirthMonth']/option)[6]")).click();
   
  driver .findElement(By.xpath( "(//select[@name='DateOfBirthYear']/option)[8]")).click();
  
  driver .findElement(By.xpath( "//input[@id='register-button']")).click();
 
	}
}
