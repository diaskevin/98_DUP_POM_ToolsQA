package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	//This method returns a WebDriver object
		public static WebDriver open(String BrowserType) {
			if(BrowserType.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "D:\\02_Kevin\\qa\\Selenium\\geckodriver\\geckodriver.exe");
				return new FirefoxDriver();

			}
			else if (BrowserType.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\02_Kevin\\qa\\Selenium\\chromedriver\\chromedriver.exe");
			return new ChromeDriver();	
		
			}
			else {
				System.setProperty("webdriver.gecko.driver", "D:\\02_Kevin\\qa\\Selenium\\chromedriver\\chromedriver.exe");
				return new FirefoxDriver();
			}
			
	
		}
}