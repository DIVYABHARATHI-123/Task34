package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest {
	
	 private WebDriver driver;
	    private LoginPage loginPage;

	    @BeforeClass
	    public void main() {
	    	WebDriver driver=new ChromeDriver();    
	        driver.manage().window().maximize();
	        driver.get("https://www.demoblaze.com/");
	        loginPage = new LoginPage(driver);
	    }

	    @Test
	    public void testLogin() {
	        loginPage.openLoginForm();
	        loginPage.enterUsername("Ziya");
	        loginPage.enterPassword("Ziya@1000");
	        loginPage.clickLogin();

	        // Example assertion to verify successful login
	        Assert.assertTrue(driver.getPageSource().contains("Welcome testUser"));
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }
	}

