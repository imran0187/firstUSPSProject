package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class SignUpPage extends PageBase{
	@FindBy (id = "anchor-login")
	public WebElement signUpLink ; 
	
	@FindBy (id = "sign-up-button")
	public WebElement signUpButton;
	
	@FindBy (id ="tUserName")
	public WebElement checkIdField;
	
	@FindBy (id="a-checkname")
	public WebElement checkThisNameButton;
	
	
	
	
	
	

}
