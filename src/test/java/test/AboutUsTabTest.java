package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.RetryAnalyzer;
import pages.AboutUsTab;

public class AboutUsTabTest extends BaseTest {
	
	public void initialTest() {
		AboutUsTab aut = new AboutUsTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> aut.clickAboutUsTabBtn());
	}
	
	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_About_Us_Button_Click_TC_001() {
		AboutUsTab aut = new AboutUsTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> aut.clickAboutUsTabBtn());
		Assert.assertEquals(driver.getTitle(), "About Us - Pursuit Software");
	}
	
	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_Search_feature_TC_002() {
		initialTest();
		AboutUsTab aut = new AboutUsTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> aut.searchValidation());
	}
	
	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_first_JOIN_US_button_click_TC_003() {
		initialTest();
		AboutUsTab aut = new AboutUsTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> aut.clickFirstJoinUsBtn());
	}
	
	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_second_JOIN_US_button_click_TC_003() {
		initialTest();
		AboutUsTab aut = new AboutUsTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> aut.clickSecondJoinUsBtn());
	}
	
	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void Verify_Nav_bar_content_change_on_scroll_down_TC_005() {
		initialTest();
		AboutUsTab aut = new AboutUsTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> aut.scrollDown());
	}
	
	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_CONTACT_US_button_click_TC_006() {
		initialTest();
		AboutUsTab aut = new AboutUsTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> aut.clickContactUsBtn());
	}
	
	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_COOKIE_POLICY_button_click_TC_007() {
		initialTest();
		AboutUsTab aut = new AboutUsTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> aut.clickCookiePolicyBtn());
	}
	
	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_TERMS_AND_CONDITIONS_button_click_TC_008() {
		initialTest();
		AboutUsTab aut = new AboutUsTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> aut.clickTermsAndConditionsBtn());
	}
	
	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_PRIVACY_POLICY_button_click_TC_009() {
		initialTest();
		AboutUsTab aut = new AboutUsTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> aut.clickPrivacyPolicyBtn());
	}
	
	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_LINKED_IN_ICON_button_click_TC_010() {
		initialTest();
		AboutUsTab aut = new AboutUsTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> aut.clickLinkedInIconBtn());
	}
	
	@Test(priority = 11, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_CONTACT_US_ICON_button_click_TC_011() {
		initialTest();
		AboutUsTab aut = new AboutUsTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> aut.clickContactUsIconBtn());
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
}
