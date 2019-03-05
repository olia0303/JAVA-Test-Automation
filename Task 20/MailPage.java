package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailPage {
	WebDriver driver;
	@FindBy(xpath = "//a[@data-name='link' and " + "not(ancestor::div[contains(@style, 'display: none;')])]")
	private List<WebElement> listLetters;
	@FindBy(xpath = "(//div[@class='js-item-checkbox b-datalist__item__cbx'])[1]")
	private WebElement choosenCheckbox;
	@FindBy(xpath = "(//div[@class='b-checkbox__box'])[1]")
	private WebElement chooseAll;
	@FindBy(xpath = "(.//div[@class=\"js-item-checkbox b-datalist__item__cbx\"])[7]")
	private WebElement checkBoxLetter;
	@FindBy(xpath = "(//div[@data-name='spam'])[1]")
	private WebElement buttonSpam;
	@FindBy(xpath = "//*[@id=\"jsHtml\"]/body/div[1]/div[1]/div/span")
	private WebElement messageMoveOnSpam;
	@FindBy(xpath = "//*[@id=\"jsHtml\"]/body/div[1]/div[1]/div/span")
	private WebElement messageNoSpam;
	@FindBy(xpath = "//*[@id=\"b-toolbar__right\"]/div[3]/div/div[2]/div[3]/div")
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
	@FindBy(xpath = "//*[@id=\"MailRuConfirm\"]/div/div[2]/form/div[2]/button[1]")
	private WebElement buttonSendContinue;
	@FindBy(xpath = "(.//div[@data-name='send'])[1]")
	private WebElement buttonSend;
	@FindBy(xpath = "//a[@data-name='link' " + "and not(ancestor::div[contains(@style, 'display: none;')])]"
			+ "//div[contains(@class, 'b-flag_yes')]//b")
	private List<WebElement> listFlags;
	@FindBy(xpath = "(//div[contains(@class, 'b-dropdown_more')])[1]")
	private WebElement fieldMore;
	@FindBy(xpath = "//a[@data-name='flag_no']")
	private WebElement uncheckBox;

	public MailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickButtonSpam() {
		buttonSpam.click();
	}

	public void clickButtonNoSpam() {
		buttonNoSpam.click();
	}

	public void clickCheckbox() {
		choosenCheckbox.click();
	}

	public void moveToSpam() {
		clickCheckbox();
		clickButtonSpam();
	}

	public boolean letterMoveOnSpam() {
		return messageMoveOnSpam.isDisplayed();
	}

	public boolean LetterNoSpam() {
		return messageNoSpam.isDisplayed();
	}

	public void clickCheckBoxSpam() {
		checkBoxLetter.click();
	}

	public void extractingFromSpam() {
		spamFolder.click();
		clickCheckBoxSpam();
		clickButtonNoSpam();
	}

	public void openInboxFolder() {
		inboxFolder.click();
	}

	public void openSpamFolder() {
		spamFolder.click();
	}

	public void sendingMessageToUserGroup(String adressaty, String subject) {
		buttonWriteLetter.click();
		fieldWhomLetter.sendKeys(adressaty);
		fieldSubjectLetter.sendKeys(subject);
		buttonSend.click();
		buttonSendContinue.click();
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

}
	
