package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class TestTwoLogIn extends TestBase {
	@Test(dataProvider = "USPS")
	public void invalidSignInEmptyPassField() {
		signinpage.signInLink.click();
		signinpage.userNameField.sendKeys("imran0187");
		signinpage.userPasswordField.sendKeys("");
		signinpage.signInButton.click();
		Assert.assertEquals(signinpage.passEmptyGreetings.getText(),
				"A password is required.");

	}

	@Test(priority = 2)
	public void invalidSignMinCharField() {
		signinpage.userNameField.clear();
		signinpage.userNameField.sendKeys("imran");
		signinpage.userPasswordField.sendKeys("imran");
		signinpage.signInButton.click();
		Assert.assertEquals(signinpage.minUserCharGreeting.getText(),
				"Your Username must be at least 6 characters long.");

	}

	@Test(priority = 3)
	public void invalidSignWrongPass() {

		signinpage.userNameField.clear();
		signinpage.userPasswordField.clear();
		signinpage.userNameField.sendKeys("imran0187");
		signinpage.userPasswordField.sendKeys("imranhossan");
		signinpage.signInButton.click();
		Assert.assertEquals(signinpage.invalidPassGreetings.getText(),
				"We do not recognize your username and/or password. Please try again.");

	}

	@Test(priority = 4)
	public void signInTest() {
		signinpage.userNameField.clear();
		signinpage.userPasswordField.clear();
		signinpage.userNameField.sendKeys("imran0187");
		signinpage.userPasswordField.sendKeys("Samira.janu86");
		signinpage.signInButton.click();
		signinpage.signInLink.click();
	//	signinpage.signOutButton.click();
	//	Assert.assertEquals(signinpage.signOutGreetings.getText(),
	//			"You are now signed out.");

	}

}
