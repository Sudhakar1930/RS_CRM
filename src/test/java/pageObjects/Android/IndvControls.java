package pageObjects.Android;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utilities.UtilityCustomFunctions;
public class IndvControls {
	AndroidDriver driver;
	Logger	logger = LogManager.getLogger(this.getClass());
	public IndvControls(AndroidDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		PageFactory.initElements(driver,this);
	}
	
	@AndroidFindBy(id="teset.test")
	private WebElement namefield;
	
	@FindBy(xpath="//button[normalize-space()='next']")
	WebElement btnGeneralNext;
	
	public static List<WebElement> tcols;
	
	//WebElements
	@FindBy(xpath="//*[@id='rootdiv']/div/h3")
	WebElement lblMessageTitle;
	
	@FindBy(xpath="//*[@id='rootdiv']/p/button/span")
	WebElement btnMessageNext;
	
	//Multi Choice WebElement
	@FindBy(xpath="//*[@id='rootdiv']/div/h3")
	WebElement lblMutiChoiceTitle;
	
	@FindBy(xpath="//*[@id='rootdiv']/div/p/span")
	WebElement lblNewMutiChoiceTitle;
	
	@FindBy(xpath="//*[@id='rootdiv']/ul")
	WebElement SelectOneChoice;
	
	@FindBy(css="div[class='ql-editor'] h3")
	WebElement lblGeneralTitle;
	
	@FindBy(css="#textquestion_textarea")
	WebElement txtTextQuestionInput;

	@FindBy(xpath="	//input[@id='ems_email']")
	WebElement txtEmailInput;

	@FindBy(id="phs_phonenumber")
	WebElement txtPhoneNumberInput;
	
	
	@FindBy(xpath="//my[@class='ng-star-inserted']")
	WebElement btnPhoneNumberNext;
	
	@FindBy(xpath="//button[normalize-space()='Book an appointment']")
	WebElement btnBookAppointment;
	
	@FindBy(css="svg")
	WebElement btnApptDateIcon;
	
	
	@FindBy(xpath="//input[@placeholder='Choose Date']")
	WebElement btnChooseDate;
	
	@FindBy(xpath="(//*[name()='path'])[1]")
	WebElement btnSelectDate;
	
	@FindBy(xpath="//*[@id='mat-dialog-0']/app-timelist/div/div[2]/div/mat-datepicker-toggle/button")
	WebElement btnDateAgain;
	
	@FindBy(xpath="//div[contains(@class,'today')]")
	WebElement btnCurrentDate;
	
	@FindBy(xpath="//table[@class='mat-calendar-table']")
	WebElement WbTblAppointMent;
	
	@FindBy(css="button[type='text']")
	WebElement btnAppointmentTime;
	
	
	@FindBy(xpath="//table[@role='presentation']/tbody/tr")
	WebElement eleWbCalendarTbl;

	
	@FindBy(xpath="//div//h3/span")
	WebElement lblSecGenTitle;
	
	@FindBy(xpath="//div//h3")
	WebElement lblThirdGenTitle;
	
	//@FindBy(css="ul[class='item2']")
	@FindBy(css="ul[class='item2']")
	WebElement lstMultiSelectValues;
	
	@FindBy(xpath="(//ul)[1]")
	WebElement lstListValue;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement txtListControl;
	
	
	@FindBy(xpath="//input[@id='numbershow']")
	WebElement txtNumberInput;
	
	@FindBy(xpath="//input[@id='rangeinput']")
	WebElement eleRangeSlider;
	
	
	@FindBy(xpath="//div//ul")
	WebElement lstElement;
	
	@FindBy(xpath="//app-timelist//div")
	WebElement lstSecElement;
	
	
	@FindBy(xpath="//iframe[@title='Form preview']")
	WebElement iFramePreview;
	
	
	@FindBy(xpath="//button[@aria-label='Next month']")
	WebElement btnNextMonth;
	
	@FindBy(xpath="//div[@class='msshow-container float']")
	WebElement lstRatingLabels;
	
	
	@FindBy(xpath="//button[@type='button']")
	WebElement btnDateIcon;
	
