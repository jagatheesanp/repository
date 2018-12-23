package common;



import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import atu.testng.reports.ATUReports;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;

public class BrowserCommands 
{
public static WebDriver driver=null;

Logger log = Logger.getLogger(BrowserCommands.class);


	public void launchChromeBrowser() {		
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Chrome invoked successfully");
		ATUReports.setWebDriver(driver);
	}
		
	public void type(WebElement ele,String input) {
		ele.clear();
		ele.sendKeys(input);
		log.info("input typed successfully");
		ATUReports.add("Typed successfully", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
	}
	
	public void click(WebElement ele) {
		ele.click();
		log.info("Element clicked successfully");
		ATUReports.add("Clicked successfully", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
	}
	
	public void launchURL(String url) {
		driver.get(url);
		log.info("url launched successfully");
		ATUReports.add("Launched successfully", LogAs.PASSED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
	}

}
