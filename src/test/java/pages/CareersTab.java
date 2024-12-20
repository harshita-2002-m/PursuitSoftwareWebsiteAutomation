package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Interactions;
import utils.CareersTabLocators;

public class CareersTab {
	WebDriver driver;
	WebDriverWait wait;
	Actions action;
	CareersTabLocators locator;
    Interactions interact;
    
    public CareersTab(WebDriver driver) {
		if (driver == null) {
            throw new IllegalArgumentException("Driver must be set");
        }
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        this.action = new Actions(driver);
        this.locator = new CareersTabLocators();
        this.interact = new Interactions(driver);
	}
public void HoverCareersBtn() {
		
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(locator.CareersBtn));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
	}
public void currentOpening() {
		interact.clickElement(locator.Current_OpeningBtn);

}
public void clickcareerTabbtn() {
		interact.clickElement(locator.CareerTab);
	}
public void selectRole() {
	interact.selectFromDropdown(locator.SelectRole, locator.LeadQualityEngineer);

}
public void insertData() {
	interact.sendingKeys(locator.YourName,"Vivek Rajput");
	interact.sendingKeys(locator.YourEmail,"VivekRajput123@gmail.com");
	interact.sendingKeys(locator.YourPN,"1234567899");
	interact.sendingKeys(locator.Description,"testing");

}
public void submitbtn() {
	interact.clickElement(locator.SubmitBtn);

}

public void chooseFile()  {
	Robot robot = null;
	try {
		robot = new Robot();
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	StringSelection filepath=new StringSelection("C:\\Users\\VivekRajput\\OneDrive - pursuit software development pvt. ltd\\Pictures\\Screenshots\\Screenshot 2024-09-20 042414.png");
	
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath,null);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    
}
public void chooseFileClick() {
	interact.clickElement(locator.ChooseFile);
}
public void scrollDown() {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,2000)", "");
}
//rashmicode
public void clickjoinus() {
	interact.clickElement(locator.joinus);
}

public void clickknowmoreaboutus() {
	interact.clickElement(locator.knowmoreaboutus);
}

public void clickmoreaboutus() {
	interact.clickElement(locator.moreaboutus);
}

public void clickgetintouch() {
	interact.clickElement(locator.getintouch);
}

public void clickvideobtn() {
	interact.clickElement(locator.videobtn);
}

public void clickcontactus() {
	interact.clickElement(locator.contactus);
}

public void clickcontactuss() {
	interact.clickElement(locator.contactuss);
}

public void clickmorebtn() {
	interact.clickElement(locator.morebtn);
}

public void clickviewourjobopenings() {
	interact.clickElement(locator.viewourjobopenings);
}

public void clickjoinuscurrent() {
	interact.clickElement(locator.joinuscurrent);
}

public void clickQualityengineeringlead() {
	interact.clickElement(locator.Qualityengineeringlead);
}
public void clickQualityengineeringleadAN() {
	interact.clickElement(locator.QualityengineeringleadAN);
}

public void clickQualityengineeringlead2() {
	interact.clickElement(locator.Qualityengineeringlead2);
}
public void clickQualityengineeringlead2AN() {
	interact.clickElement(locator.Qualityengineeringlead2AN);
}

public void clickQualityengineeringleadSTE() {
	interact.clickElement(locator.QualityengineeringleadSTE);
}
public void clickQualityengineeringleadSTEAN() {
	interact.clickElement(locator.QualityengineeringleadSTEAN);
}

public void clickSeniorQEDataTesting() {
	interact.clickElement(locator.SeniorQEDataTesting);
}
public void clickSeniorQEDataTestingAN() {
	interact.clickElement(locator.SeniorQEDataTestingAN);
}

public void clickQELead() {
	interact.clickElement(locator.QELead);
}
public void clickQELeadAN() {
	interact.clickElement(locator.QELeadAN);
}

public void clickSAPSDFunctionalConsultant() {
	interact.clickElement(locator.SAPSDFunctionalConsultant);
}
public void clickSAPSDFunctionalConsultantAN() {
	interact.clickElement(locator.SAPSDFunctionalConsultantAN);
}