	@FindBy(xpath="//div[@id='rootdiv']//input")
	WebElement txtDateInput;
	//FileUpload
//	@FindBy(xpath="//div[@class='fileupshow-body-div']")
//	WebElement lnkFileUpload;
//	Mobile View Specific
	@FindBy(xpath="//img[@id='imgsrc']")
	WebElement lnkFileUpload;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_button")
	WebElement elementView;
	
	@FindBy(xpath="//*[@text='Files']")
	WebElement eleFile;
	
	@FindBy(id="com.android.documentsui:id/thumbnail")
	WebElement eleDoc;
	
	@FindBy(xpath="//ul[@class='linkshow-container float']")
	WebElement btnLinksControl;
	
	@FindBy(xpath="//*[@id='rootdiv']/p/button")
	WebElement btnGo;
	
	@FindBy(xpath="//label[@class='picmsgshow-valuelbl']")
	//List<WebElement> sLstPicMsgItems = driver.findElements(By.xpath("//label[@class='picmsgshow-valuelbl']"));
	List<WebElement> sLstPicMsgItems;
	//WebElement lstItemLabels;
	
	@FindBy(xpath="//div[@data-flg='1']")
	WebElement btnYes;
	
	@FindBy(xpath="//div[@data-flg='0']")
	WebElement btnNo;
	
	
	@FindBy(xpath="//span[@id='agreement_txt']")
	WebElement lblAgreementText;
	
	@FindBy(id="agg_check_btn")
	WebElement btnCheckAgreement;
	
	@FindBy(xpath="//table[@class='table-rscss']")
	WebElement btnRankMatrixTbl;
	
	@FindBy(xpath="//i[normalize-space()='mic']")
	WebElement btnVRMic;
	
	@FindBy(xpath="//i[normalize-space()='stop']")
	WebElement btnVRStop;
	
	@FindBy(xpath="//input[contains(@class,'gmshow-input myanimation')]")
	WebElement txtGoogleMapInput;
	
	
	@FindBy(xpath="p[class='ql-align-left'] span")
	WebElement lblSecMsgcontrol;
	
	@FindBy(xpath="//div[@class='epsf-ans-mydata']//table//td//span")
	List<WebElement> lstRankMatrixResp;
	
	@FindBy(xpath="//*[@id='rootdiv']//ul//li/div")
	List<WebElement> lstMsControl;
	
	//@FindBy(xpath="//span[@class='dropdown-btn']")
	//WebElement eleDropDown = driver.findElement(By.className("dropdown-btn"));
	@FindBy(className="//span[@class='dropdown-btn']")
	WebElement btnMultiSelectDropDown;
	
	@FindBy(xpath="//*[@id='ssIFrame_google']")
	WebElement iFrameForClose;
	
	@FindBy(xpath="//button[contains(@class,'fp-close')]")
	WebElement lnkCloseResponse;
	
	
	@FindBy(xpath="//button[normalize-space()='skip']")
	WebElement btnSkip;
	
	@FindBy(xpath="//*[@id=\"sidebar_footer\"]/button/label")
	WebElement btnLogout;
	
	@FindBy(xpath="//div[@class='secshow-rootdiv']")
	WebElement eleSectionControl;
	
	@AndroidFindBy(xpath=".//android.widget.Button[@text='Allow']")
	WebElement eleLocPopupAllow;
	
	
	public void clickMobileLocationPopup() {
		eleLocPopupAllow.click();
	}
	public void clickLogout() {
		if(btnLogout.isDisplayed()) {
			btnLogout.click();
		}
	}
	
	public boolean bIsAppointmentDisplayed() {
		boolean bFlag = false;
		bFlag = IsElementVisible(driver,btnBookAppointment); 
		return bFlag;
	}
	public boolean bIsNumberDisplayed() {
		boolean bFlag = false;
		bFlag = IsElementVisible(driver,txtNumberInput); 
		return bFlag;
	}
	public boolean bIsTextQuestionDisplayed() {
		boolean bFlag = false;
		bFlag = IsElementVisible(driver,txtTextQuestionInput); 
		return bFlag;
	}
	public boolean bIsRankMatrixDisplayed() {
		boolean bFlag = false;
		bFlag = IsElementVisible(driver,btnRankMatrixTbl); 
		return bFlag;
	}
	public boolean bIsRangeDisplayed() {
		boolean bFlag = false;
		bFlag = IsElementVisible(driver,eleRangeSlider); 
		return bFlag;
	}
	public boolean bIsEmailDisplayed() {
		boolean bFlag = false;
		bFlag = IsElementVisible(driver,txtEmailInput); 
		return bFlag;
	}
	
