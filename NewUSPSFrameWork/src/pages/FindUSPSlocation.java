package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class FindUSPSlocation extends PageBase{
	@FindBy (linkText = "Find USPS Locations")
	public WebElement clickFinduspsLocation;
	
	@FindBy (id="locationType")
	public WebElement clickLocationList;
	
	@FindBy (id="tCityStateZip")
	public WebElement typeCityorZip;
	
	@FindBy (id="sWithin")
	public WebElement selectWithinMiles;
	
	@FindBy ( id="bSearch" )
	public WebElement clickSearchButton;
	
	@FindBy (xpath = ".//*[@id='search-results']/div[3]/div[2]/div/div/div[1]/span[2]")
	public WebElement assertionGreeting;
	
	

}
