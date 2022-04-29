package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.PageUtility;

public class Add_New_Order extends PageUtility
{

	WebDriver driver;
	@FindBy(xpath = "//a[@class='sidebar-link waves-effect waves-dark has-arrow']")
	WebElement eOrders;
	@FindBy(xpath = "//button[@class='btn btn-grid-top btn-sm'][2]")
	WebElement eImportOrder;
	@FindBy(xpath = "//input[@class='form-control ng-untouched ng-pristine ng-invalid']")
	WebElement eChooseFile;
	@FindBy(xpath = "//div[@class='modal-footer']/button[2]")
	WebElement eUpload;
	@FindBy(xpath = "//div[@class='swal2-actions']/button[@class='swal2-confirm swal2-styled']")
	WebElement eOK;
	@FindBy(xpath = "(//div[@class='ml-auto']//button)[1]")
	WebElement eAddNewOrder;
	@FindBy(xpath = "//tbody/tr/td[3]//div[@class='input-container']/input")
	WebElement eItemName;
	@FindBy(xpath = "//tbody/tr/td[3]//div[@class='autocomplete-container active']/div[2]/ul/li")
	WebElement eItemNameSelect;
	@FindBy(xpath = "//tbody/tr/td[7]/div/input")
	WebElement eQuantity;
	@FindBy(xpath = "//div[@class='text-right']/button[2]")
	WebElement eConfirm;
	public Add_New_Order(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public void ordersClick() throws InterruptedException
	{
		Thread.sleep(4000);
		jsClick(eOrders);
		
	}
	public void importOrdersClick() throws InterruptedException
	{
		Thread.sleep(4000);
		jsClick(eImportOrder);
		
	}
	public void chooseFileClick() throws InterruptedException, Exception
	{
		Thread.sleep(4000);
		//actionClick(eUsers);
		actionClick(eChooseFile);
		//Thread.sleep(4000);
		//Runtime.getRuntime().exec("C:\\Users\\sapta\\OneDrive\\Desktop\\Autoit\\fileuplaod_x64.exe"+"     "+"C:\\Users\\sapta\\OneDrive\\Desktop\\ItemMaster_v1 (1).csv");
		Thread.sleep(3000);

		Runtime.getRuntime().exec("C:\\Users\\sapta\\OneDrive\\Desktop\\Autoitimportorder\\importorder.exe");
	}
	public void upload() throws Exception
	{
		Thread.sleep(4000);
		actionClick(eUpload);
		//jsClick(eUpload);
	}
	public void addNewOrderClick() throws InterruptedException
	{ Thread.sleep(3000);
		actionClick(eAddNewOrder);
	}
	public void okClick()
	{
		jsClick(eOK);
	}
	public void itemSend(String value)
	{
		jsSendKeys(eItemName,value);
	}
	
	public void selectItemClick()
	{
		jsClick(eItemNameSelect);
		actionClick(eItemNameSelect);
		
	}
	public void quantitySend(String value)
	{
		jsSendKeys(eQuantity,value);
	}
	public void confirmClick()
	{
		jsClick(eConfirm);
	}
	

}
