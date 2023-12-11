package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.UtilityCustomFunctions;
public class DetailViewPage extends BasePage{

	public DetailViewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="(//div[@class='col-md-12']//b)[1]")
	WebElement lblPhoneNumberTitle;
	
	@FindBy(xpath="(//div[@class='col-md-12']//b)[2]")
	WebElement lblEmailTitle;
	
	@FindBy(xpath="(//div[@class='col-md-12']//b)[3]")
	WebElement lblMenuItemTitle;
	
	@FindBy(linkText="Summary")
	WebElement tabSummary;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[1]")
	WebElement lblPhoneNumberSummary;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[2]")
	WebElement lblNumberFieldSummary;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[3]")
	WebElement lblEmailSummary;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[4]")
	WebElement lblMenuItemSummary;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[5]")
	WebElement lblEnterYourNMSummary;
	
	@FindBy(xpath="//a[normalize-space()='Details']")
	WebElement lnkDetailView;
	
	@FindBy(xpath="//a[@class='header_dup_all_module_show_btn']")
	WebElement lnkNavBarModuleName;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[1]")
	WebElement lblAssignedToDetailView;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[2]")
	WebElement lblPhoneNumberDetailView;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[3]")
	WebElement lblNumberFieldDetailView;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[4]")
	WebElement lblEmailDetailView;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[5]")
	WebElement lblMenuItemDetailView;
	
	@FindBy(xpath="(//div[@class='col-lg-10'])[6]")
	WebElement lblEYPNDetailView;
	
	
	//click Methods
	public void clickDetailView() throws Exception {
		UtilityCustomFunctions.doClick(driver, lnkDetailView);
	}
	
	public void clickSummaryView() throws Exception {
		UtilityCustomFunctions.doClick(driver, tabSummary);
	}
	//Get Methods.
	public String getPhoneNMTitle() throws Exception {
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(driver, lblPhoneNumberTitle);
		return sActValue;
	}
	public String getEmailTitle() throws Exception {
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(driver, lblEmailTitle);
		return sActValue;
	}
	public String getMenuItemTitle() throws Exception {
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(driver, lblMenuItemTitle);
		return sActValue;
	}
	
	public String getNavBarModuleName() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(driver, lnkNavBarModuleName);
		return sActValue;
	}
	
	//Get Summary Details
	public String getPhoneNMSummary() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(driver, lblPhoneNumberSummary);
		return sActValue;
	}
	public String getNumberFieldSummary() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(driver, lblNumberFieldSummary);
		return sActValue;
	}
	public String getEmailSummary() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(driver, lblEmailSummary);
		return sActValue;
	}
	public String getMenuItemSummary() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(driver, lblMenuItemSummary);
		return sActValue;
	}
	public String getEYNumberSummary() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(driver, lblEnterYourNMSummary);
		return sActValue;
	}
	
	
	//Detail View 
	public String getAssignedToDTView() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(driver, lblAssignedToDetailView);
		return sActValue;
	}
	public String getPhoneNMDTView() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(driver, lblPhoneNumberDetailView);
		return sActValue;
	}
	public String getNumberFieldDTView() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(driver, lblNumberFieldDetailView);
		return sActValue;
	}
	public String getEmailDTView() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(driver, lblEmailDetailView);
		return sActValue;
	}
	public String getMenuListDTView() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(driver, lblMenuItemDetailView);
		return sActValue;
	}
	public String getEYVDTView() throws Exception{
		String sActValue="";
		sActValue = UtilityCustomFunctions.getText(driver, lblEYPNDetailView);
		return sActValue;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}