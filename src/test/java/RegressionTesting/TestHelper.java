package RegressionTesting;

import org.testng.annotations.Test;

import Pages.Add_New_Customer;
import Pages.Add_New_Order;
import Pages.Import_Item;
import Pages.Add_New_Sales_Agent;
import Pages.Add_New_User_Customer;
import Pages.Add_New_User_For_Organization;
import Pages.Mailinator_Otp;
import Pages.New_Organization_Page;
import Pages.Random_Number_Generate;
import Pages.Reset_Password;
import Pages.Superadmin_Loginpage;
import Utilities.ExcelUtility;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.AccessException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestHelper {
	
	WebDriver driver;
	public Properties prop;
	Superadmin_Loginpage objSuperAdminLoginPage;
	Mailinator_Otp objMailinatorPage;
	New_Organization_Page objNewOrganizationPage;
	Add_New_User_For_Organization objAddNewUser;
	Add_New_Customer objAddNewCustomer;
	Add_New_User_Customer objAddNewUserCustomer;
	Add_New_Sales_Agent objAddNewSalesAgent;
	Import_Item objImportItem;
	Add_New_Order objImportOrder;
	Random_Number_Generate objRandomNumber;
	Reset_Password objResetPassword;
	//ExcelUtility excel;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeClass() throws IOException
  {
	  prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\New Eclipse\\Commerciumtest\\src\\main\\java\\Resources\\data.properties");

		prop.load(fis);
	  System.setProperty("webdriver.chrome.driver",
				"C:\\New Eclipse\\Commerciumtest\\drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  //driver.get("https://ccmuat.azurewebsites.net/#/login");
	  driver.get(prop.getProperty("superadminurl"));
	  objSuperAdminLoginPage=new Superadmin_Loginpage(driver);
	  objMailinatorPage=new Mailinator_Otp(driver);
	  objNewOrganizationPage=new New_Organization_Page(driver);
	  objAddNewUser=new Add_New_User_For_Organization(driver);
	  objAddNewCustomer=new Add_New_Customer(driver);
	  objAddNewUserCustomer=new Add_New_User_Customer(driver);
	  objAddNewSalesAgent=new Add_New_Sales_Agent(driver);
	  objImportItem=new Import_Item(driver);
	  objImportOrder=new Add_New_Order(driver);
	  objResetPassword=new Reset_Password(driver);
	  //excel =new ExcelUtility("Sheet1");
	  
  }

  @AfterClass
  public void afterClass() {
	  //driver.quit();
  }
//*****************************************************DataProvider **********************************
  @DataProvider(name = "ReadFromExcel")
	public Object[][] readData() throws IOException {
		FileInputStream fls = new FileInputStream(
				"C:\\New Eclipse\\Commerciumtest\\src\\test\\resources\\TestData.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fls);
		XSSFSheet sheet = book.getSheet("Sheet2");
		XSSFRow row = sheet.getRow(0);

		int r = sheet.getLastRowNum() + 1; 
		int c = row.getLastCellNum(); 
		System.out.println("r=" + r);
		System.out.println("c=" + c);

		String values[][] = new String[r][c];

		for (int i = 0; i < r; i++) {
			row = sheet.getRow(i);
			for (int j = 0; j < c; j++) {
				XSSFCell cell = row.getCell(j);
				DataFormatter formatter = new DataFormatter();
				values[i][j] = formatter.formatCellValue(cell);

			}
		}
		return values;}
  
		public void random()
		{
		// Generating random numbers  
		 System.out.println("1st Random Number: " + Math.random());   
		 //System.out.println("2nd Random Number: " + Math.random());  
		 //System.out.println("3rd Random Number: " + Math.random());   
		 //System.out.println("4th Random Number: " + Math.random());   
		 } 

	}	

  
  


