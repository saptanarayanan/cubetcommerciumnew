package Pages;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class Import_Item extends PageUtility
{
	WebDriver driver;
	@FindBy(xpath = "//ul[@id='sidebarnav']/li[5]/a/span[text()='Items']")
	WebElement eItems;
	@FindBy(xpath = "//button[@class='btn btn-grid-top btn-sm'][1]")
	WebElement eAddNewItem;
	@FindBy(xpath = "//button[@class='btn btn-grid-top btn-sm'][3]")
	WebElement eImportItem;
	@FindBy(xpath = "//input[@class='form-control ng-untouched ng-pristine ng-invalid']")
	WebElement eChooseFile;
	@FindBy(xpath = "//div[@class='modal-footer']/button[2]")
	WebElement eUpload;
	@FindBy(xpath = "//div[@class='swal2-actions']/button[@class='swal2-confirm swal2-styled']")
	WebElement eOK;
	@FindBy(xpath = "//a[@class='dropdown-toggle nav-link text-muted waves-effect waves-dark pro-pic']")
	WebElement eClientAdmin;
	@FindBy(xpath = "//a[@class='dropdown-item']")
	WebElement eLogOut;
	public Import_Item(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void itemClick() throws InterruptedException
	{
		Thread.sleep(4000);
		//actionClick(eUsers);
		actionClick(eItems);
		
	}
	public void importItemClick() throws InterruptedException
	{
		Thread.sleep(4000);
		//actionClick(eUsers);
		actionClick(eImportItem);
		//Runtime.getRuntime().exec("");
		
	}
	public void chooseFileClick() throws InterruptedException, Exception
	{
		Thread.sleep(4000);
		//actionClick(eUsers);
		actionClick(eChooseFile);
		//Thread.sleep(4000);
		//Runtime.getRuntime().exec("C:\\Users\\sapta\\OneDrive\\Desktop\\Autoit\\fileuplaod_x64.exe"+"     "+"C:\\Users\\sapta\\OneDrive\\Desktop\\ItemMaster_v1 (1).csv");
		Thread.sleep(3000);

		Runtime.getRuntime().exec("C:\\Users\\sapta\\OneDrive\\Desktop\\AutoItNew\\Upload.exe");
	}
	public void upload() throws Exception
	{
		Thread.sleep(4000);
		//actionClick(eUpload);
		jsClick(eUpload);
	}
	public void okClick()
	{
		jsClick(eOK);
	}
	public void clientAdminLogout() throws InterruptedException
	{
		Thread.sleep(4000);
		jsClick(eClientAdmin);
	}
	public void logOut() throws InterruptedException
	{
		Thread.sleep(4000);
		jsClick(eLogOut);
	}

}
