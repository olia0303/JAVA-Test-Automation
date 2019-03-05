package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = ".//input[@id=\"mailbox:login\"] ")
	private WebElement loginField;

	@FindBy(xpath = ".//input[@id=\"mailbox:password\"] ")
	private WebElement passwordField;

	@FindBy(xpath = "//*[@id=\"mailbox:submit\"]/input ")
	private WebElement loginButton;

	@FindBy(xpath = "//*[@id=\"PH_logoutLink\"]")
	private WebElement logout;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterData(String login, String password) {
		enterText(loginField, login);
		enterText(passwordField, password);
	}

	public void clickButton() {
		loginButton.click();
	}

	public boolean isLogoutPresents() {
		return logout.isDisplayed();
	}

	private void enterText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

}
