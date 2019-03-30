package mailRu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends MainPage {
	@FindBy(xpath = ".//input[@id=\"mailbox:login\"] ")
	private WebElement loginField;

	@FindBy(xpath = ".//input[@id=\"mailbox:password\"] ")
	private WebElement passwordField;

	@FindBy(xpath = "//*[@id=\"mailbox:submit\"]/input ")
	private WebElement buttonEnter;

	@FindBy(xpath = "//*[@id=\"PH_logoutLink\"]")
	private WebElement logout;

	@FindBy(xpath = "//*[@id='mailbox:error']")
	private WebElement logoutError;

	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void enterLoginAndPassword(String login, String password) {
		loginField.clear();
		loginField.sendKeys(login);
		passwordField.clear();
		passwordField.sendKeys(password);

	}

	public void clickButtonEnter() {
		buttonEnter.click();
	}

	public boolean logoutLinkPresents() {
		return fluentWait.until(ExpectedConditions.visibilityOf(logout)).isDisplayed();
	}

	public boolean logoutLinkErrorPresents() {
		return fluentWait.until(ExpectedConditions.visibilityOf(logoutError)).isDisplayed();
	}

	public void clickLogout() {
		logout.click();
	}

	@Override
	public void checkPage() {
		assert loginField.isDisplayed();
		assert passwordField.isDisplayed();

	}

}
