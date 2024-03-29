package testCases;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.AllListPage;
import pageObjects.DetailViewPage;
import pageObjects.LoginPage;
import pageObjects.SMSNotifiers;
import pageObjects.SummaryViewPage;
import testBase.BaseClass;
import utilities.CRMReUsables;
import utilities.UtilityCustomFunctions;

public class CheckObjonPage extends BaseClass {
	
	@BeforeTest()
	public void testName() {
		System.out.println("Before Test Method");
		test = extent.createTest("CRMSummaryToggle");
	}
	
	@Test
	public void testControl() throws Exception {
	node = test.createNode("checkToggleOn Summary");
	
	
	
	String sAppUrl = "https://rdot.in/public/admin?Module=Cesourcedupprev&Related=Summary&record=101914&view=Detail";
	driver.get(sAppUrl);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
	System.out.println("AppURL:" + sAppUrl);
	String sCompName =  rb.getString("companyName");
	String sUserName =  rb.getString("userName1");
	String sPassword =  rb.getString("passWord1");
	String sAssignedTo = rb.getString("AssignedTo1");
	
	
	SummaryViewPage objSVP = new SummaryViewPage(driver);
	AllListPage objALP = new AllListPage(driver);
	DetailViewPage objDVP = new DetailViewPage(driver);
	LoginPage objLP = new LoginPage(driver);
	SMSNotifiers objSMS = new SMSNotifiers(driver);
	CRMReUsables objCRS = new CRMReUsables();
	
	objLP.setCompanyName(sCompName);
	objLP.setUserName(sUserName);
	objLP.setPassword(sPassword);
	objLP.clickLoginSubmit();
	Thread.sleep(3000);
	Thread.sleep(2000);
	objSVP.clickEditCheckBox(1);
//	 if(objLP.isLoginPageDisplayed(sAppUrl)) {
//		objLP.setCompanyName(sCompName);
//		objLP.setUserName(sUserName);
//		objLP.setPassword(sPassword);
//		objLP.clickLoginSubmit();
//		logger.info("CRM Login Success with:" + sUserName);
//		System.out.println("CRM Login Success with:" + sUserName);
//		UtilityCustomFunctions.fSoftAssert("Login Success", "Login Success","User: " + sUserName , node);
//	}
//	else {
//		logger.info("CRM Login failed");
//		System.out.println("Login Page Not Displayed");
//		UtilityCustomFunctions.fSoftAssert("Login Fail", "Login Success","User: " + sUserName , node);
//		Assert.fail("Login Page not displayed");
//		
//	}
	 
	 
	}//test
}
