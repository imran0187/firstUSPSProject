package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import pages.BusinessPrice;
import pages.CreateLabelAddBookPage;
import pages.FindUSPSlocation;
import pages.InternationalPage;
import pages.LookUpZip;
import pages.MailandSlipPage;
import pages.PostalStoreStamp;
import pages.SignInPage;
import pages.SignUpPage;
import pages.TrakingPage;

public class TestBase extends WebDriver {
	public static SignUpPage signupPage;
	public static SignInPage signinpage;
	public static TrakingPage trakingpage;
	public static MailandSlipPage mailandslipPage;
	public static LookUpZip lookupZIP;
	public static FindUSPSlocation finduspsLOCATION;
	public static PostalStoreStamp postalstoreSTAMP;
	public static BusinessPrice businessPRICE;
	public static InternationalPage internationalPAGE;
	public static CreateLabelAddBookPage createlabeladdbookPAGE;
	
	@BeforeClass
	public void testSetup () {
				setWebDriver("crome");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.usps.com/");
		
		signupPage = PageFactory.initElements(driver, SignUpPage.class);
		signinpage = PageFactory.initElements(driver, SignInPage.class);
		trakingpage = PageFactory.initElements(driver, TrakingPage.class);
		mailandslipPage = PageFactory.initElements(driver, MailandSlipPage.class);
		lookupZIP = PageFactory.initElements(driver, LookUpZip.class);
		finduspsLOCATION = PageFactory.initElements(driver, FindUSPSlocation.class);
		postalstoreSTAMP = PageFactory.initElements(driver, PostalStoreStamp.class);
		businessPRICE = PageFactory.initElements(driver, BusinessPrice.class);
		internationalPAGE = PageFactory.initElements(driver, InternationalPage.class);
		createlabeladdbookPAGE = PageFactory.initElements(driver, CreateLabelAddBookPage.class);
	}

}