	public boolean bIsYesorNoDisplayed() {
		boolean bFlag = false;
		bFlag = IsElementVisible(driver,btnYes); 
		return bFlag;
	}
	
	public boolean bIsGoogleMapDisplayed() {
		boolean bFlag = false;
		bFlag = IsElementVisible(driver,txtGoogleMapInput); 
		return bFlag;
	}
	public boolean bIsPhoneNoDisplayed() {
		boolean bFlag = false;
		bFlag = IsElementVisible(driver,txtPhoneNumberInput); 
		return bFlag;
	}
	public boolean bIsListDisplayed() {
		boolean bFlag = false;
		bFlag = IsElementVisible(driver,txtListControl); 
		return bFlag;
	}
	
	public boolean bIsFileUploadDisplayed() {
		boolean bFlag = false;
		bFlag = IsElementVisible(driver,lnkFileUpload); 
		return bFlag;
	}
	
	// isDisplayed
	public boolean bIsSectionDisplayed() {
		boolean bFlag = false;
		bFlag = IsElementVisible(driver,eleSectionControl); 
		return bFlag;
	}
	public boolean bIsAgreementDisplayed() {
		boolean bFlag = false;
		bFlag = IsElementVisible(driver,lblAgreementText); 
		return bFlag;
	}
	
	
	
	public boolean bIsVRDisplayed() {
		boolean bFlag1,bFlag2,bFlag = false;
		bFlag1 = IsElementVisible(driver,btnVRMic); 
		bFlag2 = IsElementVisible(driver,btnVRStop);
		if(bFlag1==true && bFlag2==true) {
			bFlag = true;
		}
		else {
			bFlag = false;
		}	
		return bFlag;
	}
	
	public boolean IsElementVisible(WebDriver driver,WebElement element) {
		boolean bIsElementVisible=false;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		
		if(element.isDisplayed()) {
			bIsElementVisible = true;
		}
		else {
			bIsElementVisible = false;
		}
		return bIsElementVisible;
	}
	
	
	public boolean bSkipPresent() {
		boolean bSkip = false;
		try {
		 bSkip = btnSkip.isDisplayed();
		}catch(Exception e) {
			bSkip=false;
		}
		return bSkip;
	}
	
	public boolean bEmailPresent() {
		boolean bEmail = false;
		try {
			bEmail = txtEmailInput.isDisplayed();
		}catch(Exception e) {
			bEmail=false;
		}
		return bEmail;
	}

	public void clickSkip() throws Exception {
		utilities.UtilityCustomFunctions.doClick(driver, btnSkip);
	}
	
	public void clickResponseClose(WebDriver driver) {
		driver.switchTo().defaultContent();
		lnkCloseResponse.click();
	}
	
	
	//Get Methods

	public String getRespRMValues() {
		UtilityCustomFunctions uObj = new UtilityCustomFunctions(driver); 
		String sSFMessage= uObj.getRespankMatrixValues(lstRankMatrixResp);
		return sSFMessage;
	}
	
	public String getSectIndvMsg() {
		String sSFMessage = lblSecMsgcontrol.getText();
		return sSFMessage;
	}
	
	
	public String getAgreementMsg() {
		String sSFMessage = lblAgreementText.getText();
		return sSFMessage;
	}
	public String getSFMessage() {
		String sSFMessage = lblMessageTitle.getText();
		return sSFMessage;
	}
	
	public String getMultiChoiceTitle() {
		String sSFMessage = lblMutiChoiceTitle.getText();
		return sSFMessage;
	}
	public String getGeneralTitle() {
		String sSFMessage = lblGeneralTitle.getText();
		return sSFMessage;
	}
	public String getSecGenTitle() {
		String sSFMessage = lblSecGenTitle.getText();
		return sSFMessage;
	}
	
