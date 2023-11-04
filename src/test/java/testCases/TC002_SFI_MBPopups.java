package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Android.IndvControls;
import testBase.Android.BaseTest;
import utilities.ExcelUtility;
import utilities.SurveyFormReUsables;

public class TC002_SFI_MBPopups extends BaseTest {
	@BeforeTest
	public void testName() {
		test = extent.createTest("TC_001_SFI_All_Mobile");
	}
	@Test
	public void TestMobilePopupControls() throws Exception {
		node = test.createNode("IndependentControls");
		SurveyFormReUsables oSFR = new SurveyFormReUsables();
		IndvControls IndvObj = new IndvControls(driver);
		logger.info("******starting TC_001_SFI_All_Mobile ****");
		String sBrowserName=utilities.Android.UtilityCustomFunctions.getBrowserName(driver);
		logger.info("Test Execution on Browser: "+ sBrowserName);
		System.out.println("Test Execution on Browser: "+ sBrowserName);
	//	try{
			
//			String sPath=".\\testData\\" + "SFI_AllMobile_Tbl_Live" + ".xlsx" ;
			String sPath=".\\testData\\" + "SFI_AllMobilePopups_Tbl_Rthree" + ".xlsx" ;
			
			ExcelUtility xlObj = new ExcelUtility(sPath);
			logger.info("Excel file Utility instance created");
		
			int iRowCount = xlObj.getRowCount("Sheet1");
			System.out.println("Total rows: " + iRowCount);
			logger.info("Row Count is: " + iRowCount);
			
		
			int iColCount = xlObj.getCellCount("Sheet1", iRowCount);
			System.out.println("Cols: " + iColCount);
			logger.info("Col Count is: " + iColCount);
						
			logger.info("Extracting DataSheet Values started...");
			String sExpBuildUrl = xlObj.getCellData("Sheet1", 1, 0);
			String sExpBuildName = xlObj.getCellData("Sheet1", 1, 1);
			String sExpExcelFileName = xlObj.getCellData("Sheet1", 1, 2);
			String sExpTxtMessageTitle = xlObj.getCellData("Sheet1", 1, 3);
			String sExpGM_Title = xlObj.getCellData("Sheet1", 1, 4);
			String sExpGM_Value = xlObj.getCellData("Sheet1", 1, 5);
			String sExpVR_Title = xlObj.getCellData("Sheet1", 1, 6);
			String sExpVR_Value = xlObj.getCellData("Sheet1", 1, 7);
			String sExpUF_Title = xlObj.getCellData("Sheet1", 1, 8);
			String sExpUF_Value = xlObj.getCellData("Sheet1", 1, 9);
			String sExpUF_Prefix = xlObj.getCellData("Sheet1", 1, 10);
			
			driver.context("NATIVE_APP");
			Thread.sleep(3000);
			IndvObj.clickMobileLocationPopup();
			driver.context("CHROMIUM");
			//Google Map
			Thread.sleep(3000);
			String sActGM_Title = IndvObj.getSecGenTitle();
			oSFR.fSoftAssert(sActGM_Title.trim(),sExpGM_Title,"Google Map Title",node);
			logger.info("Validation of Google Map Control Title" + sActGM_Title) ;
			Thread.sleep(1000);
			IndvObj.setGoogleMapAddress(sExpGM_Value);
			freport("Google Map Address Entered:" + sExpGM_Value , "pass",node);
			logger.info("Address Entered in Google Map");
			Thread.sleep(1000);
			IndvObj.clickGeneralNext();
			logger.info("Google Map Next Clicked");
			
			//VR
			Thread.sleep(1000);
			String sActVR_Title = IndvObj.getSecGenTitle();
			oSFR.fSoftAssert(sActVR_Title.trim(),sExpVR_Title,"Voice Record Title",node);
			
			logger.info("Validation of Voice Record Control Title" + sActVR_Title) ;
			
			IndvObj.clickMic();
			Thread.sleep(5000);
			IndvObj.clickStop();
			String sCurrDate = utilities.Android.UtilityCustomFunctions.getCurrentDate("ddMMyyyy");
			String sPrefixVR="voice_record_" + sCurrDate;
			logger.info("Voice Recorded");
			freport("Voice Recorded:" + sPrefixVR , "pass",node);
			//Update it to Excel sheet
			
			xlObj.setCellData("Sheet1", 1, 43, sPrefixVR);
			sExpVR_Value = xlObj.getCellData("Sheet1", 1, 43);
			logger.info("Voice Record Prefix updated to Datasheet");
			
			IndvObj.clickGeneralNext();
			logger.info("Voice Record Next Clicked");
			
			//Upload file
			 String sActUF_Title = IndvObj.getSecGenTitle();
			 oSFR.fSoftAssert(sActUF_Title.trim(),sExpUF_Title,"File Upload Control Title",node);
			 logger.info("Validation of File Upload Control Title") ;

			 IndvObj.SelectFiletoUpload(sExpUF_Value);
			 Thread.sleep(3000);
			 freport("File Selected : " + sExpUF_Value  , "pass",node);
			 String sGetCurrDate =utilities.Android.UtilityCustomFunctions.getCurrentDate("ddMMyyyy");
			 String sUF_Prefix = "formshow_" + sGetCurrDate;
			 System.out.println("File Uploaded");
			 xlObj.setCellData("Sheet1", 1, 46, sUF_Prefix);
			 logger.info("Upload file prefix added to Datasheet");
			 
			 IndvObj.clickGeneralNext();
			 logger.info("FileUpload Next Clicked");
			 
			 Thread.sleep(1000);
			
			 
		
	}//Test
	

}
