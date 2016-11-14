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
	
	@FindBy (id="error-list")
	public WebElement errorGreetingList;
	
	@FindBy (id="error-invalid-password")
	public WebElement passEmptyGreetings;
	
	@FindBy (id="error-min-username" )
	public WebElement minUserCharGreeting;
	
	@FindBy ( id="error-min-password" )
	public WebElement minPassCharGreeting;
	
	@FindBy (xpath=".//*[@id='actionerrors']/div/span")
	public WebElement invalidPassGreetings;
	
	

}
