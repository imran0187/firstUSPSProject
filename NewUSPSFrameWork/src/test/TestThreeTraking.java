package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TrakingPage;
import base.TestBase;

public class TestThreeTraking extends TestBase {
	@Test(priority = 2)
	public void TrakingPackagetest() {
		trakingpage.anothertRakingField.sendKeys("9400115901509758633275");
		trakingpage.tRackItButton.click();
		Assert.assertEquals(trakingpage.tRAKINGGreeting.getText(),
				"Product & Tracking Information");//
	}

	@Test(priority = 1)
	public void InvalidTrakingPackagetest() {
		trakingpage.tRakingField.sendKeys("9374889949084179357161");
		trakingpage.tRakingArrow.click();
		Assert.assertEquals(
				trakingpage.iNVALIDtRAKINGGreeting.getText(),
				"The Postal Service could not locate the tracking information for your request. Please verify your tracking number and try again later.");

	}

}
