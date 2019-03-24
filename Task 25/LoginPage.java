package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	private WebDriver driver;
	WebDriver driver1;
	private static final int LINK_PRESENSE_TIMEOUT = 10;
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
	@FindBy(xpath = "//div[@class=\"message-sent__title\"]")
	private WebElement messageSentTitle;
	@FindBy(xpath = "(.//a[@data-name=\"compose\"])[1]")
	private WebElement buttonWriteLetter;
	@FindBy(xpath = ".//textarea[@data-original-name=\"To\"]")
	private WebElement fieldWhomLetter;
	@FindBy(xpath = ".//input[@name='Subject']")
	private WebElement fieldSubjectLetter;
	@FindBy(xpath = "//*[@id=\"MailRuConfirm\"]/div/div[2]/form/div[2]/button[1]")
	private WebElement buttonSendContinue;
	@FindBy(xpath = "(.//div[@data-name='send'])[1]")
	private WebElement buttonSend;
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterLoginAndPass(String login, String password) {
		loginField.clear();
		loginField.sendKeys(login);
		passwordField.clear();
		passwordField.sendKeys(password);

	}
	
	public void waitLoadPage() {
		driver1 = new ChromeDriver();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.close();
	}
	public boolean sendButtonPresents() {
		return (new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT)).until(ExpectedConditions.visibilityOf(buttonWriteLetter))
				.isDisplayed();
	}
	public void clickButtonEnter() {
		buttonEnter.click();
	}
	public boolean logoutLinkPresents() {
		return (new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT)).until(ExpectedConditions.visibilityOf(logout))
				.isDisplayed();
	}

	public boolean logoutLinkErrorPresents() {
		return (new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT)).until(ExpectedConditions.visibilityOf(logoutError))
				.isDisplayed();
	}
   
	public void clickLogout() {
		logout.click();
	}

	public void clickContinue() {
		buttonSendContinue.click();
	}
    public void clickButtonWriteLetter() {
        buttonWriteLetter.click();
    }
	public void sendingMessageToUserGroup(String adress1, String adress2, String subject) {
		fieldWhomLetter.sendKeys(adress1, adress2);
		fieldSubjectLetter.sendKeys(subject);
		buttonSend.click();
	}

	public String getMessageSentTitle() {
		return messageSentTitle.getText();
	}

}
