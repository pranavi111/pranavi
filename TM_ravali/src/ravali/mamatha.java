package ravali;

public class mamatha {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://demo.nopcommerce.com/";
		driver.get(url);

	}

}
