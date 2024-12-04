package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage {

	
	@FindBy(id = "signin2")
    private WebElement signUpLink;

    @FindBy(id = "sign-username")
    private WebElement usernameField;

    @FindBy(id = "sign-password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[text()='Sign up']")
    private WebElement signUpButton;

    public SignupPage(WebDriver driver) {
        super();
    }

    public void openSignUpForm() {
        signUpLink.click();
    }

    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSignUp() {
        signUpButton.click();
    }
}

