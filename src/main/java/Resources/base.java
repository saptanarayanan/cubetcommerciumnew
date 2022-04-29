package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages.Mailinator_Otp;
import Pages.New_Organization_Page;
import Pages.Superadmin_Loginpage;

public class base 
{
	public  WebDriver driver;
	public Properties prop;
	//public static Logger log =LogManager.getLogger(base.class.getName());
	protected Superadmin_Loginpage objSuperAdminLoginPage;
	protected Mailinator_Otp objMailinatorPage;
	protected New_Organization_Page objNewOrganizationPage;
	public WebDriver initializeDriver() throws IOException
	{
		 objSuperAdminLoginPage=new Superadmin_Loginpage(driver);
		  objMailinatorPage=new Mailinator_Otp(driver);
		  objNewOrganizationPage=new New_Organization_Page(driver);

		prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\New Eclipse\\Commercium\\src\\main\\java\\Resources\\data.properties");

		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);

		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\New Eclipse\\Commercium\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			//execute in chrome driver
			//log.info("initilizing Chrome browser");

		}
		else if (browserName.equals("firefox"))
		{
			driver= new FirefoxDriver();
			//firefox code
		}
		else if (browserName.equals("IE"))
		{
			//	IE code
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;


	}
	
}


