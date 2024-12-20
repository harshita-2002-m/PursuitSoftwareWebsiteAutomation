package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Interactions;
import utils.AboutUsTabLocators;

public class AboutUsTab {
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	AboutUsTabLocators locator;
    Interactions interact;
    
    public AboutUsTab(WebDriver driver) {
		if (driver == null) {
            throw new IllegalArgumentException("Driver must be set");
        }
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.action = new Actions(driver);
        this.locator = new AboutUsTabLocators();
        this.interact = new Interactions(driver);
	}
    
    public void clickAboutUsTabBtn() {
		interact.clickElement(locator.AboutUsBtn);
	}
    
    public void searchValidation() {
    	interact.sendingKeys(locator.SearchBox, "Privacy setting");
    	WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locator.SearchBox));
    	ele.sendKeys(Keys.ENTER);
    }
    
    public void clickFirstJoinUsBtn() {
		interact.clickElement(locator.first_JOIN_US);
	}
    
    public void clickSecondJoinUsBtn() {
		interact.clickElement(locator.second_JOIN_US);
	}
    
    public void scrollDown() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,250)", "");
	}
    
    public void clickContactUsBtn() {
		interact.clickElement(locator.CONTACT_US);
	}
    
    public void clickCookiePolicyBtn() {
    	interact.clickElement(locator.COOKIE_POLICY);
    }
    
    public void clickTermsAndConditionsBtn() {
    	interact.clickElement(locator.TERMS_AND_CONDITIONS);
    }
    
    public void clickPrivacyPolicyBtn() {
    	interact.clickElement(locator.PRIVACY_POLICY);
    }
    
    public void clickLinkedInIconBtn() {
    	interact.clickElement(locator.LINKED_IN_ICON);
    }
    
    public void clickContactUsIconBtn() {
    	interact.clickElement(locator.CONTACT_US_ICON);
    }
    
}
