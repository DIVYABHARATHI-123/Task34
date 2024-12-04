package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	 @FindBy(id = "login2")
	    private WebElement loginLink;

	    @FindBy(id = "loginusername")
	    private WebElement usernameField;

	    @FindBy(id = "loginpassword")
	    private WebElement passwordField;

	    @FindBy(xpath = "//button[text()='Log in']")
	    private WebElement loginButton;

	    public LoginPage(WebDriver driver) {
	        super();
	    }

	    public void openLoginForm() {
	        loginLink.click();
	    }

	    public void enterUsername(String username) {
	        usernameField.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        passwordField.sendKeys(password);
	    }

	    public void clickLogin() {
	        loginButton.click();
	    }
	}


