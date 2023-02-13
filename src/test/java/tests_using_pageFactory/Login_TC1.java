package tests_using_pageFactory;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.Dashboard;
import pageFactory.HomePage;
import pageFactory.LoginPage;
import utilities.DriverFactory;

public class Login_TC1 {


    @Test
    public void testToolsQA() throws InterruptedException {

        WebDriver driver = DriverFactory.open("chrome");

        driver.get("https://demoqa.com/books");

        //Creating object of home page
        HomePage home = new HomePage(driver);

        //Creating object of Login page
        LoginPage login = new LoginPage(driver);

        //Creating object of Dashboard
        Dashboard dashboard = new Dashboard(driver);

        //Click on Login button
        home.clickLogin();

        //Enter username & password
        login.enterUsername("test97");
        login.enterPassword("Test@1297");

        //Click on login button
        login.clickLogin();
        Thread.sleep(3000);


        //Capture the page heading and print on console
        System.out.println("The page heading is --- " +dashboard.getHeading());

        //Click on Logout button
        dashboard.clickLogout();

        //Close browser instance
        driver.quit();
    }
}
