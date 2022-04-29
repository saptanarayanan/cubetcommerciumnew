package RegressionTesting;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.Mailinator_Otp;
import Resources.base;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_Commercium extends TestHelper {
	String customername;

	@Test(priority = 0, description = "Super Admin")
	public void tc_1Mailinator() throws Exception {

		objSuperAdminLoginPage.waitForVisibility();
		objSuperAdminLoginPage.enterUsername("commercium@mailinator.com");
		objSuperAdminLoginPage.enterPassword("Pass@123");
		objSuperAdminLoginPage.signIn();
		objMailinatorPage.SwitchToTab();
		objMailinatorPage.MailinatorBox("commercium@mailinator.com");
		objMailinatorPage.GoButtonClick();
		objMailinatorPage.OTPVerification();
		String finalOTP = objMailinatorPage.OtpFetch();
		System.out.println(finalOTP);
		objMailinatorPage.EnterOtp(finalOTP);
		objMailinatorPage.VerifyNow();
		objNewOrganizationPage.waitForVisibility();
		objNewOrganizationPage.organizationClick();
		objNewOrganizationPage.addNewOrganizationClick();
		objNewOrganizationPage.orgName("Group9");
		objNewOrganizationPage.vatID("242288338");
		objNewOrganizationPage.address1("Street road 52");
		objNewOrganizationPage.address2("Street road 45");
		objNewOrganizationPage.city("London");
		objNewOrganizationPage.state("United States");
		Thread.sleep(3000);
		objNewOrganizationPage.country("UKS");
		objNewOrganizationPage.postCode("7658299722");
		objNewOrganizationPage.contactPerson("Henrick8");
		objNewOrganizationPage.contactNumber("7533522223");
		objNewOrganizationPage.currency("usd");
		objNewOrganizationPage.saveClick();
		objNewOrganizationPage.okClick();
		objAddNewUser.addNewUserClick();
		objAddNewUser.firstName("Finock7");
		objAddNewUser.lastName("Hendry");
		objAddNewUser.emailID("gerikclient5@mailinator.com");
		objAddNewUser.phoneNumber("7225991056");
		Thread.sleep(4000);
		objAddNewUser.save();
		Thread.sleep(3000);
		objAddNewUser.okClick();
		Thread.sleep(5000);
		objAddNewUser.logoutClick();
		objAddNewUser.logoutClick1();

	}
	/*@Test(priority = 1, description = "New Login")
	public void tc_2ResetPassword() throws Exception
	{
		objSuperAdminLoginPage.waitForVisibility();
		objMailinatorPage.LaunchMailinator();
		objMailinatorPage.MailinatorBox("gerikclient4@mailinator.com");
		objMailinatorPage.GoButtonClick();
		objMailinatorPage.mailConfirmLink(); 
		objMailinatorPage.mailLink();
		//objMailinatorPage.waitForVisibility(); 
		//objMailinatorPage.okClickNewreg();
		Thread.sleep(3000);
		objResetPassword.enterNewPassword("Pass@123");
		objResetPassword.enterConfirmPassword("Pass@123");
		objResetPassword.signIn();
		
	}
	*/
	
	

	@Test(priority = 1, description = "Client Admin")
	public void tc_2Mailinator() throws Exception {

		objSuperAdminLoginPage.waitForVisibility();
		// objMailinatorPage.LaunchMailinator();
		objSuperAdminLoginPage.enterUsername("frokie2@mailinator.com");
		objSuperAdminLoginPage.enterPassword("Pass@123");
		objSuperAdminLoginPage.signIn();
		objMailinatorPage.SwitchToTab();
		objMailinatorPage.MailinatorBox("frokie2@mailinator.com");
		objMailinatorPage.GoButtonClick();
		/*
		 * objMailinatorPage.mailConfirmLink(); objMailinatorPage.mailLink();
		 * objMailinatorPage.waitForVisibility(); objMailinatorPage.okClickNewreg();
		 * 
		 */
		objMailinatorPage.OTPVerification();
		String finalOTP = objMailinatorPage.OtpFetch();
		System.out.println(finalOTP);
		objMailinatorPage.EnterOtp(finalOTP);
		objMailinatorPage.VerifyNow();
		// objAddNewCustomer.waitForVisibility();
		objAddNewCustomer.addNewCustomerClick();
		objAddNewCustomer.addNewOrganizationClick();
		objAddNewCustomer.customerName("Deneerick1");
		objAddNewCustomer.vatID("2438934");
		objAddNewCustomer.address1("Street road 5227");
		objAddNewCustomer.address2("Street road 54");
		objAddNewCustomer.city("London");
		objAddNewCustomer.state("United States");
		objAddNewCustomer.country("UKS");
		objAddNewCustomer.postCode("76583847");
		objAddNewCustomer.shipAddress1("street road 45");
		objAddNewCustomer.shipState("Norrway");
		objAddNewCustomer.shipCountry("UK");
		objAddNewCustomer.shipPostCode("3232323");
		objAddNewCustomer.contactName("elsasagreek1");
		objAddNewCustomer.jobTitle("QAD Eng1");
		objAddNewCustomer.contactNumber("7565569823");
		objAddNewCustomer.contactEmail("denrickr3681@mailinator.com");
		objAddNewCustomer.currency("usd");
		objAddNewCustomer.saveClick();
		objAddNewCustomer.okClick();
		objAddNewUserCustomer.addNewUserClick();
		objAddNewUserCustomer.firstName("Eifegweyg1");
		objAddNewUserCustomer.lastName("Hakdick1");
		objAddNewUserCustomer.emailID("eirdfen43981@mailinator.com");
		objAddNewUserCustomer.phoneNumber("7358898566");
		objAddNewUserCustomer.save();
		Thread.sleep(3000);
		objAddNewUserCustomer.okClick();
		Thread.sleep(5000);
		// objAddNewUserCustomer.logoutClick();
		objAddNewSalesAgent.userClick();
		objAddNewSalesAgent.addNewUserClick();
		objAddNewSalesAgent.firstName("hadweecywe1");
		objAddNewSalesAgent.lastName("Heyhweefdf1");
		objAddNewSalesAgent.emailID("hafgok69991@mailinator.com");
		objAddNewSalesAgent.phoneNumber("7324223256");
		objAddNewSalesAgent.save();
		objAddNewSalesAgent.okClick();

		objAddNewSalesAgent.homeClick();
		objAddNewSalesAgent.customerClick();
		objAddNewSalesAgent.selectCustomer();

		objAddNewSalesAgent.assignSalesAgent();
		objAddNewSalesAgent.radioButtonSalesAgent();
		objAddNewSalesAgent.assign();
		objAddNewSalesAgent.okPopUpClick();
		objImportItem.itemClick();
		objImportItem.importItemClick();
		objImportItem.chooseFileClick();
		objImportItem.upload();
		objImportItem.okClick();
		objAddNewSalesAgent.homeClick();
		objAddNewSalesAgent.customerClick();
		objAddNewSalesAgent.selectCustomer();
		objImportOrder.addNewOrderClick();
		objImportOrder.itemSend("item1");
		objImportOrder.selectItemClick();
		objImportOrder.quantitySend("20");
		objImportOrder.confirmClick();
		objImportItem.clientAdminLogout();
		objImportItem.logOut();

	}

	@Test(priority = 1, description = "Customer")
	public void tc_3Mailinator() throws Exception {
		objSuperAdminLoginPage.waitForVisibility();
		objSuperAdminLoginPage.enterUsername("newuser@mailinator.com");
		objSuperAdminLoginPage.enterPassword("Pass@123");
		objSuperAdminLoginPage.signIn();
		objMailinatorPage.SwitchToTab();
		objMailinatorPage.MailinatorBox("newuser@mailinator.com");
		objMailinatorPage.GoButtonClick();
		objMailinatorPage.OTPVerification();
		String finalOTP = objMailinatorPage.OtpFetch();
		System.out.println(finalOTP);
		objMailinatorPage.EnterOtp(finalOTP);
		objMailinatorPage.VerifyNow();
		objImportOrder.ordersClick();
		objImportOrder.importOrdersClick();
		objImportOrder.chooseFileClick();
		objImportOrder.upload();
		objImportOrder.okClick();

	}

	@BeforeSuite
	public void randomNumber() {
		// objRandomNumber.random();
		// System.out.println("1st Random Number: " + Math.random());
		double random = Math.random();
		System.out.println("1st Random Number: " + random);
		String custname = "Eeran";

		customername = String.valueOf(custname) + random;
		// System.out.println("List" +customername );

	}

	@AfterTest
	public void tabClose() {
		// driver.quit();

	}
}