	public String getThirdGenTitle() {
		String sSFMessage = lblThirdGenTitle.getText();
		return sSFMessage;
	}
	public String getBtnApptMsg() {
		String sSFMessage = btnAppointmentTime.getText();
		return sSFMessage;
	}
	public static int getTimeSlots(WebElement lstElement) {
		List<WebElement> options = lstElement.findElements(By.tagName("li"));
		return options.size();
	}
	public String getDateSelected() {
		return txtDateInput.getAttribute("value");
	}
	
	
//Click Methods
	public void clickMic() throws Exception {
		utilities.UtilityCustomFunctions.doClick(driver,btnVRMic);
	}
	public void clickStop() throws Exception {
		utilities.UtilityCustomFunctions.doClick(driver,btnVRStop);
	}
	public void clickYesorNo(String strItem) throws Exception {
		if(strItem.equals("Yes")) {
			utilities.UtilityCustomFunctions.doClick(driver,btnYes);
		}
		else {
			utilities.UtilityCustomFunctions.doClick(driver,btnNo);
		}
	}
public boolean clickMatchingLabel(String strItem) throws Exception {
		boolean bItemRating = false;
		bItemRating = clickMatchItem(strItem,lstRatingLabels);
		return bItemRating;
}		
	 public  boolean clickMatchItem(String strItem,WebElement lstLabelDivs) {
		 	
		 	boolean bRating = false;
			List<WebElement> sMatchItems = lstLabelDivs.findElements(By.tagName("label"));
			System.out.println("Rating Labels count: " + sMatchItems.size());
			System.out.println("Match item:" + sMatchItems.size());
			for(WebElement item: sMatchItems) {
				if(strItem.equalsIgnoreCase(item.getText().trim())) {
					System.out.println("Matched item:"+ item.getText());
					item.click();
					bRating = true;
					break;
				}

			}//for loop
			return bRating;
			
			
		}//method
	 
	public void clickPictMsgMatchLabel(String strItem) throws Exception {
		System.out.println("Size before calling: " + sLstPicMsgItems.size());
		utilities.UtilityCustomFunctions.findAndClick(strItem,sLstPicMsgItems);
	}
	public void clickThankYouGo() throws Exception {
		utilities.UtilityCustomFunctions.doClick(driver, btnGo);
	}
	public void clickMessageNext() throws Exception {
		utilities.UtilityCustomFunctions.doClick(driver, btnMessageNext);
	}
	public void clickGeneralNext() throws Exception {
//		utilities.UtilityCustomFunctions.doClick(driver, btnGeneralNext);
		btnGeneralNext.click();
	}
	public void clickPhoneNumberNext() throws Exception {
		utilities.UtilityCustomFunctions.doClick(driver, btnPhoneNumberNext);
	}
	public void clickBookAppointment() throws Exception {
		utilities.UtilityCustomFunctions.doClick(driver, btnBookAppointment);
	}
	public void clickApptChooseDate() throws Exception {
		utilities.UtilityCustomFunctions.doClick(driver, btnChooseDate);
	}
	public void clickApptDateIcon() throws Exception {
		utilities.UtilityCustomFunctions.doClick(driver, btnDateAgain);
	}
	public void clickTodayDate() throws Exception {
		utilities.UtilityCustomFunctions.doClick(driver, btnCurrentDate);
	}
	public void clickMSDropDown() throws Exception {
		utilities.UtilityCustomFunctions.doClick(driver, btnMultiSelectDropDown);
	}
	public void clickListInput() throws Exception {
		utilities.UtilityCustomFunctions.doClick(driver, txtListControl);
	}
	public static void clickFirstItem(WebElement lstElement,AndroidDriver driver) throws Exception {
		List<WebElement> Slots = lstElement.findElements(By.tagName("li"));
		Thread.sleep(1000);
		for(WebElement Slot: Slots) {
			System.out.println("Time slot selected: " + Slot.getText());
			utilities.UtilityCustomFunctions.doClick(driver, Slot);
			break;
		}
	}
	
