package test;



import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class FindCityByZip extends TestBase{
	@Test
	public void cityByZip () {
		mailandslipPage.clickMailShip.click();
		lookupZIP.clickLookUpZip.click();
		lookupZIP.clickCitisByZip.click();
		lookupZIP.putZipCode.sendKeys("11432");
		lookupZIP.clickZipFindButton.click();
		Assert.assertEquals(lookupZIP.actualGreeting.getText(), "JAMAICA NY");
	}

}
