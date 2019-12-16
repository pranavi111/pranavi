package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	     String url = "https://www.rediff.com/";
		driver.get(url);
		 List<WebElement> celltopicons=driver.findElements(By.xpath("//div[@class='cell topicons']/child::a"));
	for(WebElement  Rediff_Header : celltopicons )
	{
		System.out.println(Rediff_Header.getText());
	}
	
	List<WebElement> navbarul = driver.findElements(By.xpath("//ul[@class='navbarul']/child::li"));
  	for(WebElement  Rediff_Header1 : navbarul)
  	{
  	System.out.println( Rediff_Header1 .getText());
  	} 
  List<WebElement> topstories = driver.findElements(By.xpath("//div[@class='secstorybox topboxheight topstories']/child::h2"));
  for(WebElement  Rediff_Header2 : topstories)
	{
	System.out.println( Rediff_Header2 .getText());
	} 
  List<WebElement> live = driver.findElements(By.xpath("//h2[@class='live']/following-sibling::h2"));

	for(WebElement Rediff_Header3 : live)
	{
		System.out.println( Rediff_Header3 .getText());
	}
	 List<WebElement> login = driver.findElements(By.xpath("//p[@id='signin_info']/child::a"));

		for(WebElement Rediff_Header4 : login)
		{
			System.out.println( Rediff_Header4 .getText());
		}
		
	
	}
}