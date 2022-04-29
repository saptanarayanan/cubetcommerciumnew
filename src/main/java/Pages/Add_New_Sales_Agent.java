package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class Add_New_Sales_Agent extends PageUtility
{

	WebDriver driver;
	@FindBy(xpath = "//ul[@id='sidebarnav']/li[4]")
	WebElement eUsers;
	@FindBy(xpath = "//button[@class='btn btn-grid-top btn-sm'][1]")
	WebElement eAddNewUser;
	@FindBy(xpath = "//input[@id='firstName']")
	WebElement eFirstName;
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement eLastName;
	@FindBy(xpath = "//input[@id='email']")
	WebElement eEmail;
	@FindBy(xpath = "//input[@id='phoneNumber']")
	WebElement ePhoneNumber;
	@FindBy(xpath = "//div[@class='modal-footer']/button[2]")
	WebElement eSave;
	@FindBy(xpath = "//div[@class='swal2-actions']//button[1]")
	WebElement eOK;
	@FindBy(xpath = "//a[@class='sidebar-link waves-effect waves-dark']//span[text()='Home']")
	WebElement eHome;
	@FindBy(xpath = "//div[@class='d-flex no-block']//div[2]/h6[text()='Customers']")
	WebElement eAddNewCustomer;
	@FindBy(xpath = "//div[@class='container-fluid']//table//tbody/tr[2]/td[2]/a")
	WebElement eSelectCustomer;
	@FindBy(xpath = "(//div[@class='ml-auto']//button)[3]")
	WebElement eAssignSalesAgent;
	@FindBy(xpath = "//div[@class='col-sm-12']/table/tr[2]/td/input")
	WebElement eRadioButtonSalesAgent;
	@FindBy(xpath = "//div[@class='modal-footer']/div/button[2]")
	WebElement eAssign;
	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
	WebElement eOk;
	
	@FindBy(xpath = "//span[@class='rounded-circle']")
	WebElement eLogout;
	public Add_New_Sales_Agent(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void userClick() throws InterruptedException
	{
		Thread.sleep(4000);
		actionClick(eUsers);
		//jsClick(eUsers);
		
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
	public void okClick() throws InterruptedException
	{
		
		//click(eOK);
		Thread.sleep(3000);
		jsClick(eOK);

		
	}
	/*public void logoutClick()
	{
		refresh();
		click(eLogout);
	}*/
	public void homeClick() throws InterruptedException
	{
		
		//click(eOK);
		Thread.sleep(4000);
		jsClick(eHome);

		
	}
	public void customerClick()
	{
		
		//click(eOK);
		jsClick(eAddNewCustomer);

		
	}
	public void selectCustomer() throws InterruptedException
	{
		
		//click(eOK);
		//Thread.sleep(4000);
		waitToVisible(eSelectCustomer);
		Thread.sleep(3000);
		//jsClick(eSelectCustomer);
		actionClick(eSelectCustomer);

		
	}
	public void assignSalesAgent()
	{
		
		//click(eOK);
		waitToVisible(eAssignSalesAgent);
		//actionClick(eAssignSalesAgent);
		
		eAssignSalesAgent.click();
		
	}
	public void radioButtonSalesAgent()
	{
		
		//click(eOK);
		waitToVisible(eRadioButtonSalesAgent);
		jsClick(eRadioButtonSalesAgent);

		
	}
	public void assign()
	{
		
		//click(eOK);
		jsClick(eAssign);

		
	}
	public void okPopUpClick()
	{
		click(eOk);
	}
}
