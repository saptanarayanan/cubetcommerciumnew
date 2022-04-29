package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class Superadmin_Loginpage extends PageUtility
{
	WebDriver driver;
	@FindBy(xpath = "//div[@class='input-group mb-3'][1]/div//input")
	WebElement eUserName;
	@FindBy(xpath = "//div[@class='input-group mb-3'][2]/div//input")
	WebElement ePassWord;
	@FindBy(xpath = "//button[@class='btn btn-block btn-lg btn-info']")
	WebElement eLogIn;


public Superadmin_Loginpage(WebDriver driver) {
	super(driver);
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}
public void enterUsername(String Header) {
	sendKeys(eUserName, Header);
}

public void enterPassword(String Header) {
	sendKeys(ePassWord, Header);
}

public void signIn() {
	eLogIn.click();
}
public void waitForVisibility()
{
	waitToVisible(eUserName);
}

}