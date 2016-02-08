package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class SignInPage extends PageBase{
	@FindBy (id = "anchor-login")
	public WebElement signInLink ; 
	
	@FindBy(id="userName")
	public WebElement userNameField;
	
	@FindBy(id="password")
	public WebElement userPasswordField;
	
	@FindBy(id="sign-in-button")
	public WebElement signInButton;
	
	@FindBy(linkText = "Sign Out")
	public WebElement signOutButton;
	
	@FindBy (xpath = ".//*[@id='single-col-msg']")
	public WebElement signOutGreetings;
	
	

}
