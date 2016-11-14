package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class TrakingPage extends PageBase{
	@FindBy (id="quick-tools--input")
	public WebElement tRakingField;
	
	@FindBy (xpath =".//*[@id='quick-tools--form-trackconfirm']/div/input[2]")
	public WebElement tRakingArrow;
	
	@FindBy (xpath = ".//*[@id='results-multi']/div[1]/div/div[3]/div[1]/h3")
	public WebElement tRAKINGGreeting;
	
	@FindBy (id="tLabels")
	public WebElement anothertRakingField;
	
	@FindBy (id="trackNumFindBtn" )
	public WebElement tRackItButton;
	
	@FindBy (xpath = ".//*[@id='results-multi']/div[1]/div/div[1]/div[2]/div[2]/ul/li/span")
	public WebElement iNVALIDtRAKINGGreeting;
	
	
	
}
