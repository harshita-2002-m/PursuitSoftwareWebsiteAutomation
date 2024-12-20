package test;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import helper.BaseTest;
import helper.Interactions;
import helper.RetryAnalyzer;
import pages.CareersTab;

public class CareersTabTest extends BaseTest{
	public void initialTest() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> cat.HoverCareersBtn());
		interact.executeWithDelay(() -> cat.currentOpening());

	}
	//Rashmi code
	@Test(priority = 1, retryAnalyzer = RetryAnalyzer.class)
	public void TC_001_Validate_Career_Button_Click_() {
		CareersTab ct= new CareersTab(driver);	
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ct.clickcareerTabbtn());
	}

	@Test(priority = 2, retryAnalyzer = RetryAnalyzer.class)
	public void TC_002_Validate_currentOpenings_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.pursuitsoftware.com/current-openings/");
	}
	
	@Test(priority = 3, retryAnalyzer = RetryAnalyzer.class)
	public void TC_003_Validate_joinus_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ct.HoverCareersBtn());
		interact.executeWithDelay(() -> ct.clickjoinus());
		Assert.assertEquals(driver.getTitle(), "Join Us - Pursuit Software");

	}
	@Test(priority = 4, retryAnalyzer = RetryAnalyzer.class)
	public void TC_004_Validate_joinus_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ct.HoverCareersBtn());
		interact.executeWithDelay(() -> ct.clickjoinus());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		interact.executeWithDelay(() -> ct.selectRole());
		interact.executeWithDelay(() -> ct.insertData());
		interact.executeWithDelay(() -> ct.chooseFileClick());
		interact.executeWithDelay(() -> ct.chooseFile());
		interact.executeWithDelay(() -> ct.submitbtn());

	}
	
	@Test(priority = 5, retryAnalyzer = RetryAnalyzer.class)
	public void TC_005_Validate_knowmoreaboutus_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ct.HoverCareersBtn());
		interact.executeWithDelay(() -> ct.clickjoinus());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickknowmoreaboutus());
		
