package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.PageBase;

public class PostalStoreStamp extends PageBase{
	@FindBy (linkText = "Postal Store")
	public WebElement clickPostalStore;
	
	@FindBy (linkText = "Stamps")
	public WebElement clickStamps;
	
	@FindBy (xpath = ".//*[@id='category-landing']/div[1]/div/a[5]/span")
	public WebElement clickSeeAll;
	
	@FindBy (xpath = ".//*[@id='category-landing']/div[2]/article[4]/a/div[1]/img")
	public WebElement clickToAddStamp;
	
	@FindBy (tagName = "img")
	public WebElement totalStamps;
	
	@FindBy (id="uspsSkuSelector")
	public WebElement selectFormat;
	
	@FindBy (id="sQuantity")
	public WebElement inputQuantity;
	
	@FindBy ( id="addToCartBtn")
	public WebElement clickAddToCart;
	
	@FindBy (id="atg_store_widget_enterSubmit_0")
	public WebElement putUpdatedNumber;
	
	@FindBy (id="atg_store_update" )
	public WebElement clickUpdate;
	
	@FindBy (id="atg_store_promotionCodeInput")
	public WebElement putCouponCode;
	
	@FindBy (id="atg_store_applyCoupon")
	public WebElement clickApplyCoupon;
	
	@FindBy ( id="atg_store_formValidationError")
	public WebElement couponGreeting;
	
	@FindBy (id="atg_store_checkout")
	public WebElement clickCheckOut;

	@FindBy (name="/atg/commerce/order/purchase/ShippingGroupFormHandler.moveToBilling")
	public WebElement clickShipToAddress;
	
	@FindBy (xpath=".//*[@id='payment-options']/dt/label")
	public WebElement creditGreetingsAssert;
	
}
