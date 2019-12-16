package excelprg;

public class Excel22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubExcelParser parser=new ExcelParser();

		String sno=readexcel("1", "Username");
		String password =readexcel("TC001", "Password");

		driver.findElement(By.Xapth("//div[@username]").sendKeys(username) ;
		driver.findElement(By.Xapth("//div[@password]").sendKeys(password) ;

	}

}
public HashMap<String, String> variables = new HashMap<String, String>();
variables.put("Username", "//div[@username]");
variables.put("Password", "//div[@password]");