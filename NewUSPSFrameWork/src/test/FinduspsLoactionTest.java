package test;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import base.TestBase;

public class FinduspsLoactionTest extends TestBase{
	@Test
	public void uspsLocation () {
		mailandslipPage.clickMailShip.click();
		finduspsLOCATION.clickFinduspsLocation.click();
		Select droplist = new Select(finduspsLOCATION.clickLocationList) ;
		droplist.selectByValue("po");
		finduspsLOCATION.typeCityorZip.sendKeys("jamaica NY");
		Select droplistTwo = new Select(finduspsLOCATION.selectWithinMiles);
		droplistTwo.selectByValue("10");
		finduspsLOCATION.clickSearchButton.click();
		Assert.assertEquals(finduspsLOCATION.assertionGreeting.getText(), "10");
		
		
	}

}
