package testBase.Android;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.model.Media;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import pageObjects.Android.NavigatetoResponse;
import testBase.Browser.BaseClass;
import utilities.ExtentReportManager;
public class BaseTest extends ExtentReportManager {
public AndroidDriver driver;
public AppiumDriverLocalService service;
public ResourceBundle rb;
public static SoftAssert sAssertinFn;
protected static File file;
Logger logger = LogManager.getLogger(this.getClass());
 @BeforeClass	
 public void configureAppium() throws MalformedURLException, InterruptedException {
	//AppiumDriverLocalService service = AppiumServiceBuilder().withAppiumJS(new File)
	 service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//sudha//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
			.withIPAddress("127.0.0.1").usingPort(4723).build();
	service.start();
	DesiredCapabilities cap = new DesiredCapabilities();
	ChromeOptions cOptions = new ChromeOptions();
	UiAutomator2Options options = new UiAutomator2Options();
//	options.setDeviceName("emulator-5554");
//	options.setDeviceName("db48f8d9");

	options.setDeviceName("emulator-5554");
	
	options.setPlatformVersion("11.0");
	options.setPlatformName("Android");
	options.noReset();
	options.withBrowserName("Chrome");
	options.autoGrantPermissions();
	
	Map<String, Object> prefs = new HashMap<String, Object>();
	prefs.put("autofill.profile_enabled", false);
	prefs.put("profile.default_content_setting_values.media_stream_mic", 1); 
	prefs.put("profile.default_content_setting_values.media_stream_camera", 1);
	prefs.put("profile.default_content_setting_values.geolocation",1); 
	prefs.put("profile.default_content_setting_values.notifications",1);
	
	cOptions.setExperimentalOption("prefs", prefs);
	cap.setCapability(ChromeOptions.CAPABILITY, cOptions);
	
	options.merge(cap);
	
	driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 
	logger = LogManager.getLogger(this.getClass());
//	
	/*
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//driver.findElement(By.xpath(" //textarea[@id='APjFqb']")).sendKeys(Keys.ENTER);
	*/
	System.out.println("Inside BaseTest BeforeClass");
 }
 public void testname(String testname, String name) {
		test = extent.createTest(testname);
		node = test.createNode(name);
		extent.attachReporter(sparkReporter);
	}
 

	
	public String randomeString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return (generatedString);
	}

	public String randomeNumber() {
		String generatedString2 = RandomStringUtils.randomNumeric(10);
		return (generatedString2);
	}
	
	public String randomAlphaNumeric() {
		String st = RandomStringUtils.randomAlphabetic(4);
		String num = RandomStringUtils.randomNumeric(3);
		
		return (st+"@"+num);
	}
	
	public void NavigatetoResponse(String strBuildName,AndroidDriver driver) throws Exception {
		logger.info("Navigation started");
		//driver.close();
		//driver = new ChromeDriver();
		NavigatetoResponse obj = new NavigatetoResponse(driver);
		driver.get("https://rthree.live/");
//		driver.get("https://rbot.live/");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		obj.setEmailId("rbot.live@gmail.com");
		obj.setPassword("12345678");
		logger.info("Login details Entered");
		obj.clickSubmit();
		logger.info("Chat bot Logged In");
		Thread.sleep(15000);
		logger.info("Hard wait for 15 secs");
		obj.clickClearAll();
		logger.info("clear all button clicked on listbox");
		obj.setBuildName(strBuildName);
		logger.info("Build Name entered in List Box");
		Thread.sleep(3000);
		logger.info("Waited for 3 secs");
		obj.KeyEnterBuildName();
		logger.info("Enter Key applied on ListBox");
		Thread.sleep(1000);
		logger.info("Hard Wait for 1 sec");
		obj.clickSideBarBldBtn();
		logger.info("clicked side bar Build button once");
		Thread.sleep(1000);
		logger.info("Hard Wait for 1 sec");
		/*
		obj.clickSideBarBldBtn();
		logger.info("clicked side bar Build button twice");
		
		Thread.sleep(1000);
		
		logger.info("Hard Wait for 1 sec");
		*/
		obj.clickSideBarResult();
		logger.info("clicked side bar Result");
		obj.clickSideItemResp();
		logger.info("Side Item Response clicked");
		obj.clickRefreshResponse();
		logger.info("clicked refresh Response");
		obj.clickRefreshResponse();
		logger.info("clicked refresh Response Again");
		Thread.sleep(3000);
		obj.clickFirstResponse();
		logger.info("Clicked first Response");
	}
	
	
	public void freport(String dec, String status,ExtentTest node) throws IOException, InterruptedException {
		Media img = null;
		String filepath = "";
		
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;
		System.err.println(number);
		try {
		String date = new SimpleDateFormat("dd-MMM-yy").format(new Date());
		String date1 = new SimpleDateFormat("HH.mm").format(new Date());
		filepath= "./reports/Screenshots/"+date+"/"+ date1 +"_"+ number + ".jpg";
		Thread.sleep(1000);		
		file = new File(filepath);
		
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		FileUtils.copyFile(takesScreenshot.getScreenshotAs(OutputType.FILE),
					file);
			
//		img = MediaEntityBuilder.createScreenCaptureFromPath(System.getProperty("user.dir")+"/reports/Screenshots/"+date+"/"+date1+"_"+number+".jpg").build();
		img = MediaEntityBuilder.createScreenCaptureFromPath("./../Screenshots/"+date+"/"+date1+"_"+number+".jpg").build();
		
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		if(status.equalsIgnoreCase("pass")) {
			System.err.println("Before node Pass");
			node.pass(dec, img);

		}else if (status.equalsIgnoreCase("fail")) {
			System.err.println("Before node Fail");
			node.fail(dec, img);
			System.err.println("After node Fail");
		}
		}

// public void tearDown() {
//	 driver.quit();
//     service.stop();
// }
}