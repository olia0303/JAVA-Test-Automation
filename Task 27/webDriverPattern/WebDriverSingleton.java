package mailRu.helpers.webDriverPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverSingleton {

	private WebDriverSingleton() {
	}

	public static WebDriver getDriver(String driverType) {
		if ("chrome".equals(driverType)) {
			return new ChromeDriver();
		}
		return new FirefoxDriver();
	}
}
