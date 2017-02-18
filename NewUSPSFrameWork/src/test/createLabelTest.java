package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class createLabelTest extends TestBase{
	@Test
	public void usingAddressBookCreateLabel () throws InterruptedException {
		internationalPAGE.internationalLink.click();
		internationalPAGE.interMailServLink.click();
		internationalPAGE.serviceDetailButton.click();
		internationalPAGE.shipOnlineLink.click();
		signinpage.userNameField.sendKeys("imran0187");
		signinpage.userPasswordField.sendKeys("Samira.janu86");
		signinpage.signInButton.click();
		Thread.sleep(2000);
		Assert.assertTrue(internationalPAGE.returnAddGreeting.getText()
				.contains("imran hossan"));
		createlabeladdbookPAGE.useAddBookButton.click();
		createlabeladdbookPAGE.selectAddBox.click();
		createlabeladdbookPAGE.usethisAddButton.click();

	}

}
