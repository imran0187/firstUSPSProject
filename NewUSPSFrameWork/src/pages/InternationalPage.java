package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class InternationalPage extends PageBase{
	
	@FindBy (linkText = "International")
	public WebElement internationalLink;
	
	@FindBy (linkText = "International Mail Services")
	public WebElement interMailServLink;
	
	@FindBy (id="charlie--tab-link-1")
	public WebElement quickCompareButton ;
	
	@FindBy (linkText = "Show Next Columns")
	public WebElement rightArrowButton;

	@FindBy (xpath = ".//*[@id='scalable-table-2']/div/div[1]/table/tbody/tr[6]/td[9]")
	public WebElement naGreeting;

	@FindBy (id="alpha--tab-link-0")
	public WebElement serviceDetailButton;
	
	@FindBy (linkText="Ship Online")
	public WebElement shipOnlineLink;
	
	@FindBy (id="returnAddress")
	public WebElement returnAddGreeting;
	
	



}
