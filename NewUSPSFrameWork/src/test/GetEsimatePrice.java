package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class GetEsimatePrice extends TestBase{
	
	@Test
	public void calculatePrice () {
	
		mailandslipPage.clickMailShip.click();
		mailandslipPage.clickCalculatePrice.click();
		Select droplist = new Select(mailandslipPage.SelectDestination) ;
		droplist.selectByValue("10030");
		mailandslipPage.EnterValue.sendKeys("100");
		mailandslipPage.EnterDate.clear();
		mailandslipPage.EnterDate.sendKeys("2/7/2016");
		mailandslipPage.SelectTime.sendKeys("after 1:00 pm");
		mailandslipPage.ContentCheckBox.click();
		mailandslipPage.ContentCheckBox.click();
		mailandslipPage.ClickMore.click();
		//mailandslipPage.ClickLess.click();
		//mailandslipPage.ClickMore.click();
		mailandslipPage.ClickLargeEnvelope.click();
		mailandslipPage.backButton.click();
		mailandslipPage.clickPackage.click();
		mailandslipPage.clickMatric.click();
		mailandslipPage.EnterWaight.sendKeys("1");
		mailandslipPage.ClickContinue.click();
		mailandslipPage.displayAll.click();
		mailandslipPage.firstClassPackageInternational.click();
		Assert.assertEquals(mailandslipPage.assertGreeting.getText(), 
				"Total");

		
		
	}

}
