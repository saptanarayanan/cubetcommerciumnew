package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class Add_New_User_For_Organization extends PageUtility
{
	WebDriver driver;
	@FindBy(xpath = "//button[@class=\"btn btn-grid-top btn-sm\"][1]")
	WebElement eAddNewUser;
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement eFirstName;
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement eLastName;
	@FindBy(xpath = "//input[@id='email']")
	WebElement eEmail;
	//input[@id="phoneNumber"]
	@FindBy(xpath = "//input[@id='phoneNumber']")
	WebElement ePhoneNumber;
	@FindBy(xpath = "//div[@class='modal-footer']/button[2]")
	WebElement eSave;
	@FindBy(xpath = "//div[@class='swal2-actions']//button[1]")
	WebElement eOK;
	@FindBy(xpath = "//li[@class='nav-item dropdown']/a")
	WebElement eLogout;
	//div[@class='dropdown-menu-right user-dd dropdown-menu show']
	@FindBy(xpath = "//div[@class='dropdown-menu-right user-dd dropdown-menu show']")
	WebElement eLogout1;
	//div[@class='wrapper-nav-items d-flex align-items-center h-100']/a[1]
	@FindBy(xpath = "//div[@class='wrapper-nav-items d-flex align-items-center h-100']/a[1]")
	WebElement eLauchMail;
	public Add_New_User_For_Organization(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void addNewUserClick()
	{
		
		jsClick(eAddNewUser);
		
	}
	public void firstName(String FirstName)
	{
		
		jsSendKeys(eFirstName,FirstName);
		//sendKeys(eFirstName,FirstName);
	}
	public void lastName(String LastName)
	{
		
		jsSendKeys(eLastName,LastName);
		
	}
	public void emailID(String emailid)
	{
		
		jsSendKeys(eEmail,emailid);
		
	}
	public void phoneNumber(String phonenumber)
	{
		
		sendKeys(ePhoneNumber,phonenumber);
		
	}
	
	public void save() throws InterruptedException
	{
		Thread.sleep(3000);
		jsClick(eSave);

		
	}
	public void okClick()
	{
		
		//click(eOK);
		jsClick(eOK);

		
	}
	public void waitForVisibility()
	{
		waitToVisible(eLauchMail);
	}
	public void homeClick()
	{
		jsClick(eLauchMail);
	}
	public void logoutClick()
	{
		refresh();
		//WebElement button = driver.findElement(By.xpath("xpath"));
		//button.click();

		//here you do something like update or save 

		//then you try to use the button WebElement again to click 
		//button.click();
		click(eLogout);
		//jsClick(eLogout);
		//actionClick(eLogout);
		
		
	}
	public void logoutClick1()
	{
		
		click(eLogout1);
		//jsClick(eLogout);
		//actionClick(eLogout);
		
		
	}

}
