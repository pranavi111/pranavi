package css;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stubSystem.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();                  	
		
		String url ="https://demo.nopcommerce.com/";              
		
		driver.get(url);
	      

		  driver.findElement(By.cssSelector(".ico-register")).click();
		  driver.findElement(By.cssSelector("#FirstName")).sendKeys("abcd");
		  driver.findElement(By.cssSelector("#LastName")).sendKeys("wxyz");
		  driver.findElement(By.cssSelector("#Email")).sendKeys("abcdwxyz@gmail.com");
		  driver.findElement(By.cssSelector("#Company")).sendKeys("abcdwxyz");
		  driver.findElement(By.cssSelector("#Password")).sendKeys("123456");
		  driver.findElement(By.cssSelector("#ConfirmPassword")).sendKeys("123456");
		  
		  
		  
		 
	}

}
