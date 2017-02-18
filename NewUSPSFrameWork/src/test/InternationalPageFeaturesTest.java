package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class InternationalPageFeaturesTest extends TestBase {

	@Test(priority = 1)
	public void internationalMailService() throws InterruptedException {
		internationalPAGE.internationalLink.click();
		internationalPAGE.interMailServLink.click();
		internationalPAGE.quickCompareButton.click();
		internationalPAGE.rightArrowButton.click();
		Assert.assertEquals(internationalPAGE.naGreeting.getText(), "n/a");
		internationalPAGE.serviceDetailButton.click();
		internationalPAGE.shipOnlineLink.click();
		signinpage.userNameField.sendKeys("imran0187");
		signinpage.userPasswordField.sendKeys("Samira.janu86");
		signinpage.signInButton.click();
		Thread.sleep(2000);
		Assert.assertTrue(internationalPAGE.returnAddGreeting.getText()
				.contains("imran hossan"));

	}
	
	@Test(priority = 2)
	public void invalidTestEmptyField () throws InterruptedException {
		createlabeladdbookPAGE.preferancesButton.click();
		Thread.sleep(2000);
		createlabeladdbookPAGE.shipHistoryButton.click();
		Thread.sleep(2000);
		createlabeladdbookPAGE.addBookButton.click();
		Assert.assertEquals(
				createlabeladdbookPAGE.addBookEnptyGreeting.getText(),
				"Your address book is empty. Add someone!");
		createlabeladdbookPAGE.firstNameField.sendKeys("");
		createlabeladdbookPAGE.lastNameField.sendKeys("");
		createlabeladdbookPAGE.setDefAddBox.click();
		createlabeladdbookPAGE.addressField.sendKeys("");
		createlabeladdbookPAGE.aptNumField.sendKeys("");
		createlabeladdbookPAGE.cityField.sendKeys("");
		createlabeladdbookPAGE.zipField.sendKeys("");
		createlabeladdbookPAGE.tPhoneField.sendKeys("");
		createlabeladdbookPAGE.saveButton.click();
		Assert.assertTrue(createlabeladdbookPAGE.errorBoxGreeting.getText()
				.contains("You did not enter"));
		
		
	}

	@Test(priority = 3)
	public void addAddressInEmptyAddBook() throws InterruptedException {
		
		createlabeladdbookPAGE.firstNameField.sendKeys("imran");
		createlabeladdbookPAGE.lastNameField.sendKeys("hossan");
		createlabeladdbookPAGE.setDefAddBox.click();
		createlabeladdbookPAGE.addressField.sendKeys("8736 165th street");
		createlabeladdbookPAGE.aptNumField.sendKeys("3");
		createlabeladdbookPAGE.cityField.sendKeys("jamaica");
		createlabeladdbookPAGE.zipField.sendKeys("11432");
		createlabeladdbookPAGE.tPhoneField.sendKeys("6462092962");
		// createlabeladdbookPAGE.selectState.click();
		Select StateList = new Select(createlabeladdbookPAGE.selectState);
		StateList.selectByValue("44");
		createlabeladdbookPAGE.emailField.sendKeys("imran0187@yahoo.com");
		createlabeladdbookPAGE.setDefaultNumBox.sendKeys("6462092962");
		createlabeladdbookPAGE.checkAddButton.click();
		createlabeladdbookPAGE.chooseFoundAddress.click();
		createlabeladdbookPAGE.useSelAddress.click();
		createlabeladdbookPAGE.saveButton.click();
		Thread.sleep(2000);
				createlabeladdbookPAGE.continueAlertButton.click();
	
		Thread.sleep(1000);
		Assert.assertTrue(createlabeladdbookPAGE.verifyAddressGreeting.getText()
				.contains("IMRAN"));

	}
	@Test(priority = 4)
	public void addAddressOnExistingAddBook () throws InterruptedException {
		createlabeladdbookPAGE.addContactButton.click();
		Thread.sleep(2000);
		createlabeladdbookPAGE.firstNameField.sendKeys("samira");
		createlabeladdbookPAGE.lastNameField.sendKeys("syed");
		createlabeladdbookPAGE.setDefAddBox.click();
		createlabeladdbookPAGE.addressField.sendKeys("8736 165th street");
		createlabeladdbookPAGE.aptNumField.sendKeys("3");
		createlabeladdbookPAGE.cityField.sendKeys("jamaica");
		createlabeladdbookPAGE.zipField.sendKeys("11432");
		createlabeladdbookPAGE.tPhoneField.sendKeys("6462092962");
		// createlabeladdbookPAGE.selectState.click();
		Select StateList = new Select(createlabeladdbookPAGE.selectState);
		StateList.selectByValue("44");
		createlabeladdbookPAGE.emailField.sendKeys("imran0187@yahoo.com");
		createlabeladdbookPAGE.setDefaultNumBox.sendKeys("6462092962");
		createlabeladdbookPAGE.checkAddButton.click();
		createlabeladdbookPAGE.chooseFoundAddress.click();
		createlabeladdbookPAGE.useSelAddress.click();
		createlabeladdbookPAGE.saveButton.click();
		//Thread.sleep(2000);
		createlabeladdbookPAGE.continueAlertButton.click();
		Thread.sleep(1000);
		Assert.assertTrue(createlabeladdbookPAGE.verifyAddressGreeting.getText()
				.contains("imran"));
	}

}