	public static boolean setApptdate(WebElement btnChooseDate,AndroidDriver driver,WebElement btnNextMonth,WebElement lstElement,boolean bNewMonth) throws Exception {
		//UtilityCustomFunctions uObj = new UtilityCustomFunctions(driver);
		boolean bSlotFound = false;
		
	    tcols = driver.findElements(By.xpath("//table[@role='presentation']/tbody/tr/td"));
		
	   if(bNewMonth==false) {
		
		   System.out.println("New Month:"+bNewMonth +"tcols size: " + tcols.size());
		int iDay=0;
		
		for(int i=0; i<tcols.size(); i++) {
			
			tcols = driver.findElements(By.xpath("//table[@role='presentation']/tbody/tr/td"));
			Thread.sleep(1000);
			String tcol=utilities.UtilityCustomFunctions.getValue(driver, tcols.get(i));
//			String tcol=tcols.get(i).getText();
			String trim = tcol.trim();
			System.out.println("This text is trimmed text--"+trim);
			//tcols = tcolumns;
			System.out.println("tcols size:" + tcols.size());
			System.out.println("Is it New Month: " + bNewMonth);
			iDay = iDay + 1;
			
				System.out.println("It's current month");
				
				//System.err.println(trim.length());
				System.out.println("td value is: "+ iDay +" " + trim.length());
			if(trim.length()<3 && trim.length()!=0) {
				WebElement eleCurrDate = driver.findElement(By.xpath("//div[contains(@class,'today')]"));
				System.out.print("eleCurrDate is: "+ eleCurrDate);
				int iCurrDay = Integer.parseInt(eleCurrDate.getText());
				System.out.println("Current Day: " +iCurrDay + "td value is: "+trim);
				if(Integer.parseInt(trim)>=iCurrDay) {
					if(tcols.get(i).getAttribute("class").contains("disabled")){
						continue;
					}
					else {
						Thread.sleep(2000);
						System.out.println("Current Month: Date Enabled: so click it");
//						tcols.get(i).click();
						utilities.UtilityCustomFunctions.doClick(driver, tcols.get(i));
//						try {
//						WebElement eleToastLoaded = driver.findElement(By.xpath("(*//[@elementId='00000000-0000-0687-0000-461f0000006e']"));
//						if(eleToastLoaded.isDisplayed()) {
//							System.out.println("toast message available");
//							eleToastLoaded.click();
//						}
						if(getTimeSlots(lstElement)!=0) {
							Thread.sleep(2000);
							clickFirstItem(lstElement,driver);
							
//							WebElement eleToastSuccess = driver.findElement(By.xpath("(*//[@elementId='00000000-0000-0687-0000-4b320000006e']"));
//							if(eleToastSuccess.isDisplayed()) {
//								eleToastSuccess.click();
//								System.out.println("confirm toast");
//							}
							
							bSlotFound=true;
							break;
						}//getTimeSlot
						else
						{
							System.out.println("No slots : on " + trim );
							utilities.UtilityCustomFunctions.doClick(driver, btnChooseDate);
						}// When no slots in 
						
					}//attribute check
				}//dates>currday
		}//all the dates in a month
		}//for each loop/for loop
	   }// If Current Month
		else {// If new Month
			System.out.println("Inside New Month:"+bNewMonth +"tcols size: " + tcols.size());
			for(int j=0; j<tcols.size(); j++) {
				tcols = driver.findElements(By.xpath("//table[@role='presentation']/tbody/tr/td"));
				String tcol=tcols.get(j).getText();
				String trim = tcol.trim();
				if(trim.length()<3) {
					if(tcols.get(j).getAttribute("class").contains("disabled")){
						continue;
					}
					else {
						Thread.sleep(2000);
						System.out.println("New Month: Date Enabled: so click it");
						tcols.get(j).click();
						if(getTimeSlots(lstElement)!=0) {
							Thread.sleep(2000);
							clickFirstItem(lstElement,driver);
							WebElement eleToastSuccess = driver.findElement(By.xpath("(*//[@elementId='00000000-0000-0687-0000-4b320000006e']"));
							if(eleToastSuccess.isDisplayed()) {
								eleToastSuccess.click();
								System.out.println("confirm toast");
							}
							bSlotFound=true;
							break;
						}//getTimeSlot
						else
						{
							System.out.println("No slots : on " + trim );
							btnChooseDate.click();
						}
						
					}//if day enabled/disabled
				}//Only Days, excluding Month ShortName
				
				
			}// Iterating all days in New Month
			
			
			
		}
		if(bSlotFound==false) {
			btnNextMonth.click();
		}
		return bSlotFound;
	}
	
