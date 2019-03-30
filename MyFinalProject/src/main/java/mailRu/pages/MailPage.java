package mailRu.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MailPage extends MainPage {
	@FindBy(xpath = "//a[@data-name='link' and " + "not(ancestor::div[contains(@style, 'display: none;')])]")
	private List<WebElement> listLetters;
	@FindBy(xpath = "(//div[contains(@class,'checkbox__box') and ancestor::div[@id='b-letters']and not(ancestor::div[contains(@style, 'display: none;')])])")
	public List<WebElement> checkboxList;
	@FindBy(xpath = "(//div[@class='b-checkbox__box'])[1]")
	private WebElement chooseAll;
	@FindBy(xpath = ".//span[contains(text(),'в папку «Спам».')]")
	public WebElement addedToSpamAlert;
	@FindBy(xpath = ".//span[contains(text(),'в папку «Входящие»')]")
	public WebElement moveFromSpamToInboxAlert;
	@FindBy(xpath = "(.//div[@data-name=\"noSpam\"])[1]")
	private WebElement buttonNoSpam;
	@FindBy(xpath = "//div[@id='b-nav_folders']//span[text()='Входящие']")
	private WebElement inboxFolder;
	@FindBy(xpath = "//a[@href=\"/messages/spam/\"][1]")
	private WebElement spamFolder;
	@FindBy(xpath = ".//div[@class='message-sent__title']")
	private WebElement messageSentTitle;
	@FindBy(xpath = "//*[@id='b-toolbar__left']/div/div/div[2]/div/a")
	private WebElement buttonWriteLetter;
	@FindBy(xpath = "(.//*[@data-original-name='To'])[1]")
	private WebElement fieldWhomLetter;
	@FindBy(xpath = ".//input[@name='Subject']")
	private WebElement fieldSubjectLetter;
	@FindBy(xpath = "//button[@class=\"btn btn_stylish btn_main confirm-ok\"]" + "/span[text()=\"Продолжить\"]")
	private WebElement buttonSendContinue;
	@FindBy(xpath = "(.//div[@data-name='send'])[1]")
	private WebElement buttonSend;
	@FindBy(xpath = "//a[@data-name='link' " + "and not(ancestor::div[contains(@style, 'display: none;')])]"
			+ "//div[contains(@class, 'b-flag_yes')]//b")
	public List<WebElement> listFlags;
	@FindBy(xpath = "(//div[contains(@class, 'b-dropdown_more')])[1]")
	private WebElement fieldMore;
	@FindBy(xpath = "//a[@data-name='flag_no']")
	private WebElement uncheckBox;

	public MailPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickCheckbox(int index) {
		try {
			checkboxList.get(index).click();
		} catch (IndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
	}

	public void clickButtonNoSpam() {
		buttonNoSpam.click();
	}

	public boolean isNotSpamButtonPresent() {
		return fluentWait.until(ExpectedConditions.visibilityOf(buttonNoSpam)).isDisplayed();
	}

	public void extractingFromSpam(int index) {
		openSpamFolder();
		clickCheckbox(index);
		clickButtonNoSpam();
		fluentWait.until(ExpectedConditions.visibilityOf(moveFromSpamToInboxAlert));
	}

	public boolean isAddedToSpamAlertPresent() {
		return addedToSpamAlert.isDisplayed();
	}

	public boolean isMoveFromSpamAlertPresent() {
		return moveFromSpamToInboxAlert.isDisplayed();
	}

	public void clickButtonWriteLetter() {
		buttonWriteLetter.click();
	}

	public void openInboxFolder() {
		inboxFolder.click();
	}

	public void openSpamFolder() {
		spamFolder.click();
		fluentWait.until(ExpectedConditions.titleContains("Спам"));
	}

	public void sendingMessageToUserGroup(String emails, String topic) {
		fieldWhomLetter.clear();
		fieldWhomLetter.sendKeys(emails);
		fieldSubjectLetter.clear();
		fieldSubjectLetter.sendKeys(topic);

	}

	public void clickButtonSend() {
		buttonSend.click();
	}

	public boolean isButtonContinue() {
		return fluentWait.until(ExpectedConditions.visibilityOf(buttonSendContinue)).isDisplayed();
	}

	public void clickButtonContinue() {
		isButtonContinue();
		buttonSendContinue.click();
		fluentWait.until(ExpectedConditions.titleContains("Письмо отправлено"));
	}

	public String getMessageSentTitle() {
		return messageSentTitle.getText();
	}

	public List<WebElement> getListLetters() {
		return listLetters;
	}

	public void labelFlag(int count) {
		List<WebElement> messages = listLetters;
		for (int line = 0; line < count; line++) {
			(messages.get(line)).findElement(By.xpath(".//div[@data-act='flag']")).click();
		}
	}

	public void uncheckFlags() {
		chooseAll.click();
		fieldMore.click();
		uncheckBox.click();
	}

	public List<WebElement> getLabelFlag() {
		return listFlags;
	}

	@Override
	public void checkPage() {
		assert listLetters.get(0).isDisplayed();

	}

}
	
