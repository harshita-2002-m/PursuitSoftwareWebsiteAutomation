package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Interactions;
import utils.ContactUsTabLocators;

public class ContactUsTab {
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	ContactUsTabLocators locator;
    Interactions interact;
    
    public ContactUsTab(WebDriver driver) {
		if (driver == null) {
            throw new IllegalArgumentException("Driver must be set");
        }
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.action = new Actions(driver);
        this.locator = new ContactUsTabLocators();
        this.interact = new Interactions(driver);
	}
    
    public void clickContactUsBtn() {
    	interact.clickElement(locator.contactUsBtn);
    }
    
    public void sendEmail() {
    	interact.sendingKeys(locator.EMAIL_FIELD, "test@pursuitsoftware.com");
    }
    
    public void sendName() {
    	interact.sendingKeys(locator.NAME_FIELD, "Pursuit");
    }
    
    public void sendPhoneNumber() {
    	interact.sendingKeys(locator.PHONE_NUMBER_FIELD, "9954999191");
    }
    
    public void sendTextAreaMesage() {
    	interact.sendingKeys(locator.TEXTAREA_FIELD, "For testing purposes only");
    }
    
    public void clickSendBtn() {
    	interact.clickElement(locator.SEND_NOW);
    }
    
    public void clickJoinUsBtn() {
    	interact.clickElement(locator.JOIN_US);
    }
    
    public void clickSmsOutreachBtn() {
    	interact.clickElement(locator.SMS_OUTREACH);
    }
    
    public void sendSmsOutReachName() {
    	interact.sendingKeys(locator.SMS_OUTREACH_NAME_FIELD, "Test");
    }
    
    public void sendSmsOutReachEmail() {
    	interact.sendingKeys(locator.SMS_OUTREACH_EMAIL_FIELD, "pursuit@pursuitsoftware.com");
    }
    
    public void sendSmsOutReachPhoneNumber() {
    	interact.sendingKeys(locator.SMS_OUTREACH_PHONE_NUMBER_FIELD, "9890229291");
    }
    
    public void clickSmsOutReachOption() {
    	interact.clickElement(locator.SMS_OUTREACH_SMS_OPTION);
    }
    
    public void chooseSmsOutReachOption() {
    	interact.clickElement(locator.SMS_OPT_IN);
    }
    
    public void clickSmsOutReachSendBtn() {
    	interact.clickElement(locator.SEND);
    }
    
    public void clickLinkedInBtn() {
    	interact.clickElement(locator.LINKED_IN);
    }
}
