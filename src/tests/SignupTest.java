package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.SignupPage;

public class SignupTest {
	
	 private WebDriver driver;
	    private SignupPage signupPage;

	    @BeforeClass
	    public void setup() {
	    	WebDriver driver=new ChromeDriver();    
	        driver.manage().window().maximize();
	        driver.get("https://www.demoblaze.com/");
	        signupPage = new SignupPage(driver);
	    }

	    @Test
	    public void testSignUp() {
	        signupPage.openSignUpForm();
	        signupPage.enterUsername("Ziya");
	        signupPage.enterPassword("Ziya@1000");
	        signupPage.clickSignUp();

	        // Example assertion to verify successful signup message
	        Assert.assertTrue(driver.switchTo().alert().getText().contains("Sign up successful"));
	    }

	    @AfterClass
	    public void tearDown() {
	        driver.quit();
	    }
	}

