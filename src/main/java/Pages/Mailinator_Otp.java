package Pages;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.PageUtility;
import sun.tools.jconsole.Tab;

public class Mailinator_Otp extends PageUtility
{
	WebDriver driver;
	@FindBy(xpath = "//input[@type='text']")
	WebElement eMailinatorBox;
	@FindBy(xpath = "//button[@value='Search for public inbox for free']")
	WebElement eGoButton;
	@FindBy(xpath = "//div[@class='os-content']//tr[1]/td[3]")
	WebElement eOtpVerification;
	@FindBy(xpath = "(//body//p)[2]")
	WebElement eOtpFetch;
	@FindBy(xpath = "//input[@id='otp']")
	WebElement eEnterOtp;
	@FindBy(xpath = "//button[@type='submit'][text()='Verify Now']")
	WebElement eVerifyNow;
	@FindBy(xpath = "//table[@class='table-striped jambo_table']//tr/td[3]")
	WebElement eConfirmLink;
	@FindBy(xpath = "//body/a[text()=' clicking this link ']")
	WebElement eMailLink;
	@FindBy(xpath = "//div[@class='swal2-container swal2-center swal2-backdrop-show']//div[@class='swal2-actions']//button[1]")
	WebElement eOKNewReg;
	public Mailinator_Otp(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	public void SwitchToTab() throws InterruptedException
	{
		Thread.sleep(4000);
		((JavascriptExecutor) driver).executeScript("window.open()");//to open new tab
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());//count of tab in array
		driver.switchTo().window(tabs.get(1));
		//switch to 1 st index
		
		driver.get("https://www.mailinator.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
	public void LaunchMailinator()
	{
		driver.get("https://www.mailinator.com/");
	}
	public void OTPVerification()
	{
		eOtpVerification.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("html_msg_body")));
	}
	
	public void MailinatorBox(String un)
	{
		sendKeys(eMailinatorBox,un);
	}
	
	public void GoButtonClick()
	{
		eGoButton.click();

	}



	public String OtpFetch()
	{
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame("html_msg_body");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//body//p)[2]")));
	
		String elementval =  eOtpFetch.getText();
		System.out.println("element value");
		System.out.println(elementval);
		driver.switchTo().defaultContent();
		String str[]=elementval.split(":");
		String otpnumber=str[str.length-1];
		System.out.println(otpnumber);
		String otp=otpnumber.trim();
		System.out.println(otp);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		driver.manage().window().maximize();
		return otp;

	}
	public void mailConfirmLink()
	{
		
		eConfirmLink.click();
		}

	

public void mailLink()
{
	driver.switchTo().frame(0);
	eMailLink.click();
	}
public void waitForVisibility()
{
	waitToVisible(eOKNewReg);
}

public void okClickNewreg() throws Exception
{
	//Thread.sleep(3000);
	//jsClick(eOKNewReg);;
	windowMax();
	Thread.sleep(1000);
	actionClick(eOKNewReg);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(eOKNewReg));
	}




	public void otpValue(String otp)
	{
		System.out.println(otp);
	}
	public void SwitchToTab1()
	{
		/* ((JavascriptExecutor) driver).executeScript("window.open()"); */
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));

	}
	
	public void EnterOtp(String otp1)
	{
		System.out.print("final otp value befor entering into OTP field");
		System.out.print(otp1);
		eEnterOtp.sendKeys(otp1);

	}
	public void VerifyNow()
	{
		eVerifyNow.click();
	}
}



