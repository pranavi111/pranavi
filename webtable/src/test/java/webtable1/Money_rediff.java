package webtable1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Money_rediff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();                  	
		
		String url ="https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose";              
		
		driver.get(url);
		System.out.println("Browser is launched"+url);
		int rows=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr")).size();
		 System.out.println("size of the table"+rows);
		 
		 int cols=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td")).size();
		 System.out.println("size of the table"+cols);
		 

		 String care=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[11]/td[3]")).getText();
		 System.out.println("get selected one "+care);
	
		// for(int r=1;r<=rows;r++)
		//	{
		//	 String col=rows+"["+r+"]/td[1]";
		//	 WebElement cellData=driver.findElement(By.xpath(col));
			//
		//	System.out.println(col.getText());
			
	}
	
}
}