	/*
	public void setAppointMentDate() throws InterruptedException {
		boolean bDateFound=false;
		eleCurrDate = driver.findElement(By.xpath("//div[contains(@class,'today')]"));
		String sTodayStatus = eleCurrDate.getAttribute("class");
		if(sTodayStatus.contains("disabled")) {
			System.out.println(sTodayStatus);
			bDateFound=utilities.UtilityCustomFunctions.clickDateAndGetslots(driver, eleWbCalendarTbl, eleCurrDate, lstElement, btnChooseDate);
		}
		else
		{
			eleCurrDate.click();
			System.out.println("Current Date Selected");
			int itslots = getTimeSlots(lstElement);
			System.out.println("Time Slots: "+ itslots);
			if(itslots==0) {
				btnChooseDate.click();
				bDateFound=utilities.UtilityCustomFunctions.clickDateAndGetslots(driver, eleWbCalendarTbl, eleCurrDate, lstElement, btnChooseDate);
			}
			else {
				clickFirstItem(lstElement);
			}
			
		}
		if(bDateFound=false) {
			//click next month
			
			do {
				btnNextMonth.click();
				bDateFound=utilities.UtilityCustomFunctions.clickDateAndGetslots(driver, eleWbCalendarTbl, eleCurrDate, lstElement, btnChooseDate);
			}while(bDateFound==false);
			//call clickDateandGetSlots
			
		}
		
	}*/
	//Select/Set Values
	public boolean setAppointmentDate(boolean bNewMonth) throws Exception {
		return setApptdate(btnChooseDate,driver,btnNextMonth,lstElement,bNewMonth);
	}
	public boolean setApptDateInSection(boolean bNewMonth) throws Exception  {
		return setApptdate(btnChooseDate,driver,btnNextMonth,lstSecElement,bNewMonth);
	}
	public void setDropdownMS(String sExpValue) {
		WebElement eleDropDown = driver.findElement(By.className("dropdown-btn"));
		List<WebElement> lstMsCoontrol = driver.findElements(By.xpath("//*[@id='rootdiv']//ul//li/div"));
		
		//selDropdownMS(driver,lstMsCoontrol,eleDropDown,sExpValue);
		
	
		selectMS(driver, lstMsCoontrol, eleDropDown,sExpValue);
	}
	public void setGoogleMapAddress(String strAddress) {
		utilities.UtilityCustomFunctions.sendKeys(driver, txtGoogleMapInput, strAddress);
	}
	
