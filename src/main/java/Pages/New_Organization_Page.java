package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class New_Organization_Page extends PageUtility
{
	WebDriver driver;
	@FindBy(xpath = "//div[@class='d-flex no-block']//h6[text()='Organisations']")
	WebElement eOrganizations;
	@FindBy(xpath = "//button[@class='btn btn-grid-top btn-sm'][1]")
	WebElement eAddNewOrganization;
	@FindBy(xpath = "//input[@id='name']")
	WebElement eOrganizationName;
	@FindBy(xpath = "//input[@id='vatid']")
	WebElement eVatId;
	@FindBy(xpath = "//input[@id='address1']")
	WebElement eAddress1;
	@FindBy(xpath = "//input[@id='address2']")
	WebElement eAddress2;
	@FindBy(xpath = "//input[@id='city']")
	WebElement eCity;
	@FindBy(xpath = "//input[@id='state']")
	WebElement eState;
	@FindBy(xpath = "//select[@placeholder='Country']")
	WebElement eCountry;
	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement ePostCode;
	@FindBy(xpath = "//input[@id='contactPerson']")
	WebElement eContactPerson;
	@FindBy(xpath = "//input[@id='contactNumber']")
	WebElement eContactNumber;
	@FindBy(xpath = "//select[@id='currency_ID']")
	WebElement eCurrency;
	@FindBy(xpath = "//div[@class='modal-footer']/button[2]")
	WebElement eSave;
	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
	WebElement eOk;
	public New_Organization_Page(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void organizationClick()
	{
		//eOrganizations.click();
		actionClick(eOrganizations);
	}
	
	public void addNewOrganizationClick()
	{
		waitToClick(eAddNewOrganization);
		eAddNewOrganization.click();
	}
	public void orgName(String orgname)
	{
		sendKeys(eOrganizationName,orgname);
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
	public void country(String country) {
		waitToVisible(eCountry);
		selectByIndex(eCountry, 2);
	}
	public void postCode(String code)
	{
		sendKeys(ePostCode,code);
	}
	public void contactPerson(String Contact)
	{
		sendKeys(eContactPerson,Contact);
	}
	public void contactNumber(String number)
	{
		sendKeys(eContactNumber,number);
	}
	
	
	public void waitForVisibility()
	{
		waitToVisible(eOrganizations);
	}
	public void currency(String currency) {
		scrollDown(eCurrency);
		selectByIndex(eCurrency, 2);
	}
	public void saveClick()
	{
		scrollDown(eSave);
		scrollDown(eSave);
		waitToVisible(eSave);
		actionClick(eSave);
	}
	public void okClick()
	{
		click(eOk);
	}
	
	
}
