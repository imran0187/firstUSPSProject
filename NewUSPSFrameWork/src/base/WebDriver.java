package base;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver {
	public static FirefoxDriver driver;
	public void setWebDriver(String browserType) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\imran\\Downloads\\geckodriver.exe");
		switch (browserType.toLowerCase()) {
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			driver = new FirefoxDriver();
		}
	}
		
	
	

}
