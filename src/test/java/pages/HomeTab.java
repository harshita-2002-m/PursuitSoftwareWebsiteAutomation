package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Interactions;
import utils.HomeTabLocators;

public class HomeTab {
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	HomeTabLocators locator;
    Interactions interact;
	
	public HomeTab(WebDriver driver) {
		if (driver == null) {
            throw new IllegalArgumentException("Driver must be set");
        }
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.action = new Actions(driver);
        this.locator = new HomeTabLocators();
        this.interact = new Interactions(driver);
	}
	
	public void clickHomeTabBtn() {
		interact.clickElement(locator.HomeTabBtn);
	}
	
	public void clickImageSlider() {
		interact.clickElement(locator.LeftImageSlider);
	}
	
	public void clickBottomImageSlider() {
		interact.clickElement(locator.LeftImageSlider);
	}
	
	public void clickWeCanHelpYourBusinessBtn() {
		interact.clickElement(locator.WE_CAN_HELP_YOUR_BUSINESS);
	}
	
	public void clickMoreAboutUs() {
		interact.clickElement(locator.MORE_ABOUT_US);
	}
	
	public void clickGetInTouch() {
		interact.clickElement(locator.GET_IN_TOUCH);
	}
	
	public void clickViewAllServices() {
		interact.clickElement(locator.VIEW_ALL_SERVICES);
	}
	
	public void clickAreYouReadyToStart() {
		interact.clickElement(locator.ARE_YOU_READY_TO_START);
	}
	
	public void clickAboutUs() {
		interact.clickElement(locator.ABOUT_US);
	}
	
	public void clickAvailableJobs() {
		interact.clickElement(locator.AVAILABLE_JOBS);
	}
	
	public void clickContactUs() {
		interact.clickElement(locator.CONTACT_US);
	}
	
	public void clickImageSliderGetInTouch() {
		interact.clickElement(locator.LeftImageSlider);
		interact.clickElement(locator.Image_Slider_GET_IN_TOUCH);
	}
	
	public void clickImagSliderFindOutMoreAboutUs() {
		interact.clickElement(locator.RightImageSlider);
		interact.clickElement(locator.Image_Slider_FIND_OUT_MORE_ABOUT_US);
	}
}
