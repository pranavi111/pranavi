package driver;


		import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.ui.Select;

		public class Dropown {

		//@@ -68,5 +70,112 @@ public boolean checkElementExist(String elementName,String pageName,WebElement e)


			
	


			public boolean clickAndSendData(String textBoxName,String pageName,WebElement textBox,String data)
			{
				boolean status=true;
				try
				{
					textBox.click();

					textBox.clear();

					textBox.sendKeys(data);

					System.out.println("The Text Box : "+textBoxName+" is typed  with data  "+data+" on the page "+pageName);

				}catch(Exception e)
				{
					status=false;
					System.out.println("The Text Box : "+textBoxName+" is not typed  with data  "+data+" on the page "+pageName);
				}
				return status;


			}

			public boolean hoverAndClick(String buttonName,String pageName,WebElement button)
			{
				boolean status=true;
				try
				{
					WebDriver driver = null;
					Actions acc=new Actions(driver);
					acc.moveToElement(button).click(button).build().perform();
					System.out.println("The Element : "+buttonName+" is  clicked sucessfully on the page "+pageName);
				}catch(Exception e)
				{
					status=false;
					System.out.println("The Element : "+buttonName+" is not clicked on the page "+pageName);
				}
				return status;


			}

			public boolean selectDropDownByVisibleText(String dropDownName,String pageName,WebElement dropDown,String option)
			{
				boolean status=true;
				try
				{
					Select select=new Select(dropDown);
					select.selectByVisibleText(option);
					System.out.println("The Element : "+dropDownName+" is  Selected sucessfully with the option : "+option+"on the page "+pageName);
				}catch(Exception e)
				{
					status=false;
					System.out.println("The Element : "+dropDownName+" is  not Selected sucessfully with the option : "+option+"on the page "+pageName);
				}
				return status;


			}



			public boolean selectDropDownByValue(String dropDownName,String pageName,WebElement dropDown,String option)
			{
				boolean status=true;
				try
				{
					Select select=new Select(dropDown);
					select.selectByValue(option);
					System.out.println("The Element : "+dropDownName+" is  Selected sucessfully with the option : "+option+"on the page "+pageName);
				}catch(Exception e)
				{
					status=false;
					System.out.println("The Element : "+dropDownName+" is  not Selected sucessfully with the option : "+option+"on the page "+pageName);
				}
				return status;


			}


			public boolean selectDropDownByIndex(String dropDownName,String pageName,WebElement dropDown,int option)
			{
				boolean status=true;
				try
				{
					Select select=new Select(dropDown);
					select.selectByIndex(option);
					System.out.println("The Element : "+dropDownName+" is  Selected sucessfully with the option : "+option+"on the page "+pageName);
				}catch(Exception e)
				{
					status=false;
					System.out.println("The Element : "+dropDownName+" is  not Selected sucessfully with the option : "+option+"on the page "+pageName);
				}
				return status;


			}




	}


