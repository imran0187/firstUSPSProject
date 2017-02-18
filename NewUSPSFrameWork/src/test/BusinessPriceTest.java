package test;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class BusinessPriceTest extends TestBase {
	@Test(priority = 1)
	public void businessPriceCalculation() throws InterruptedException {
		businessPRICE.clickBusiness.click();
		businessPRICE.clickCalculateBusPrice.click();
		Select item = new Select(businessPRICE.selecLattertItem);
		item.selectByValue("3");
		businessPRICE.clickStartOver.click();
		Select itemAgain = new Select(businessPRICE.selecLattertItem);
		itemAgain.selectByValue("2");
		businessPRICE.clickSinglePiece.click();
		businessPRICE.enterWaight.sendKeys("2");
		businessPRICE.determineZipPair.click();
		businessPRICE.enterOriginZip.sendKeys("11432");
		businessPRICE.enterDestiZip.sendKeys("11435");
		businessPRICE.calCulate.click();
		Thread.sleep(1000);
		Assert.assertEquals(businessPRICE.varifyAlertText.getText(),
				"Zone is Local");
		businessPRICE.clickCloseWindow.click();
		businessPRICE.enterNumOfPice.sendKeys("10");
		businessPRICE.calculateTwo.click();
		Assert.assertEquals(businessPRICE.visibleText.getText(), "");

	}

	@Test(priority = 2)
	public void negativeBusinessPriceCalculation() throws InterruptedException {
		businessPRICE.homePageButton.click();
		Thread.sleep(2000);
		businessPRICE.clickBusiness.click();
		businessPRICE.clickCalculateBusPrice.click();
		Select item = new Select(businessPRICE.selecLattertItem);
		item.selectByValue("3");
		businessPRICE.clickStartOver.click();
		Select itemAgain = new Select(businessPRICE.selecLattertItem);
		itemAgain.selectByValue("2");
		businessPRICE.clickSinglePiece.click();
		businessPRICE.enterWaight.sendKeys("-2");
		businessPRICE.calculateTwo.click();
		Thread.sleep(1000);
		Assert.assertEquals(businessPRICE.negativeGreetingInvalidWaight.getText(),
				"An invalid weight was entered.");
		businessPRICE.enterWaight.clear();
		businessPRICE.enterWaight.sendKeys("2");
		businessPRICE.calculateTwo.click();
		businessPRICE.enterWaight.clear();
		businessPRICE.enterWaight.sendKeys("-2");
		businessPRICE.calculateTwo.click();
		Thread.sleep(1000);
		Assert.assertEquals(businessPRICE.negativeGreetingGreaterNum.getText(),
				"The entered weight must be greater than 0 pounds");

	}

}
