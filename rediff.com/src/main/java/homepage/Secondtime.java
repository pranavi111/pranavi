package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Secondtime {

	public static void main(String[] args) {
		System.setProperty(" webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.rediff.com/";
	    driver.get(url);

	}

}
