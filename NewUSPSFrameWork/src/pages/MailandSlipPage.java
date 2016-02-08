package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class MailandSlipPage extends PageBase {
	@FindBy (linkText = "Mail & Ship")
	public WebElement clickMailShip;
	
	@FindBy (linkText ="Calculate a Price")
	public WebElement clickCalculatePrice;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_DropDownListCountry")
	public WebElement SelectDestination;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_TextBoxContentValue")
	public WebElement EnterValue;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_TextBoxShippingDate")
	public WebElement EnterDate;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_DropDownListShippingTime")
	public WebElement SelectTime;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_CheckBoxNonNegotiableDocument")
	public WebElement ContentCheckBox;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_ImageButtonCarouselNext")
	public WebElement ClickMore;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_ImageButtonCarouselPrevious")
	public WebElement ClickLess;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_RepeaterCarousel_ctl04_ImageCarousel" )
	public WebElement ClickLargeEnvelope;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_ImageButtonBack" )
	public WebElement backButton;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_RadioButtonPackage" ) 
	public WebElement clickPackage ;
	
	@FindBy ( id="ctl00_ContentPlaceHolder1_RadioButtonMetric" )
	public WebElement clickMatric ;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_TextBoxKilograms"  )
	public WebElement EnterWaight ;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_ImageButtonContinue")
	public WebElement ClickContinue;
	
	@FindBy (id="ctl00_ContentPlaceHolder1_CheckBoxDisplayAllOptions")
	public WebElement displayAll;
	
	@FindBy (id="radiobutton_5_XX")
	public WebElement firstClassPackageInternational;
	
	@FindBy (xpath=".//*[@id='ctl00_ContentPlaceHolder1_PanelDetailDescription']/div")
	public WebElement assertGreeting;
	
	
	
	
	
	
	
	
	
	
	

}