public void clickSeniorNet() {
	interact.clickElement(locator.SeniorNet);
}
public void clickSeniorNetAN() {
	interact.clickElement(locator.SeniorNetAN);
}
public void clickQELeadArchitectIndia() {
	interact.clickElement(locator.QELeadArchitectIndia);
}
public void clickQELeadArchitectIndiaAN() {
	interact.clickElement(locator.QELeadArchitectIndiaAN);
}

public void clickPerformanceTesterIndia() {
	interact.clickElement(locator.PerformanceTesterIndia);
}
public void clickPerformanceTesterIndiaAN() {
	interact.clickElement(locator.PerformanceTesterIndiaAN);
}

public void clickDataSciMLEngIndia() {
	interact.clickElement(locator.DataSciMLEngIndia);
}
public void clickDataSciMLEngIndiaAN() {
	interact.clickElement(locator.DataSciMLEngIndiaAN);
}

public void clickSeniorQualityAutomationEngineer() {
	interact.clickElement(locator.SeniorQualityAutomationEngineer);
}
public void clickSeniorQualityAutomationEngineerAN() {
	interact.clickElement(locator.SeniorQualityAutomationEngineerAN);
}

public void clickSeniorQualityEngineerIndia() {
	interact.clickElement(locator.SeniorQualityEngineerIndia);
}
public void clickSeniorQualityEngineerIndiaAN() {
	interact.clickElement(locator.SeniorQualityEngineerIndiaAN);
}

//public void clickAzureDeveloperIndia() {
//	interact.clickElement(locator.AzureDeveloperIndia);
//}
//public void clickAzureDeveloperIndiaAN() {
//	interact.clickElement(locator.AzureDeveloperIndiaAN);
//}
//rashmi code end
public void azureDeveloperIndia() {
	interact.clickElement(locator.Azure_Developer_India);
}
public void azureDeveloperIndiaApplyNow() {
	interact.clickElement(locator.Azure_Developer_India_ApplyNowBtn);
}
public void azureDeveloperApplyNow() {
	interact.clickElement(locator.Fluter_Developer_ApplyNowBtn);
}
public void fluterDeveloper() {
	interact.clickElement(locator.Fluter_Developer_India);
}
public void fluterDeveloperApplyNow() {
	interact.clickElement(locator.Fluter_Developer_ApplyNowBtn);
}  
public void performanceEngineering() {
	interact.clickElement(locator.Performance_Endineer_India);
} 
public void performanceEngineeringApplyNow() {
	interact.clickElement(locator.Performance_Endineer_India_ApplyNowBtn);
} 
public void toscaQA() {
	interact.clickElement(locator.Tosca_Qa);
} 
public void toscaQaApplyNow() {
	interact.clickElement(locator.Tosca_Qa_ApplyNowBtn);
} 
public void qualityEngineeringLead() {
	interact.clickElement(locator.Quality_Engineering_Lead);
} 
public void qualityEngineeringLeadApplyNow() {
	interact.clickElement(locator.Quality_Enginnering_Lead_ApplyNowBtn);
} 
public void itProjectManager() {
	interact.clickElement(locator.IT_Project_Manager);
} 
public void itProjectManagerApplyNow() {
	interact.clickElement(locator.IT_Project_Manager_ApplyNowBtn);
} 
public void seniorQualityEngineer() {
	interact.clickElement(locator.Senior_Quality_Engineer);
} 
public void seniorQualityEngineerApplyNow() {
	interact.clickElement(locator.Senior_Quality_Engineer_ApplyNowBtn);
} 
public void qeLead() {
	interact.clickElement(locator. QE_Lead);
} 
public void qeLeadApplyNow() {
	interact.clickElement(locator.QE_Lead_ApplyNowBtn);
} 
public void businessIntelligence() {
	interact.clickElement(locator. Business_Intelligence);
} 
public void businessIntelligenceApplyNow() {
	interact.clickElement(locator. Business_Intelligence_ApplyNowBtn);
} 
public void salseforceDeveloper() {
	interact.clickElement(locator.Sr_Salseforce_Developer);
} 
public void salseforceDeveloperApplyNow() {
	interact.clickElement(locator. Sr_Salseforce_Developer_ApplyNowBtn);
} 
public void rdbmsApplicationDesiger() {
	interact.clickElement(locator.Rdbms_Application_Designer);
} 
public void rdbmsApplicationDesigerApplyNow() {
	interact.clickElement(locator.Rdbms_Application_Designer_ApplyNowBtn);
} 

}
