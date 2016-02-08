package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.TrakingPage;
import base.TestBase;

public class TestThreeTraking extends TestBase{
	@Test
	public void TrakingPackagetest () {
		trakingpage.tRakingField.sendKeys("9374889949084179357161");
		trakingpage.tRakingButton.click();
		Assert.assertEquals(trakingpage.tRAKINGGreeting.getText(), 
				"Product & Tracking Information");
	}

}
