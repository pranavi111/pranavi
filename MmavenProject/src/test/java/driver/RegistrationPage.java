package driver;

import java.awt.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



/*import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;*/
public class RegistrationPage {
WebDriver driver;

public void Createdriver() 
{
 try {
	 {
	
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://demo.nopcommerce.com/";
		driver.get(url);
		driver.manage().window().maximize();
	}
 }
 catch(Exception e)
 {
	 e.printStackTrace();
 }
}

	
		public void registration() throws InterruptedException
		{
			// driver.navigate().to(  "//input[@class='ico-register')");
			if
			{
			//driver.findElement(By.xpath("//input[@id='gender-male')"));
				
			//driver.findElement(By.xpath("//input[@id=id='gender-female')")).click();
			driver.findElement( By.id("FirstName")).sendKeys("pranu");
			driver.findElement( By.xpath("//input[@id='LastName']")).sendKeys("pranu");
			//driver.findElement(By.xpath("//input[@name='DateOfBirthDay']"));
			//WebElement day=driver.findElement(By.xpath("//input[@name='DateOfBirthDay']"));
			//((Select) day).selectByVisibleText("8");
			//WebElement month=driver.findElement(By.xpath("//input[@name='DateOfBirthMonth']"));
			//((Select) month).selectByVisibleText("may");
			//WebElement year=driver.findElement(By.xpath("//input[@name='DateOfBirthYear']"));
			//((Select) year).selectByVisibleText("1997");


			driver.findElement( By.xpath("//input[@id='Email']")).sendKeys("pranai@gmail.com");
			driver.findElement( By.xpath("//input[@id='Company']")).sendKeys("PM");
			driver.findElement( By.xpath("//input[@id='Password']")).sendKeys("******");
			driver.findElement( By.xpath("//input[@id='ConfirmPassword']")).sendKeys("******");
			driver.findElement( By.xpath("//input[@id='register-button']"));
			driver.findElement( By.xpath("//input[@id='register-button']")).click();
		}
		public static void main(String[] args) throws InterruptedException {
		RegistrationPage obj=new RegistrationPage();
		obj.Createdriver();
		obj.registration();
		}
		}

