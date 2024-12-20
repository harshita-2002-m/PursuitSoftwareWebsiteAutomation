//package helper;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.time.Duration;
//import java.util.Properties;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.annotations.BeforeMethod;
//
//public class BaseTest {
//	protected WebDriver driver;
//	protected WebDriverWait wait;
//    
//    private Properties properties = new Properties();
//    
//    private void loadProperties() {
//    	try(FileInputStream fileInput = new FileInputStream("C:\\Users\\VivekRajput\\Downloads\\pursuit_Software\\config.properties")){
//    		properties.load(fileInput);
//    	}catch(IOException e) {
//    		e.printStackTrace();
//    	}
//    }
//    
//    @BeforeMethod
//    public void setup() {
//    	driver = new ChromeDriver();
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//    	loadProperties();
//    	driver.get(properties.getProperty("URL"));
//    	driver.manage().window().maximize();
//    	wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//    }
//        
//}
//

package helper;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    private Properties properties = new Properties();

    // Load properties from the config file
    private void loadProperties() {
        try (FileInputStream fileInput = new FileInputStream("config.properties")) {
            properties.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Initialize WebDriver based on browser type using WebDriverManager
    private void initializeDriver() {
        String browser = properties.getProperty("browser", "edge").toLowerCase(); // Default to Chrome

        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup(); // Automatically sets up ChromeDriver
                ChromeOptions chromeOptions = new ChromeOptions(); // Create ChromeOptions instance
//                chromeOptions.addArguments("--headless"); // Optional: Run in headless mode
//                chromeOptions.addArguments("--disable-gpu"); // Optional: Disable GPU acceleration
//                chromeOptions.addArguments("--remote-allow-origins=*"); // Optional: Avoid CORS issues
                driver = new ChromeDriver(chromeOptions); // Use ChromeOptions
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup(); // Automatically sets up GeckoDriver
                driver = new FirefoxDriver();
                break;
            case "edge":
            default:
                WebDriverManager.edgedriver().setup(); // Automatically sets up EdgeDriver
                driver = new EdgeDriver();
                break;
        }
    }

    @BeforeMethod
    public void setup() {
        loadProperties();
        initializeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(properties.getProperty("url", "https://www.pursuitsoftware.com/")); // Default URL if not specified
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit(); // Ensure the driver is quit after each test
        }
    }
}