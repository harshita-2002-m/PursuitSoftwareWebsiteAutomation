package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.RetryAnalyzer;
import pages.ServicesTab;

public class ServicesTabTest extends BaseTest {
	
	public void initialTest() {
		ServicesTab aut = new ServicesTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> aut.HoverServicesBtn());
		interact.executeWithDelay(() -> aut.clickServicesBtn());
	}
	
	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_Services_Button_Click_TC_001() {
		ServicesTab aut = new ServicesTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> aut.HoverServicesBtn());
		interact.executeWithDelay(() -> aut.clickServicesBtn());
		Assert.assertEquals(driver.getTitle(), "Services - Pursuit Software");
	}
	
	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_PRODUCT_ENGINEERING_Button_Click_TC_002() {
		ServicesTab aut = new ServicesTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> aut.clickProductEngineeringBtn());
		Assert.assertEquals(driver.getTitle(), "Product Engineering - Pursuit Software");
	}
	
	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_CLOUD_Button_Click_TC_003() {
		ServicesTab aut = new ServicesTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> aut.HoverServicesBtn());
		interact.executeWithDelay(() -> aut.clickCloudBtn());
		Assert.assertEquals(driver.getTitle(), "Cloud - Pursuit Software");
	}
	
	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_STRATEGIC_CONSULTING_Button_Click_TC_004() {
		ServicesTab aut = new ServicesTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> aut.HoverServicesBtn());
		interact.executeWithDelay(() -> aut.clickStrategicConsultingBtn());
		Assert.assertEquals(driver.getTitle(), "Strategic Consulting - Pursuit Software");
	}
	
	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_LearnMore_PRODUCT_ENGINEERING_Button_Click_TC_005() {
		ServicesTab aut = new ServicesTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> aut.clickLearnMoreProductEngineering());
		Assert.assertEquals(driver.getTitle(), "Product Engineering - Pursuit Software");
	}
	
	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_LearnMore_CLOUD_Button_Click_TC_006() {
		ServicesTab aut = new ServicesTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> aut.clickLearnMoreCloud());
		Assert.assertEquals(driver.getTitle(), "Cloud - Pursuit Software");
	}
	
	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_LearnMore_STRATEGIC_CONSULTING_Button_Click_TC_007() {
		ServicesTab aut = new ServicesTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> aut.clickLearnMoreStrategicConsulting());
		Assert.assertEquals(driver.getTitle(), "Strategic Consulting - Pursuit Software");
	}
	
	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_CONTACT_US_Button_Click_TC_008() {
		ServicesTab aut = new ServicesTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> aut.clickFirstContactUsBtn());
		Assert.assertEquals(driver.getTitle(), "Contact Us - Pursuit Software");
		driver.navigate().back();
		interact.executeWithDelay(() -> aut.clickSecondContactUsBtn());
		Assert.assertEquals(driver.getTitle(), "Contact Us - Pursuit Software");
	}
	
	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_JOIN_US_Button_Click_TC_009() {
		ServicesTab aut = new ServicesTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> aut.clickJoinUsBtn());
		Assert.assertEquals(driver.getTitle(), "Join Us - Pursuit Software");
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
}
