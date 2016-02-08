package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class LookUpZip extends PageBase{
	@FindBy (linkText = "Look Up a ZIP Code")
	public WebElement clickLookUpZip;
	
	@FindBy (id="tCompany")
	public WebElement putCompanyName;
	
	@FindBy (id="tAddress")
	public WebElement putAddress;
	
	@FindBy (id="tApt")
	public WebElement putAptNum;
	
	@FindBy (id="tCity")
	public WebElement putCity;
	
	@FindBy (id="sState" )
	public WebElement selectState;
	
	@FindBy (id="lookupZipFindBtn")
	public WebElement clickFindButton;
	
	@FindBy (xpath = ".//*[@id='result-list']/ul/li/div/p[1]/span[4]")
	public WebElement actualGreeting;
	
	@FindBy(id="link-CitiesByZip" ) 
	public WebElement clickCitisByZip;
	
	@FindBy(id="tZip") 
	public WebElement putZipCode;
	
	@FindBy(id="lookupZipByCitiesBtn") 
	public WebElement clickZipFindButton;
	
	@FindBy(xpath = ".//*[@id='result-cities']/p[2]") 
	public WebElement actualZipGreeting;
}
