package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class Reset_Password extends PageUtility
{
	WebDriver driver;
	@FindBy(xpath = "//form/div[1]/div[2]/input")
	WebElement eNewPassword;
	@FindBy(xpath = "//form/div[2]/div[2]/input")
	WebElement eConfirmPassword;
	@FindBy(xpath = "//button[@class='btn btn-block btn-lg btn-info']")
	WebElement eSubmit;


public Reset_Password(WebDriver driver) {
	super(driver);
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}
public void enterNewPassword(String Password) {
	sendKeys(eNewPassword, Password);
}
public void enterConfirmPassword(String Cpassword) {
	sendKeys(eConfirmPassword, Cpassword);
}

public void signIn() {
	eSubmit.click();
}
public void waitForVisibility()
{
	waitToVisible(eNewPassword);
}
}