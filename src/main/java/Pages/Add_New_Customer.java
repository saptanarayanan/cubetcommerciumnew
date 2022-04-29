package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class Add_New_Customer extends PageUtility
{
	
	WebDriver driver;
	@FindBy(xpath = "//div[@class='d-flex no-block']//div[2]/h6[text()='Customers']")
	WebElement eAddNewCustomer;
	@FindBy(xpath = "//button[@class='btn btn-grid-top btn-sm'][1]")
	WebElement eAddNewCustomer1;
	@FindBy(xpath = "//input[@id='name']")
	WebElement eCustomerName;
	@FindBy(xpath = "//input[@id='vatID']")
	WebElement eVatId;
	@FindBy(xpath = "//input[@id='billingAddress1']")
	WebElement eAddress1;
	@FindBy(xpath = "//input[@id='billingAddress2']")
	WebElement eAddress2;
	@FindBy(xpath = "//input[@id='billingCity']")
	WebElement eCity;
	@FindBy(xpath = "//input[@id='billingState']")
	WebElement eState;
	@FindBy(xpath = "//select[@id='billingCountry']")
	WebElement eCountry;
	@FindBy(xpath = "//input[@id='billingZipCode']")
	WebElement eZipCode;
	@FindBy(xpath = "//input[@id='shippingAddress1']")
	WebElement eShipAddress1;
	@FindBy(xpath = "//input[@id='shippingState']")
	WebElement eShipState;
	@FindBy(xpath = "//select[@id='shippingCountry']")
	WebElement eShipCountry;
	@FindBy(xpath = "//input[@id='shippingZipCode']")
	WebElement eShipPostCode;
	@FindBy(xpath = "//input[@id='contactPerson']")
	WebElement eContactPerson;
	@FindBy(xpath = "//input[@id='contactPosition']")
	WebElement eJobTitle;
	@FindBy(xpath = "//input[@id='contactNumber']")
	WebElement eContactNumber;
	@FindBy(xpath = "//input[@id='contactEmail']")
	WebElement eContactEmail;
	@FindBy(xpath = "//select[@id='currencyId']")
	WebElement eCurrency;
	@FindBy(xpath = "//div[@class='modal-footer']/button[2]")
	WebElement eSave;
	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
	WebElement eOk;
	public Add_New_Customer(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void addNewCustomerClick() throws InterruptedException
	{
		Thread.sleep(4000);
		jsClick(eAddNewCustomer);
		
	}
	
	public void addNewOrganizationClick()
	{
		waitToClick(eAddNewCustomer1);
		eAddNewCustomer1.click();
	}
	public void customerName(String custname)
	{
		sendKeys(eCustomerName,custname);
	}
	
	public void vatID(String vatid)
	{
		sendKeys(eVatId,vatid);
	}
	public void address1(String address1)
	{
		sendKeys(eAddress1,address1);
	}	
	public void address2(String address2)
	{
		sendKeys(eAddress2,address2);
	}
	public void city(String city)
	{
		sendKeys(eCity,city);
	}
	public void state(String state)
	{
		sendKeys(eState,state);
	}
	public void country(String country) throws Exception {
		waitToVisible(eCountry);
		Thread.sleep(3000);
		selectByIndex(eCountry,1);
	}
	public void postCode(String code)
	{
		sendKeys(eZipCode,code);
	}
	public void shipAddress1(String address1)
	{
		sendKeys(eShipAddress1,address1);
	}
	public void shipState(String state)
	{
		sendKeys(eShipState,state);
	}
	public void shipCountry(String country) {
		selectByIndex(eShipCountry, 2);
	}
	public void shipPostCode(String code) {
		sendKeys(eShipPostCode,code);
	}
	
	
	public void contactName(String name)
	{
		sendKeys(eContactPerson,name);
	}
	public void jobTitle(String jobtitle)
	{
		sendKeys(eJobTitle,jobtitle);
	}
	public void contactEmail(String email)
	{
		sendKeys(eContactEmail,email);
	}
	
	public void contactNumber(String number)
	{
		sendKeys(eContactNumber,number);
	}
	
	public void waitForVisibility()
	{
		waitToVisible(eAddNewCustomer);
	}
	public void currency(String currency) {
		selectByIndex(eCurrency, 2);
	}
	public void saveClick()
	{
		scrollDown(eSave);
		waitToVisible(eSave);
		actionClick(eSave);
	}
	public void okClick()
	{
		click(eOk);
	}

	
}
