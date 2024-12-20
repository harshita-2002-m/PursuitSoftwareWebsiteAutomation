package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.RetryAnalyzer;
import pages.BlogsAndInsightsTab;

public class BlogsAndInsightsTest extends BaseTest {
	public void initialTest() {
		BlogsAndInsightsTab aut = new BlogsAndInsightsTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> aut.clickBlogsAndInsightsBtn());
	}
	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_BlogsAndInsights_Button_Click_TC_001() {
		BlogsAndInsightsTab aut = new BlogsAndInsightsTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> aut.clickBlogsAndInsightsBtn());
		Assert.assertEquals(driver.getTitle(), "Blogs & Insights - Pursuit Software");
	}
	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_ReadMoreAboutUs_Button_Click_TC_002() {
		BlogsAndInsightsTab aut = new BlogsAndInsightsTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> aut.clickReadMoreAboutUsBtn());
		Assert.assertEquals(driver.getTitle(), "About Us - Pursuit Software");
	}
	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_ContactUs_Button_Click_TC_003() {
		BlogsAndInsightsTab aut = new BlogsAndInsightsTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> aut.clickContactUsBtn());
		Assert.assertEquals(driver.getTitle(), "Contact Us - Pursuit Software");
	}
	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_Page_2_Button_Click_TC_004() {
		BlogsAndInsightsTab aut = new BlogsAndInsightsTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> aut.clickPage2Btn());
	}
	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_Blog_1_Button_Click_TC_005() {
		BlogsAndInsightsTab aut = new BlogsAndInsightsTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();

		interact.executeWithDelay(() -> aut.clickBlog1());
	}
	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_Blog_2_Button_Click_TC_006() {
		BlogsAndInsightsTab aut = new BlogsAndInsightsTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();

		interact.executeWithDelay(() -> aut.clickBlog2());
	}
	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_Blog_3_Button_Click_TC_007() {
		BlogsAndInsightsTab aut = new BlogsAndInsightsTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();

		interact.executeWithDelay(() -> aut.clickBlog3());
	}
	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_Blog_4_Button_Click_TC_008() {
		BlogsAndInsightsTab aut = new BlogsAndInsightsTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();

		interact.executeWithDelay(() -> aut.clickPage2Btn());
		interact.executeWithDelay(() -> aut.clickBlog4());
	}
	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_Blog_4_Button_Click_TC_009() {
		BlogsAndInsightsTab aut = new BlogsAndInsightsTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();

		interact.executeWithDelay(() -> aut.clickPage2Btn());
		interact.executeWithDelay(() -> aut.clickBlog5());
	}
	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_Blog_4_Button_Click_TC_010() {
		BlogsAndInsightsTab aut = new BlogsAndInsightsTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();

		interact.executeWithDelay(() -> aut.clickPage2Btn());
		interact.executeWithDelay(() -> aut.clickBlog6());
	}
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
