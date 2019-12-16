package webtable1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xxxx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();                  	
		
		String url ="https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose";              
		
		driver.get(url);
		String xpath="//th[text()='Company']/ancestor::table/tbody/child::tr";
		List<WebElement>total_rows=driver.findElements(By.xpath(xpath));
		System.out.println(total_rows.size());
		for(int r=1;r<=total_rows.size();r++)
		{

			String col=xpath+"["+r+"]/td[1]";
			WebElement cellData=driver.findElement(By.xpath(col));
     		System.out.println(cellData.getText());

	}
}
}