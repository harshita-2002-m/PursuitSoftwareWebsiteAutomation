package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Interactions;
import utils.ServicesTabLocators;

public class ServicesTab {
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	ServicesTabLocators locator;
    Interactions interact;
	
	public ServicesTab(WebDriver driver) {
		if (driver == null) {
            throw new IllegalArgumentException("Driver must be set");
        }
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.action = new Actions(driver);
        this.locator = new ServicesTabLocators();
        this.interact = new Interactions(driver);
	}
	
	public void HoverServicesBtn() {
		
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locator.ServicesBtn));
		
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
	}
	
	public void clickServicesBtn() {
		interact.clickElement(locator.ServicesBtn);
	}
	
	public void clickProductEngineeringBtn() {
		interact.clickElement(locator.PRODUCT_ENGINEERING);
	}
	
	public void clickCloudBtn() {
		interact.clickElement(locator.CLOUD);
	}
	
	public void clickStrategicConsultingBtn() {
		interact.clickElement(locator.STRATEGIC_CONSULTING);
	}
	
	public void clickLearnMoreProductEngineering() {
		interact.clickElement(locator.LearnMore_PRODUCT_ENGINEERING);
	}
	
	public void clickLearnMoreCloud() {
		interact.clickElement(locator.LearnMore_CLOUD);
	}
	
	public void clickLearnMoreStrategicConsulting() {
		interact.clickElement(locator.LearnMore_STRATEGIC_CONSULTING);
	}
	
	public void clickFirstContactUsBtn() {
		interact.clickElement(locator.first_CONTACT_US);
	}
	
	public void clickSecondContactUsBtn() {
		interact.clickElement(locator.second_CONTACT_US);
	}
	
	public void clickJoinUsBtn() {
		interact.clickElement(locator.JOIN_US);
	}

}
