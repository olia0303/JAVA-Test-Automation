package steps;

import java.io.IOException;
import java.sql.SQLException;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.xml.sax.SAXException;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mailRu.Config;
import mailRu.helpers.facadePattern.SpamFacade;
import mailRu.helpers.parser.Arguments;
import mailRu.helpers.parser.RecipientsDataProvider;
import mailRu.pages.LoginPage;
import mailRu.pages.MailPage;

public class MailSteps extends Config {
	private LoginPage loginPage;
	private MailPage mailPage;
	private Arguments arguments;
	private SpamFacade spamFacade;
	private static final RecipientsDataProvider parser = new RecipientsDataProvider();
	private static final Logger logger = Logger.getLogger(MailSteps.class);

	public MailSteps()
			throws NumberFormatException, SQLException, ParserConfigurationException, IOException, SAXException {
		initDriver();
		driver.get(url);
		loginPage = new LoginPage(driver);
		loginPage.enterLoginAndPassword(login, password);
		loginPage.clickButtonEnter();
		Assert.assertTrue(loginPage.logoutLinkPresents());
		mailPage = new MailPage(driver);
		spamFacade = new SpamFacade(driver);
		arguments = parser.parse();
		logger.info("open page " + url + " and correct login.");
	}

	@Given("^I am on mail page$")
	public void loadMainPage() {
		mailPage.checkPage();
		logger.info("I am on mail page");
	}

	@When("^I move letter to spam$")
	public void moveLetterSpam() {
		int indexLetter = 0;
		spamFacade.moveToSpam(indexLetter);
		logger.info("I move letter to spam");
	}

	@When("^I open spam folder")
	public void openSpamFolder() {
		mailPage.openSpamFolder();
		logger.info("I open spam folder");
	}

	@When("^I extract the letter in spam")
	public void extractLetter() {
		int indexLetter = 0;
		mailPage.extractingFromSpam(indexLetter);
		logger.info("I extract the letter in spam");
	}

	@When("^I push button \"Send letter\"$")
	public void writeNewLetter() {
		mailPage.clickButtonWriteLetter();

	}

	@When("^I send message recipients$")
	public void sendingMessageRecipients() {
		String recipients = arguments.getRecipients();
		String subject = arguments.getSubject();
		mailPage.sendingMessageToUserGroup(recipients, subject);
		mailPage.clickButtonSend();
		mailPage.clickButtonContinue();
		logger.info("I send message recipients");
	}

	@When("^I mark three letters with flags$")
	public void checkLetter() {
		int numOfLabel = 3;
		mailPage.labelFlag(numOfLabel);
		logger.info("I mark three letters with flags");
	}

	@When("^I unchecked letters with flags$")
	public void uncheckLetter() {
		mailPage.uncheckFlags();
		logger.info("I unchecked letters with flags");
	}

	@Then("^I see message \"Letter is sent\"$")
	public void seeLetterSentTest() {
		String expectedMessage = "Ваше письмо отправлено. Перейти во Входящие";
		Assert.assertEquals(expectedMessage, mailPage.getMessageSentTitle());
	}

	@Then("^I see message \"Letter moved to spam\"$")
	public void letterMoveSpamTest() {
		Assert.assertTrue(mailPage.isAddedToSpamAlertPresent());
	}

	@Then("^I see letter in spam")
	public void letterInSpamTest() {
		Assert.assertTrue(mailPage.isMoveFromSpamAlertPresent());
	}

	@Then("^I see letters with flags$")
	public void lettersWithFlagsTest() {
		int numOfLabel = 3;
		Assert.assertEquals(mailPage.listFlags.size(), numOfLabel);
	}

	@Then("^I not see mark flag on letters$")
	public void lettersNoFlagsTest() {
		Assert.assertTrue(mailPage.getLabelFlag().isEmpty());
	}

	@After
	public void afterClass() {
		closeDriver();
		logger.info("testing page is over");
	}
}
