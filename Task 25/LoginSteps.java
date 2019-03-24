package core;

import java.sql.SQLException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	private static final String MAIN_URL = "http://mail.ru";
	private LoginPage loginPage;
	private WebDriver webDriver;

	public LoginSteps() {
		webDriver = new ChromeDriver();
		loginPage = new LoginPage(webDriver);

	}

	@Given("^I am on main application page$")
	public void loadMainPage() {
		webDriver.get(MAIN_URL);
	}

	@When("^I login as correct user$")
	public void loginAsCorrectUser() throws NumberFormatException, SQLException {

		User user = UserDatabase.getUserData();
		loginPage.enterLoginAndPass(user.getLogin(), user.getPassword());
		loginPage.clickButtonEnter();
	}

	@When("^I open page$")
	public void writeNewLetter() {
		loginPage.waitLoadPage();
		loginPage.clickButtonWriteLetter();

	}

	@When("^I send message to User Group$")
	public void sendingMessageToUserGroup() throws NumberFormatException, SQLException {
		User user = UserDatabase.getUserData();
		loginPage.sendingMessageToUserGroup(user.getAdress1(), user.getAdress2(), user.getSubject());
		loginPage.waitLoadPage();
		loginPage.clickContinue();

	}

	@Then("I see logout link")
	public void seeLogoutLink() {
		Assert.assertTrue(loginPage.logoutLinkPresents());
	}

	@Then("^I see message \"Letter is sent\"$")
	public void seeLetterSent() {
		loginPage.waitLoadPage();
		String expectedMessage = "Ваше письмо отправлено. Перейти во Входящие";
		Assert.assertEquals(expectedMessage, loginPage.getMessageSentTitle());

	}

	@After
	public void afterClass() {
		webDriver.quit();
	}
}
