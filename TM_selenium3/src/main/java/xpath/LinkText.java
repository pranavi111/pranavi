package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://demo.nopcommerce.com/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys("uuuu");
		driver.findElement(By.id("LastName")).sendKeys("bbbbb");
		driver.findElement(By.id("email")).sendKeys("ravali@gmail.com");
		driver.findElement(By.id("Company")).sendKeys("xxx");
		driver.findElement(By.id("password")).sendKeys("xxx123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("xxx123");
		driver.findElement(By.id("DateOfBirthDay")).sendKeys("8");
		
		
		
	}

}
