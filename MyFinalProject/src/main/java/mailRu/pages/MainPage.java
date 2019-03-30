package mailRu.pages;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

abstract public class MainPage {
	protected WebDriver driver;
	protected Wait<WebDriver> fluentWait;

	abstract public void checkPage();

	public MainPage(WebDriver driver) {
		this.driver = driver;
		fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofMillis(500)).ignoring(NoSuchElementException.class);
	}
}
