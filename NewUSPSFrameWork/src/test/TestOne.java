package test;

import org.testng.annotations.Test;

import base.TestBase;

public class TestOne extends TestBase {
	@Test
	public void signUpTest () {
		signupPage.signUpLink.click();
		signupPage.signUpButton.click();
		//signupPage.checkIdField.sendKeys("imranh0187");
		//signupPage.checkThisNameButton.click();
		
	}
	
	

}


