package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class BusinessPrice extends PageBase {
	@FindBy(linkText = "Business")
	public WebElement clickBusiness;

	@FindBy(linkText = "Calculate a Business Price")
	public WebElement clickCalculateBusPrice;

	@FindBy(id = "ctl00_ContentPlaceHolder1_DropDownListLetter")
	public WebElement selecLattertItem;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ImageButtonStartOver")
	public WebElement clickStartOver;

	@FindBy(linkText = "Single Piece")
	public WebElement clickSinglePiece;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl05_TextBoxWeight")
	public WebElement enterWaight;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl05_HyperLinkCalculateZone")
	public WebElement determineZipPair;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl05_TextBoxZoneOriginZIPCode")
	public WebElement enterOriginZip;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl05_TextBoxZoneDestinationZIPCode")
	public WebElement enterDestiZip;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl05_Image4")
	public WebElement calCulate;

	@FindBy(xpath = ".//*[@id='ctl00_ContentPlaceHolder1_ctl05_LabelZone']")
	public WebElement varifyAlertText;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl05_ImageButtonZoneClose")
	public WebElement clickCloseWindow;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl05_GridViewElements_ctl02_NumberOf1")
	public WebElement enterNumOfPice;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl05_Image1")
	public WebElement calculateTwo;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl05_LabelTotal")
	public WebElement visibleText;

	@FindBy(id = "ctl00_Image6")
	public WebElement homePageButton;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl05_LabelError")
	public WebElement negativeGreetingGreaterNum;

	@FindBy(id = "ctl00_ContentPlaceHolder1_ctl05_LabelError")
	public WebElement negativeGreetingInvalidWaight;

}
