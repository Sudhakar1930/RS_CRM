package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import pageObjects.Android.IndvControls;
import pageObjects.Android.SectionControlsPage;
import testBase.Android.NewBase;

public class TestBrowser extends NewBase{

		
		@BeforeTest
		public void testName() {
			test = extent.createTest("AppiumBrowser");
		}
		@Test
		public void OpenBrowser() throws Exception {
			node = test.createNode("SFI Mobile Form");
			Adriver.get("https://rthree.live/showform?formid=220136&nurams=bot1");
		
			IndvControls IndvObj = new IndvControls(Adriver);
			SectionControlsPage SecObj = new SectionControlsPage(Adriver);
			
		}
	}

