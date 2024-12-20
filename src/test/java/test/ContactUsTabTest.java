package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.RetryAnalyzer;
import pages.ContactUsTab;

public class ContactUsTabTest extends BaseTest {
	
	public void initialTest() {
		ContactUsTab aut = new ContactUsTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> aut.clickContactUsBtn());
	}
	
	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_ContactUs_Button_Click_TC_001() {
		ContactUsTab aut = new ContactUsTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> aut.clickContactUsBtn());
		Assert.assertEquals(driver.getTitle(), "Contact Us - Pursuit Software");
	}
	
	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_Form_TC_002() {
		ContactUsTab aut = new ContactUsTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> aut.sendEmail());
		interact.executeWithDelay(() -> aut.sendName());
		interact.executeWithDelay(() -> aut.sendPhoneNumber());
		interact.executeWithDelay(() -> aut.sendTextAreaMesage());
		interact.executeWithDelay(() -> aut.clickSendBtn());
	}
	
	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_JOIN_US_Button_click_TC_003() {
		ContactUsTab aut = new ContactUsTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> aut.clickJoinUsBtn());
	}
	
	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_SMS_OUTREACH_Button_click_TC_004() {
		ContactUsTab aut = new ContactUsTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> aut.clickSmsOutreachBtn());
	}
	
	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_SMS_OUTREACH_functionality_click_TC_005() {
		ContactUsTab aut = new ContactUsTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> aut.clickSmsOutreachBtn());
		interact.executeWithDelay(() -> aut.sendSmsOutReachName());
		interact.executeWithDelay(() -> aut.sendSmsOutReachEmail());
		interact.executeWithDelay(() -> aut.sendSmsOutReachPhoneNumber());
		interact.executeWithDelay(() -> aut.clickSmsOutReachOption());
		interact.executeWithDelay(() -> aut.chooseSmsOutReachOption());
		interact.executeWithDelay(() -> aut.clickSmsOutReachSendBtn());
	}
	
	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_LINKEDIN_Button_click_TC_006() {
		ContactUsTab aut = new ContactUsTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> aut.clickLinkedInBtn());
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
}
