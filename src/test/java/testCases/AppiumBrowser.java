package testCases;

import java.net.URL;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

import pageObjects.Browser.*;
import testBase.Android.BaseTest;
import testBase.Browser.BaseClass;

public class AppiumBrowser extends BaseClass{
	Logger	logger = LogManager.getLogger(this.getClass());
	@BeforeTest
	public void testName() {
		test = extent.createTest("AppiumBrowser");
	}
	@Test
	public void OpenBrowser() throws Exception {
		node = test.createNode("SFI Mobile Form");
		driver.get("https://rthree.live/showform?formid=289536&nurams=bot1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		IndvControls IndvObj = new IndvControls(driver);
		SectionControlsPage SecObj = new SectionControlsPage(driver);
		String sAgrMsg = SecObj.getAgreementMsg();
		WebElement eleAgrText= driver.findElement(By.xpath("//*[@id='agreement_txt']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eleAgrText);
		
		System.out.println("Agr text: " + sAgrMsg);
		
		System.out.println("Agr text: " + eleAgrText.getText());
	
		System.out.println("Agr text: " + eleAgrText.getAttribute("value"));
		String sactvalue = (String) js.executeScript("return arguments[0].value", eleAgrText);
		System.out.println("Agr text: " + sactvalue);
	}
}
