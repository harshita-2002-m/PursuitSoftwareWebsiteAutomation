package helper;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Interactions {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public Interactions(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void clickElement(Object target) {
		WebElement element;
		if(target instanceof By) {
			element = wait.until(ExpectedConditions.elementToBeClickable((By) target));
		} else if (target instanceof WebElement) {
			element = (WebElement) target;
		}else {
			throw new IllegalArgumentException("\"Invalid argument type. Must be By or WebElement.\"");
		}
	    
		elementClick(element);
	}
	
	
	private void elementClick(WebElement element) {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			element.click();
		} catch (ElementClickInterceptedException e) {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			System.out.println("Failed to click the element. Error: " + e.getMessage());
		}
	}
	
	public void switchToIframe(By locator) {
        WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        driver.switchTo().frame(iframe);
    }
		
	public WebElement visibilityEle(By locator) {
	    return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void sendingKeys(By locator, String keyValue) {
	    WebElement element = visibilityEle(locator);
	    //element.clear();
	    element.sendKeys(keyValue);
	}
	public void selectFromDropdown(By dropdownElement, By optionElement) {
        WebElement dropdown = wait.until(ExpectedConditions.visibilityOfElementLocated(dropdownElement));
        dropdown.click();
        WebElement option = wait.until(ExpectedConditions.elementToBeClickable(optionElement));
        option.click();
    }

	public void executeWithDelay(Runnable action) {
        try {
            Thread.sleep(500);
            action.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
	public String getTabTitle(By locator) {
		String tabTitle = driver.findElement(locator).getText();
		return tabTitle;
	}
	
}
