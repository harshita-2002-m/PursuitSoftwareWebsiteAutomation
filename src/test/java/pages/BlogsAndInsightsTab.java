package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Interactions;
import utils.BlogsAndInsightsTabLocators;

public class BlogsAndInsightsTab {
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	BlogsAndInsightsTabLocators locator;
    Interactions interact;
    
    public BlogsAndInsightsTab(WebDriver driver) {
		if (driver == null) {
            throw new IllegalArgumentException("Driver must be set");
        }
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        this.action = new Actions(driver);
        this.locator = new BlogsAndInsightsTabLocators();
        this.interact = new Interactions(driver);
	}
    
    public void clickBlogsAndInsightsBtn() {
		interact.clickElement(locator.BlogsAndInsightsBtn);
	}
    
    public void clickReadMoreAboutUsBtn() {
		interact.clickElement(locator.READ_MORE_ABOUT_US);
	}
    
    public void clickContactUsBtn() {
		interact.clickElement(locator.CONTACT_US);
	}
    
    public void clickPage2Btn() {
		interact.clickElement(locator.PAGE_2);
	}
    
    public void clickBlog1() {
		interact.clickElement(locator.BLOG_1);
	}
    
    public void clickBlog2() {
		interact.clickElement(locator.BLOG_2);
	}
    
    public void clickBlog3() {
		interact.clickElement(locator.BLOG_3);
	}
    
    public void clickBlog4() {
		interact.clickElement(locator.BLOG_4);
	}
    
    public void clickBlog5() {
		interact.clickElement(locator.BLOG_5);
	}
    
    public void clickBlog6() {
		interact.clickElement(locator.BLOG_6);
	}
    
}
