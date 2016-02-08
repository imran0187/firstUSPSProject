package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class TrakingPage extends PageBase{
	@FindBy (id="quick-tools--input")
	public WebElement tRakingField;
	
	@FindBy (xpath =".//*[@id='quick-tools--form-trackconfirm']/div/input[2]")
	public WebElement tRakingButton;
	
	@FindBy (xpath = ".//*[@id='results-multi']/div[1]/div/div[3]/div[1]/h3")
	public WebElement tRAKINGGreeting;
}
