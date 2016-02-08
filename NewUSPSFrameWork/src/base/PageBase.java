package base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase extends WebDriver{
	public Alert handleAlert(){
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert pageAlert = driver.switchTo().alert();
		return pageAlert;
	}

}
