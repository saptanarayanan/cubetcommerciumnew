package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class Add_New_User_Customer extends PageUtility
{

	WebDriver driver;
	@FindBy(xpath = "//button[@class='btn btn-grid-top btn-sm'][3]")
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
	@FindBy(xpath = "//span[@class='rounded-circle']")
	WebElement eLogout;
	public Add_New_User_Customer(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void addNewUserClick() throws InterruptedException
	{
		Thread.sleep(4000);
		jsClick(eAddNewUser);
		
	}
	public void firstName(String FirstName) throws InterruptedException
	{
		Thread.sleep(4000);
		jsSendKeys(eFirstName,FirstName);
		//sendKeys(eFirstName,FirstName);
	}
	public void lastName(String LastName) throws InterruptedException
	{
		Thread.sleep(4000);
		jsSendKeys(eLastName,LastName);
		
	}
	public void emailID(String emailid) throws InterruptedException
	{
		Thread.sleep(4000);
		jsSendKeys(eEmail,emailid);
		
	}
	public void phoneNumber(String phonenumber) throws InterruptedException
	{
		Thread.sleep(4000);
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
	/*public void logoutClick()
	{
		refresh();
		click(eLogout);
	}*/

}
