package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class BuyStampsTest extends TestBase {
	@Test
	public void stampFromPostalStore() {
		signinpage.signInLink.click();
		signinpage.userNameField.sendKeys("imran0187");
		signinpage.userPasswordField.sendKeys("Samira.janu86");
		signinpage.signInButton.click();

		postalstoreSTAMP.clickPostalStore.click();
		postalstoreSTAMP.clickStamps.click();
		postalstoreSTAMP.clickSeeAll.click();
		List<WebElement> totalStamps = driver.findElements(By.tagName("img"));
		if (totalStamps.size() <= 100) {
			postalstoreSTAMP.clickToAddStamp.click();

		}
		System.out.println("The total number of image are "
				+ totalStamps.size());

		Select dropList = new Select(postalstoreSTAMP.selectFormat);
		dropList.selectByValue("678704");
		postalstoreSTAMP.inputQuantity.clear();
		postalstoreSTAMP.inputQuantity.sendKeys("3");
		postalstoreSTAMP.clickAddToCart.click();
		postalstoreSTAMP.putUpdatedNumber.clear();
		postalstoreSTAMP.putUpdatedNumber.sendKeys("1");
		postalstoreSTAMP.clickUpdate.click();
		postalstoreSTAMP.putCouponCode.sendKeys("asdf");
		postalstoreSTAMP.clickApplyCoupon.click();
		Assert.assertEquals(postalstoreSTAMP.couponGreeting.getText(),
				"We're sorry, this coupon cannot be applied at this time.");
		postalstoreSTAMP.clickCheckOut.click();
		postalstoreSTAMP.clickCheckOut.click();
		postalstoreSTAMP.clickShipToAddress.click();
		Assert.assertEquals(postalstoreSTAMP.creditGreetingsAssert.getText(),
				"Use a credit card");

	}

}