	public static void selectMS(WebDriver webDriver, List<WebElement> lstMsCoontrol, WebElement eleDropDown,String sMS_Value) {

		
		try {
			//((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", lstMsCoontrol);
			
			
			System.out.println(lstMsCoontrol.size());
			System.out.println("Expected values:" + sMS_Value);
			String arrValues[]=sMS_Value.split(",");
			eleDropDown.click();
			Thread.sleep(1000);
			for(int i=0;i<arrValues.length;i++) {
				for (WebElement option : lstMsCoontrol) {
					System.out.println("Option is: " + option.getText());
					if (arrValues[i].trim().equalsIgnoreCase(option.getText().trim())) {
						option.click();
					}
				}
			}
			eleDropDown.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			System.out.println(e.getCause());
			Assert.fail("MultiSelection Failed");
		}
		
	}//function end
	//@SuppressWarnings("deprecation")
	public static void selDropdownMS(WebDriver webDriver, List<WebElement> lstMsControl, WebElement eleDropDown,String sMS_Value) {
		List<WebElement> listMSControl = (List<WebElement>) lstMsControl;
		System.out.println("MultiSelect size: "+listMSControl.size());
		eleDropDown.click();
		
		try {
			((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", lstMsControl);
			
			
			
			System.out.println("Expected values:" + sMS_Value);
			String arrValues[]=sMS_Value.split(",");
			Thread.sleep(1000);
			;
			Thread.sleep(1000);
			for(int i=0;i<arrValues.length;i++) {
				for (WebElement option : listMSControl) {
					System.out.println("Option is: " + option.getText());
					if (arrValues[i].equalsIgnoreCase(option.getText().trim())) {
						option.click();
					}
				}
			}
			eleDropDown.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			System.out.println(e.getCause());
			Assert.fail("MultiSelection Failed");
		}
		
	}//function end
	//@SuppressWarnings("deprecation")
	public void setAgreementCheckBox() {
		if(!btnCheckAgreement.isSelected()){
			Assert.assertEquals("Agreement checkbox checked", "Agreement checkbox Not selected");
			btnCheckAgreement.click();
		}
	}
	public void SelectFiletoUpload(String sFUPath) throws IOException, InterruptedException {
		lnkFileUpload.click();
		Thread.sleep(1000);
		driver.pushFile("/Download/NewFile.txt", new File("D:\\NewFile.txt"));
		
		Set<String> contextNames = driver.getContextHandles();
        for (String strContextName : contextNames) {
            if (strContextName.contains("NATIVE_APP")) {
                driver.context("NATIVE_APP");
                break;
            }
        }
        
        //Click Allow Permission
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(elementView));
        elementView.click();
        
        wait.until(ExpectedConditions.visibilityOf(eleFile));
        eleFile.click();
        
        wait.until(ExpectedConditions.visibilityOf(eleDoc));
        eleDoc.click();
        
        //Switch to Chrome browser
        Set<String> contextNames1 = driver.getContextHandles();
        for (String strContextName : contextNames1) {
            if (strContextName.contains("CHROMIUM")) {
                driver.context("CHROMIUM");
                break;
            }
        }
        
 	}
	
	public boolean selectOneItem(String strItem) throws Exception{
		boolean bFlag = false;
		System.out.println("SelectOneChoice:" + SelectOneChoice);
		bFlag = utilities.UtilityCustomFunctions.selectOneItemfromListBox(driver, SelectOneChoice, strItem);
		return bFlag;
	}
	public void selectListItem(String strItem) throws Exception{
		
		utilities.UtilityCustomFunctions.selectOneItemfromListBox(driver, lstListValue, strItem);
	}
	public boolean setDate(String isNextMonthClicked)throws Exception{
		UtilityCustomFunctions uObj = new UtilityCustomFunctions(driver);
		return uObj.clickDate(isNextMonthClicked,btnCurrentDate,btnDateIcon, btnNextMonth);
	}
	
	public String selectFirstAppointMent() throws Exception{
		return utilities.UtilityCustomFunctions.selectFirstListItem(driver, lstElement);
	}
	public void selectMultiItems(String strValues) throws Exception{
		utilities.UtilityCustomFunctions.selectMultiItemfromListBox(driver, lstMultiSelectValues, strValues);
	}
	public void clickLinks(String strLinks) throws Exception{
		utilities.UtilityCustomFunctions.clickLinkItems(driver, btnLinksControl, strLinks);
	}
	public void setTextAnswer(String sTextQuestion) throws Exception{
		utilities.UtilityCustomFunctions.sendKeys(driver, txtTextQuestionInput, sTextQuestion);
	}
	public void setEmail(String sEmail) throws Exception{
		utilities.UtilityCustomFunctions.sendKeys(driver, txtEmailInput, sEmail);
	}
	public void setPhoneNumber(String sPhoneNumber) throws Exception{
		utilities.UtilityCustomFunctions.sendKeys(driver, txtPhoneNumberInput, sPhoneNumber);
	}
	public String selectNextDate()throws Exception{
	return utilities.UtilityCustomFunctions.SelectNextAvailDate(driver,WbTblAppointMent, btnCurrentDate);
	}
	public void setNumber(String sNumber) throws Exception{
		utilities.UtilityCustomFunctions.sendKeys(driver, txtNumberInput, sNumber);
	}
	public void setRange(int iSliderValue) throws Exception{
		for(int i = 0;i<iSliderValue;i++) {
			eleRangeSlider.sendKeys(Keys.ARROW_RIGHT);
		}
	}
	public void setRankingMatrix(String sRankValues) throws Exception{
		//setRankMatrix
		utilities.UtilityCustomFunctions.setRankMatrix(btnRankMatrixTbl, sRankValues);
	}
}
