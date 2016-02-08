package test;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class TestTwoLogIn extends TestBase {
	@Test
	public void signInTest () {
		signinpage.signInLink.click();
		signinpage.userNameField.sendKeys("imran0187");
		signinpage.userPasswordField.sendKeys("Samira.janu86");
		signinpage.signInButton.click();
		signinpage.signInLink.click();
		signinpage.signOutButton.click();
		Assert.assertEquals(signinpage.signOutGreetings.getText(),
				"You are now signed out.");
		
		
		
	}

}
