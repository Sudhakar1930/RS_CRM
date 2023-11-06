package pageObjects.Android;

import java.io.File;
import java.nio.file.Files;
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
import utilities.Android.UtilityCustomFunctions;
public class IndvControls {
	AndroidDriver driver;
	File fi;
	Logger	logger = LogManager.getLogger(this.getClass());
	public IndvControls(AndroidDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		PageFactory.initElements(driver,this);
	}
	
	

	@AndroidFindBy(id="teset.test")
	private WebElement namefield;

	@FindBy(xpath="//*[@id='toast-container']")
	static WebElement eleToastMsg;
	
	@FindBy(id="com.android.chrome:id/positive_button")
	WebElement lnkAllow;
	
	@FindBy(id="com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	WebElement lnkRecAudio;
	
	@FindBy(xpath="//*[@text='Files']")
	WebElement elefileButton;
	
	@FindBy(xpath="//android.widget.ImageButton[@content-desc='Show roots']")
	WebElement eleShowRoots;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.TextView")
	WebElement eleDownloads;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/com.google.android.material.card.MaterialCardView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[1]")
	WebElement eleDoc;
	
	
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
	
	//@FindBy(xpath="//app-timelist//div")
	//In Mobile
	@FindBy(xpath="//ul[@class='tl-container tl-float']")
	WebElement lstSecElement;
	
	@FindBy(xpath="//iframe[@title='Form preview']")
	WebElement iFramePreview;
	
	
	@FindBy(xpath="//button[@aria-label='Next month']")
	WebElement btnNextMonth;
	
	@FindBy(xpath="//div[@class='msshow-container float']")
	WebElement lstRatingLabels;
	
	
	@FindBy(xpath="//button[@type='button']")
	WebElement btnDateIcon;
	
//	@FindBy(xpath="//div[@id='rootdiv']//input")
	@FindBy(xpath="//div[@id='rootdiv']//input")
	WebElement txtDateInput;
	
	//FileUpload
//	@FindBy(xpath="//div[@class='fileupshow-body-div']")
//	WebElement lnkFileUpload;
//	Mobile View Specific
	@FindBy(xpath="//img[@id='imgsrc']")
	WebElement lnkFileUpload;
	
	@FindBy(xpath="//*[@text='Files']")
	WebElement eleFile;
	
	
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
	
	
	public void clickAndroidLinkAllow() throws Exception {
//		UtilityCustomFunctions.doClick(driver, lnkAllow);
		lnkAllow.click();
	}
	public void clickAndroidAllowRecord() throws Exception {
//		UtilityCustomFunctions.doClick(driver, lnkRecAudio);
		lnkRecAudio.click();
	}
	
	public static void clickGeneralToast() {
		if(eleToastMsg.isDisplayed()) {
			eleToastMsg.click();
		}
		else {
			System.out.println("Toast not displayed");
		}
	}
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
	public String getSecGenTitle() throws Exception {
		//String sSFMessage = UtilityCustomFunctions.getValue(driver, lblSecGenTitle);
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
	public static int getTimeSlots(WebElement lstParent) {
		
		List<WebElement> options = lstParent.findElements(By.tagName("li"));
		return options.size();
	}
	public String getDateSelected() throws Exception {
//		return txtDateInput.getAttribute("value");
		return UtilityCustomFunctions.getValue(driver, txtDateInput);
		
	}
	
	
//Click Methods
	public void clickSkip() throws Exception {
		utilities.Android.UtilityCustomFunctions.doClick(driver, btnSkip);
	}
	
	public void clickResponseClose(WebDriver driver) {
		driver.switchTo().defaultContent();
		lnkCloseResponse.click();
	}
	public void clickFileUpload() throws Exception {
		UtilityCustomFunctions.doClick(driver, lnkFileUpload);
	}
	public void clickMic() throws Exception {
		utilities.Android.UtilityCustomFunctions.doClick(driver,btnVRMic);
	}
	public void clickStop() throws Exception {
		utilities.Android.UtilityCustomFunctions.doClick(driver,btnVRStop);
	}
	public void clickYesorNo(String strItem) throws Exception {
		if(strItem.equals("Yes")) {
			utilities.Android.UtilityCustomFunctions.doClick(driver,btnYes);
		}
		else {
			utilities.Android.UtilityCustomFunctions.doClick(driver,btnNo);
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
		utilities.Android.UtilityCustomFunctions.findAndClick(strItem,sLstPicMsgItems);
	}
	public void clickThankYouGo() throws Exception {
		utilities.Android.UtilityCustomFunctions.doClick(driver, btnGo);
	}
	public void clickMessageNext() throws Exception {
		utilities.Android.UtilityCustomFunctions.doClick(driver, btnMessageNext);
	}
	public void clickGeneralNext() throws Exception {
		UtilityCustomFunctions.doClick(driver, btnGeneralNext);
//		btnGeneralNext.click();
	}
	public void clickPhoneNumberNext() throws Exception {
		utilities.Android.UtilityCustomFunctions.doClick(driver, btnPhoneNumberNext);
	}
	public void clickBookAppointment() throws Exception {
		utilities.Android.UtilityCustomFunctions.doClick(driver, btnBookAppointment);
	}
	public void clickApptChooseDate() throws Exception {
		utilities.Android.UtilityCustomFunctions.doClick(driver, btnChooseDate);
	}
	public void clickApptDateIcon() throws Exception {
		utilities.Android.UtilityCustomFunctions.doClick(driver, btnDateAgain);
	}
	public void clickTodayDate() throws Exception {
		utilities.Android.UtilityCustomFunctions.doClick(driver, btnCurrentDate);
	}
	public void clickMSDropDown() throws Exception {
		utilities.Android.UtilityCustomFunctions.doClick(driver, btnMultiSelectDropDown);
	}
	public void clickListInput() throws Exception {
		utilities.Android.UtilityCustomFunctions.doClick(driver, txtListControl);
	}
	public static void clickFirstItem(WebElement lstElement,AndroidDriver driver) throws Exception {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<WebElement> Slots = lstElement.findElements(By.tagName("li"));
		System.out.println("class: " + lstElement.getAttribute("class"));
		System.out.println("Size:" + Slots.size());
		System.out.println("Before js click firstitem");
		System.out.println("class: " + Slots.get(0).getAttribute("class"));
		js.executeScript("arguments[0].click();",Slots.get(0));
		System.out.println("after js click");
		/*
		for(int i = 0;i<Slots.size();i++) {
			System.out.println(Slots.get(i).getText());
			Slots.get(i).click();
			break;
			
		}
		
		for(WebElement Slot: Slots) {
			System.out.println("Time slot selected: " + Slot.getText());
			utilities.UtilityCustomFunctions.doClick(driver, Slot);
			break;
		}
		*/
	}
	
	public static boolean setApptdate(WebElement btnChooseDate,AndroidDriver driver,WebElement btnNextMonth,WebElement lstElement,boolean bNewMonth) throws Exception {
		boolean bSlotFound = false;
		
	    tcols = driver.findElements(By.xpath("//table[@role='presentation']/tbody/tr/td"));
		
	   if(bNewMonth==false) {
		
		   System.out.println("New Month:"+bNewMonth +"tcols size: " + tcols.size());
		int iDay=0;
		
		for(int i=0; i<tcols.size(); i++) {
			
			tcols = driver.findElements(By.xpath("//table[@role='presentation']/tbody/tr/td"));
			Thread.sleep(1000);
			String tcol=utilities.Android.UtilityCustomFunctions.getText(driver, tcols.get(i));
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
						utilities.Android.UtilityCustomFunctions.doClick(driver, tcols.get(i));
						
						if(getTimeSlots(lstElement)!=0) {
							System.out.println("Current Month: Avl Date Selected:timeslots listed");
							clickFirstItem(lstElement,driver);
							System.out.println("First slot clicked");
//							clickGeneralToast();
							bSlotFound=true;
							break;
						}//getTimeSlot
						else
						{
							System.out.println("No slots : on " + trim );
							utilities.Android.UtilityCustomFunctions.doClick(driver, btnChooseDate);
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
						clickGeneralToast();
						if(getTimeSlots(lstElement)!=0) {
							Thread.sleep(2000);
							clickFirstItem(lstElement,driver);
							
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
		utilities.Android.UtilityCustomFunctions.sendKeys(driver, txtGoogleMapInput, strAddress);
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
	public void SelectFiletoUpload(String sFUPath) throws Exception {
		System.out.println("Before FileUpload link");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(lnkFileUpload));
		wait.until(ExpectedConditions.elementToBeClickable(lnkFileUpload));
		Thread.sleep(3000);
		lnkFileUpload.click();
		System.out.println("FileUpload link visible");
//		UtilityCustomFunctions.doClick(driver, lnkFileUpload);
	    Thread.sleep(3000);
	    /*
	    fi = new File(sFUPath);
	    byte[] fileContent = Files.readAllBytes(fi.toPath()); 
		driver.pushFile("storage/Downloads/TestFile.txt", fileContent);
		System.out.println("After file push");*/
	    //Change Context to Native
		Thread.sleep(1000);
		driver.context("NATIVE_APP");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(lnkRecAudio));
	    Thread.sleep(3000);
	    if(lnkRecAudio.isDisplayed()) {
			lnkRecAudio.click();
		}
		else {
			System.out.println("chrome to record not present");
		}
	    Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(elefileButton));
        elefileButton.click();
        System.out.println("Files button clicked");
        Thread.sleep(3000);
        
        
        wait.until(ExpectedConditions.visibilityOf(eleShowRoots));
        eleShowRoots.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(eleDownloads));
		Thread.sleep(5000);
		eleDownloads.click();
		
		Thread.sleep(5000);
        System.out.println("After Push file");
		wait.until(ExpectedConditions.visibilityOf(eleDoc));
		Thread.sleep(5000);
		eleDoc.click();
        
        System.out.println("After eledoc Seelected");
        driver.context("CHROMIUM");
 	}
	
	public boolean selectOneItem(String strItem) throws Exception{
		boolean bFlag = false;
		System.out.println("SelectOneChoice:" + SelectOneChoice);
		bFlag = utilities.Android.UtilityCustomFunctions.selectOneItemfromListBox(driver, SelectOneChoice, strItem);
		return bFlag;
	}
	public void selectListItem(String strItem) throws Exception{
		
		utilities.Android.UtilityCustomFunctions.selectOneItemfromListBox(driver, lstListValue, strItem);
	}
	public boolean setDate(String isNextMonthClicked)throws Exception{
		//UtilityCustomFunctions uObj = new UtilityCustomFunctions(driver);
		return clickDate(isNextMonthClicked,btnCurrentDate,btnDateIcon, btnNextMonth);
	}
	
	public String selectFirstAppointMent() throws Exception{
		return utilities.Android.UtilityCustomFunctions.selectFirstListItem(driver, lstElement);
	}
	public void selectMultiItems(String strValues) throws Exception{
		utilities.Android.UtilityCustomFunctions.selectMultiItemfromListBox(driver, lstMultiSelectValues, strValues);
	}
	public void clickLinks(String strLinks) throws Exception{
		utilities.Android.UtilityCustomFunctions.clickLinkItems(driver, btnLinksControl, strLinks);
	}
	public void setTextAnswer(String sTextQuestion) throws Exception{
		utilities.Android.UtilityCustomFunctions.sendKeys(driver, txtTextQuestionInput, sTextQuestion);
	}
	public void setEmail(String sEmail) throws Exception{
		utilities.Android.UtilityCustomFunctions.sendKeys(driver, txtEmailInput, sEmail);
	}
	public void setPhoneNumber(String sPhoneNumber) throws Exception{
		utilities.Android.UtilityCustomFunctions.sendKeys(driver, txtPhoneNumberInput, sPhoneNumber);
	}
	public String selectNextDate()throws Exception{
	return utilities.Android.UtilityCustomFunctions.SelectNextAvailDate(driver,WbTblAppointMent, btnCurrentDate);
	}
	public void setNumber(String sNumber) throws Exception{
		utilities.Android.UtilityCustomFunctions.sendKeys(driver, txtNumberInput, sNumber);
	}
	public void setRange(int iSliderValue) throws Exception{
		for(int i = 0;i<iSliderValue;i++) {
			eleRangeSlider.sendKeys(Keys.ARROW_RIGHT);
		}
	}
	public void setRankingMatrix(String sRankValues) throws Exception{
		//setRankMatrix
		utilities.Android.UtilityCustomFunctions.setRankMatrix(btnRankMatrixTbl, sRankValues);
	}
	//ClickDate
    public  boolean clickDate(String sNextMonthClicked,WebElement eleCurrDate,WebElement eleChooseDate,WebElement eleNextMonth) throws Exception {
		boolean bIsDateSelected=false;
		if(sNextMonthClicked=="No") {
		eleChooseDate.click();
		}
		List<WebElement> tDateCols = driver.findElements(By.xpath("//table[@role='presentation']/tbody/tr/td"));
		System.out.println("tDateCols  " + tDateCols.size());
		for (int j = 0; j < tDateCols.size(); j++) {
			
			String sDateAttribute = tDateCols.get(j).getAttribute("class");
			tDateCols = driver.findElements(By.xpath("//table[@role='presentation']/tbody/tr/td"));
			
			if(tDateCols.get(j).getText().length()<3 && tDateCols.get(j).getText().length()!=0) {
				
				if(Integer.parseInt(eleCurrDate.getText())<= Integer.parseInt(tDateCols.get(j).getText())) {
					
					if(sDateAttribute.contains("disabled")) {
//						
					}
					else {
						
						
						sDateAttribute = tDateCols.get(j).getAttribute("class");
						System.out.println("Date control selected date class: "+ sDateAttribute);
						tDateCols.get(j).click();
//						UtilityCustomFunctions.doClick(driver, tDateCols.get(j));
						
						bIsDateSelected = true;
						break;
					}//if disabled
				}//ParseInt 
			}//Only Date
			
		}//For loop
		if(bIsDateSelected==false) {
			eleNextMonth.click();
    
		}
		return bIsDateSelected;
	}	
}
