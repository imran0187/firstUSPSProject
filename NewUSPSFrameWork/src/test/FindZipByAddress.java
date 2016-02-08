package test;



import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class FindZipByAddress extends TestBase{
	@Test
	public void  byAddress () {
		mailandslipPage.clickMailShip.click();
		lookupZIP.clickLookUpZip.click();
		lookupZIP.putCompanyName.sendKeys("HiHi");
		lookupZIP.putAddress.sendKeys("87-36 165th st");
		lookupZIP.putAptNum.sendKeys("3");
		lookupZIP.putCity.sendKeys("jamaica");
		Select droplist = new Select(lookupZIP.selectState) ;
		droplist.selectByValue("NY");
		lookupZIP.clickFindButton.click();
		Assert.assertEquals(lookupZIP.actualGreeting.getText(), "11432");
		
	}

}
