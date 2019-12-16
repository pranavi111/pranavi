package homepage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstpage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url="https://www.rediff.com/";
		driver.get(url);
			
		List<WebElement> alloptions=driver.findElements(By.xpath("//div[@class='cell topicons']/child::a"));
		for (WebElement Rediff_Header : alloptions) {
			System.out.println(Rediff_Header.getText());
		}
		List<WebElement> signin=driver.findElements(By.xpath("//p[@id='signin_info']/child::a"));
		for (WebElement sign_in : signin) {
			System.out.println(sign_in.getText());
		}
		List<WebElement> options=driver.findElements(By.xpath("//ul[@class='navbarul']/child::li"));
		for (WebElement option_s : options) {
			System.out.println(option_s.getText());

		}
		
		List<WebElement> Top_live=driver.findElements(By.xpath("//div[@class='secstorybox topboxheight topstories']/child::h3"));
		for (WebElement Toplive_s : Top_live) {
			System.out.println(Toplive_s.getText());
			}
		List<WebElement> live=driver.findElements(By.xpath("//h2[@class='live']/following-sibling::h2"));
		for (WebElement live_s : live) {
			System.out.println(live_s.getText());
		}
	}

}