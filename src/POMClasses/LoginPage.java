package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "username")
    WebElement usernameTextField1;
	
	@FindBy(name = "pwd")
    WebElement passwordTextField;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginButton;
	
	public WebElement getUsernameTextField1() { 
	return usernameTextField1;
	}
    
    public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getPasswordTextField() {
    	return passwordTextField;
}
	

	public void loginAction(String username, String password) {
	        usernameTextField1.sendKeys(username);
	        passwordTextField.sendKeys(password);
	        loginButton.click();
		
	}

	
}