//		Assert.assertEquals(driver.getTitle(), "Join Us - Pursuit Software");
	}
	

	@Test(priority = 6, retryAnalyzer = RetryAnalyzer.class)
	public void TC_006_Validate_moreaboutus_Button_Click_() {
		CareersTab ct= new CareersTab(driver);	
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ct.clickcareerTabbtn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickmoreaboutus());
	}
	
	@Test(priority = 7, retryAnalyzer = RetryAnalyzer.class)
	public void TC_007_Validate_getintouch_Button_Click_() {
		CareersTab ct= new CareersTab(driver);	
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ct.clickcareerTabbtn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickgetintouch());
	}
	
	@Test(priority = 8, retryAnalyzer = RetryAnalyzer.class)
	public void TC_008_Validate_videobtn_Button_Click_() {
		CareersTab ct= new CareersTab(driver);	
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ct.clickcareerTabbtn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickvideobtn());

		
	}
	
	@Test(priority = 9, retryAnalyzer = RetryAnalyzer.class)
	public void TC_009_Validate_contactus_Button_Click_() {
		CareersTab ct= new CareersTab(driver);	
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ct.clickcareerTabbtn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickcontactus());
	}
	
	@Test(priority = 10, retryAnalyzer = RetryAnalyzer.class)
	public void TC_010_Validate_contactuss_Button_Click_() {
		CareersTab ct= new CareersTab(driver);	
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ct.clickcareerTabbtn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickcontactuss());

	}
	
	@Test(priority = 11, retryAnalyzer = RetryAnalyzer.class)
	public void TC_011_Validate_more_Button_Click_() {
		CareersTab ct= new CareersTab(driver);	
		Interactions interact = new Interactions(driver);
		interact.executeWithDelay(() -> ct.clickcareerTabbtn());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickmorebtn());

	}
	
	@Test(priority = 12, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0012_Validate_viewourjobopenings_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> ct.clickviewourjobopenings());		
	}
	
	@Test(priority = 13, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0013_Validate_joinuscurrent_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickjoinuscurrent());
	}
	@Test(priority = 14, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0014_Validate_Qualityengineeringlead_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickQualityengineeringlead());	
	}
	
	@Test(priority = 15, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0015_Validate_QualityengineeringleadAN_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickQualityengineeringlead());
		interact.executeWithDelay(() -> ct.clickQualityengineeringleadAN());	
	}
	
	@Test(priority = 16, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0016_Validate_Qualityengineeringlead2_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickQualityengineeringlead2());
	}
	@Test(priority = 17, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0017_Validate_Qualityengineeringlead2AN_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickQualityengineeringlead2());
		interact.executeWithDelay(() -> ct.clickQualityengineeringlead2AN());

	}
	
	@Test(priority = 18, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0018_Validate_QualityengineeringleadSTE_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickQualityengineeringleadSTE());

	}
	
	@Test(priority = 19, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0019_Validate_QualityengineeringleadSTEAN_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickQualityengineeringleadSTE());
		interact.executeWithDelay(() -> ct.clickQualityengineeringleadSTEAN());

	}
	
	@Test(priority = 20, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0020_Validate_clickSeniorQEDataTesting_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickSeniorQEDataTesting());

	}
	
	@Test(priority = 21, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0021_Validate_clickSeniorQEDataTestingAN_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickSeniorQEDataTesting());
		interact.executeWithDelay(() -> ct.clickSeniorQEDataTestingAN());

	}
	
	@Test(priority = 22, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0022_Validate_QELead_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickQELead());

	}
	
	@Test(priority = 23, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0023_Validate_QELeadAN_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickQELead());
		interact.executeWithDelay(() -> ct.clickQELeadAN());

	}
	
	@Test(priority = 24, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0024_Validate_SAPSDFunctionalConsultant_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickSAPSDFunctionalConsultant());

	}
	
	@Test(priority = 25, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0025_Validate_SAPSDFunctionalConsultantAN_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickSAPSDFunctionalConsultant());
		interact.executeWithDelay(() -> ct.clickSAPSDFunctionalConsultantAN());


	}
	
	@Test(priority = 26, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0026_Validate_SeniorNet_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickSeniorNet());
	}
	
	@Test(priority = 27, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0027_Validate_SeniorNetAN_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickSeniorNet());
		interact.executeWithDelay(() -> ct.clickSeniorNetAN());
	}
	
	@Test(priority = 28, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0028_Validate_QELeadArchitectIndia_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickQELeadArchitectIndia());
	}
	
	@Test(priority = 29, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0029_Validate_QELeadArchitectIndiaAN_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickQELeadArchitectIndia());
		interact.executeWithDelay(() -> ct.clickQELeadArchitectIndiaAN());
	}
	
	@Test(priority = 30, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0030_Validate_PerformanceTesterIndia_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickPerformanceTesterIndia());
	}
	
	@Test(priority = 31, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0031_PerformanceTesterIndiaAN_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickPerformanceTesterIndia());
		interact.executeWithDelay(() -> ct.clickPerformanceTesterIndiaAN());
	}
	
	@Test(priority = 32, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0032_DataSciMLEngIndia_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickDataSciMLEngIndia());
	}
	
	@Test(priority = 33, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0033_DataSciMLEngIndiaAN_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickDataSciMLEngIndia());
		interact.executeWithDelay(() -> ct.clickDataSciMLEngIndiaAN());
	}
	
	@Test(priority = 34, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0034_clickSeniorQualityAutomationEngineer_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickSeniorQualityAutomationEngineer());
	}
	
	@Test(priority = 35, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0035_clickSeniorQualityAutomationEngineerAN_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickSeniorQualityAutomationEngineer());
		interact.executeWithDelay(() -> ct.clickSeniorQualityAutomationEngineerAN());
	}
	
	@Test(priority = 36, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0036_clickSeniorQualityEngineerIndia_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickSeniorQualityEngineerIndia());
	}
	
	@Test(priority = 37, retryAnalyzer = RetryAnalyzer.class)
	public void TC_0037_clickSeniorQualityEngineerIndiaAN_Button_Click_() {
		CareersTab ct= new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		System.out.println("Scrolling operation completed successfully.");
		interact.executeWithDelay(() -> ct.clickSeniorQualityEngineerIndia());
		interact.executeWithDelay(() -> ct.clickSeniorQualityEngineerIndiaAN());
	}
	//rashmi code
	
	@Test(priority = 38, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_Azure_Developer_India_TC_038() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.azureDeveloperIndia());

	}
	@Test(priority = 39, retryAnalyzer = RetryAnalyzer.class)
	public void Validate__Azure_Developer_India_ApplyNow_TC_039() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.azureDeveloperIndia());
		interact.executeWithDelay(() -> cat.azureDeveloperIndiaApplyNow());

	}
	@Test(priority = 40, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_Fluter_Developer_TC_040() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.fluterDeveloper());

	}
	@Test(priority = 41, retryAnalyzer = RetryAnalyzer.class)
	public void Validate__Fluter_Developer_India_ApplyNow_TC_041() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.fluterDeveloper());
		interact.executeWithDelay(() -> cat.fluterDeveloperApplyNow());

	}
	@Test(priority = 42, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_Performance_Engineer_India_TC_042() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.scrollDown());
		interact.executeWithDelay(() -> cat.performanceEngineering());

	}
	@Test(priority = 43, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_Performance_Engineer_India_ApplyNow_TC_043() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.scrollDown());
		interact.executeWithDelay(() -> cat.performanceEngineering());
		interact.executeWithDelay(() -> cat.performanceEngineeringApplyNow());

	}
	@Test(priority = 44, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_ToscaQa_TC_044() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.scrollDown());
		interact.executeWithDelay(() -> cat.toscaQA());

	}
	@Test(priority = 45, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_ToscaQa_ApplyNow_TC_045() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.scrollDown());
		interact.executeWithDelay(() -> cat.toscaQA());
		interact.executeWithDelay(() -> cat.toscaQaApplyNow());

	}
	@Test(priority = 46, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_QualityEngineer_TC_046() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.scrollDown());
		interact.executeWithDelay(() -> cat.qualityEngineeringLead());

	}
	@Test(priority =  47, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_QualityEngineer_ApplyNow_TC_047() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.scrollDown());
		interact.executeWithDelay(() -> cat.qualityEngineeringLead());
		interact.executeWithDelay(() -> cat.qualityEngineeringLeadApplyNow());
	}
	@Test(priority = 48, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_ItProjectManager_TC_048() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.scrollDown());
		interact.executeWithDelay(() -> cat.itProjectManager());

	}
	@Test(priority = 49, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_ItProjectManager_ApplyNow_TC_049() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.scrollDown());
		interact.executeWithDelay(() -> cat.itProjectManager());
		interact.executeWithDelay(() -> cat.itProjectManagerApplyNow());
	}
	@Test(priority = 50, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_SeniorQualityEngineer_TC_050() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.scrollDown());
		interact.executeWithDelay(() -> cat.seniorQualityEngineer());

	}
	@Test(priority = 51, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_SeniorQualityEngineer_ApplyNow_TC_051() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.scrollDown());
		interact.executeWithDelay(() -> cat.seniorQualityEngineer());
		interact.executeWithDelay(() -> cat.seniorQualityEngineerApplyNow());
	}
	@Test(priority = 52, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_QaLead_TC_052() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.scrollDown());
		interact.executeWithDelay(() -> cat.qeLead());

	}
	@Test(priority = 53, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_QELead_ApplyNow_TC_053() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.scrollDown());
		interact.executeWithDelay(() -> cat.qeLead());
		interact.executeWithDelay(() -> cat.qeLeadApplyNow());
	}
	@Test(priority = 54, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_BusinessIntelligence_TC_054() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.scrollDown());
		interact.executeWithDelay(() -> cat.businessIntelligence());

	}
	@Test(priority = 55, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_BusinessIntelligence_ApplyNow_TC_055() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.scrollDown());
		interact.executeWithDelay(() -> cat.businessIntelligence());
		interact.executeWithDelay(() -> cat.businessIntelligenceApplyNow());
	}
	@Test(priority = 56, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_SalseforceDeveloper_TC_056() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.scrollDown());
		interact.executeWithDelay(() -> cat.salseforceDeveloper());

	}
	@Test(priority = 57, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_SalseforceDeveloper_ApplyNow_TC_057() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.scrollDown());
		interact.executeWithDelay(() -> cat.salseforceDeveloper());
		interact.executeWithDelay(() -> cat.salseforceDeveloperApplyNow());
	}
	@Test(priority = 58, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_RdbmsApplicationDesiger_TC_058() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.scrollDown());
		interact.executeWithDelay(() -> cat.rdbmsApplicationDesiger());

	}
	@Test(priority = 59, retryAnalyzer = RetryAnalyzer.class)
	public void Validate_RdbmsApplicationDesiger_ApplyNow_TC_059() {
		CareersTab cat = new CareersTab(driver);
		Interactions interact = new Interactions(driver);
		initialTest();
		interact.executeWithDelay(() -> cat.scrollDown());
		interact.executeWithDelay(() -> cat.rdbmsApplicationDesiger());
		interact.executeWithDelay(() -> cat.rdbmsApplicationDesigerApplyNow());
	}
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
}
