package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.RetryAnalyzer;
import pages.HomeTab;

public class HomeTabTest extends BaseTest {
	
	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void Home_UI_landing_Page_HomeTab_TC_001() {
		HomeTab tab = new HomeTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(()-> tab.clickHomeTabBtn());
		Assert.assertEquals(driver.getTitle(), "Pursuit Software - In Pursuit of Excellence");
	}
	
	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void Image_Slider_HomeTab_TC_002() {
		HomeTab tab = new HomeTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(()-> tab.clickImageSlider());
		interact.executeWithDelay(()-> tab.clickImageSlider());
		interact.executeWithDelay(()-> tab.clickBottomImageSlider());
	}
	
	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void WE_CAN_HELP_YOUR_BUSINESS_HomeTab_TC_003() {
		HomeTab tab = new HomeTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(()-> tab.clickWeCanHelpYourBusinessBtn());
	}
	
	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void MORE_ABOUT_US_HomeTab_TC_004() {
		HomeTab tab = new HomeTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(()-> tab.clickMoreAboutUs());
	}
	
	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void GET_IN_TOUCH_HomeTab_TC_005() {
		HomeTab tab = new HomeTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(()-> tab.clickGetInTouch());
	}
	
	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void VIEW_ALL_SERVICES_HomeTab_TC_005() {
		HomeTab tab = new HomeTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(()-> tab.clickViewAllServices());
	}
	
	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void ARE_YOU_READY_TO_START_HomeTab_TC_005() {
		HomeTab tab = new HomeTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(()-> tab.clickAreYouReadyToStart());
	}
	
	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void ABOUT_US_HomeTab_TC_005() {
		HomeTab tab = new HomeTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(()-> tab.clickAboutUs());
	}
	
	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class)
	public void AVAILABLE_JOBS_HomeTab_TC_005() {
		HomeTab tab = new HomeTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(()-> tab.clickAvailableJobs());
	}
	
	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class)
	public void CONTACT_US_HomeTab_TC_005() {
		HomeTab tab = new HomeTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(()-> tab.clickContactUs());
	}
	
	@Test(priority = 11, retryAnalyzer = RetryAnalyzer.class)
	public void Image_Slider_GET_IN_TOUCH_HomeTab_TC_005() {
		HomeTab tab = new HomeTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(()-> tab.clickImageSliderGetInTouch());
	}
	
	@Test(priority = 12, retryAnalyzer = RetryAnalyzer.class)
	public void Image_Slider_FIND_OUT_MORE_ABOUT_US_HomeTab_TC_005() {
		HomeTab tab = new HomeTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(()-> tab.clickImagSliderFindOutMoreAboutUs());
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	
}
