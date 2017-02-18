package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class CreateLabelAddBookPage extends PageBase {
	
	@FindBy (linkText ="Preferences")
	public WebElement preferancesButton;
	
	@FindBy (linkText ="Shipping History")
	public WebElement shipHistoryButton;
	
	@FindBy (linkText="Address Book")
	public WebElement addBookButton;
	
	@FindBy (id="tFName")
	public WebElement firstNameField;
	
	@FindBy (id="tLName")
	public WebElement lastNameField;
	
	@FindBy (id="defaultPhone0")
	public WebElement setDefaultNumBox;;
	
	@FindBy (id="tPhone0")
	public WebElement tPhoneField;
	
	@FindBy (id="returnAddr0")
	public WebElement setDefAddBox;
	
	@FindBy (id="tAddress0")
	public WebElement addressField;
	
	@FindBy (id="tApt0")
	public WebElement aptNumField;
	
	@FindBy (id="tCity0")
	public WebElement cityField;
	
	@FindBy (id ="tStateBox0")
	public WebElement selectState;
	
	@FindBy (id="tZip0")
	public WebElement zipField;
	
	@FindBy (id="defaultEmail0")
	public WebElement defEmailBox;
	
	@FindBy (id="tEmail0")
	public WebElement emailField;
	
	@FindBy (id="saveContactBtn")
	public WebElement saveButton;
	
	@FindBy (id="checkAddress0")
	public WebElement checkAddButton;
	
	@FindBy (id= "address0")
	public WebElement chooseFoundAddress;
	
	@FindBy (id= "submitAMS")
	public WebElement useSelAddress;
	
	@FindBy (id = "contactModifyContinueBtn")
	public WebElement continueAlertButton;
	
	@FindBy (xpath = ".//*[@id='ContactAction']/div[1]/h2")
	public WebElement addBookEnptyGreeting;
	
	@FindBy (id="address-contacts-list-table")
	public WebElement verifyAddressGreeting;
	
	@FindBy (id="row_157681756")
	public WebElement verifyAddressGreetingTwo;
	
	@FindBy (id= "error-box")
	public WebElement errorBoxGreeting;
	
	@FindBy (id= "btn-open-contact-to-notBatch")
	public WebElement useAddBookButton;
	
	@FindBy (id= "contact_157644179")
	public WebElement selectAddBox;
	
	@FindBy (id="btn-select")
	public WebElement usethisAddButton;
	
	@FindBy ( id="AddContact")
	public WebElement addContactButton;

}
