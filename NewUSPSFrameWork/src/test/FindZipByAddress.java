package test;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class FindZipByAddress extends TestBase {
	@Test(priority = 1)
	public void  byInvalidAddress () {
		mailandslipPage.clickMailShip.click();
		lookupZIP.clickLookUpZip.click();
		lookupZIP.putCompanyName.sendKeys("HiHi");
		lookupZIP.putAddress.sendKeys("87-36 165th st");
		lookupZIP.putAptNum.sendKeys("3");
		lookupZIP.putCity.sendKeys("jamaica");
		Select droplist = new Select(lookupZIP.selectState) ;
		droplist.selectByValue("AL");
		lookupZIP.clickFindButton.click();
		Assert.assertEquals(lookupZIP.invalidZipGreeting.getText(),"Unfortunately, this address wasn't found.");
		
	}

	@Test(priority = 2)
	public void byvalidAddress() {
		lookupZIP.zipCodeByAddLink.click();
		lookupZIP.putCompanyName.sendKeys("HiHi");
		lookupZIP.putAddress.sendKeys("87-36 165th st");
		lookupZIP.putAptNum.sendKeys("3");
		lookupZIP.putCity.sendKeys("jamaica");
		Select droplist = new Select(lookupZIP.selectState);
		droplist.selectByValue("NY");
		lookupZIP.clickFindButton.click();
		Assert.assertEquals(lookupZIP.validZipGreeting.getText(),"11432");

	}

}
