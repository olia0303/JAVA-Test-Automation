package steps;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mailRu.Config;
import mailRu.pages.LoginPage;
import ru.yandex.qatools.allure.annotations.Attachment;

public class LoginSteps extends Config {
	private static final Logger logger = Logger.getLogger(LoginSteps.class);
	private LoginPage loginPage;

	public LoginSteps() throws NumberFormatException, SQLException, IOException {
		initDriver();
		loginPage = new LoginPage(driver);
	}

	@Given("^I am on main application page$")
	public void loadMainPage() {
		driver.get(url);
		logger.info("Page initialization finished.");
	}

	@When("^I login as correct user$")
	public void loginAsCorrectUser() {
		loginPage.enterLoginAndPassword(login, password);
		loginPage.clickButtonEnter();
		logger.info("Login is correct");
	}

	@When("^I login as user with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void loginAsUserWithCredentials(String name, String password) {
		loginPage.enterLoginAndPassword(name, password);
		loginPage.clickButtonEnter();
		logger.info("I login as user with login =  " + name + ", pass = " + password);
	}

	@Then("I see logout link")
	public void seeLogoutLink() {
		Assert.assertTrue(loginPage.logoutLinkPresents());
		logger.info("I see logout link");
	}

	@Then("I see error message")
	public void seeErrorMessage() {
		Assert.assertTrue(loginPage.logoutLinkErrorPresents());
		logger.info("I see error message");
	}

	@When("^I click logout$")
	public void clickLogout() {
		loginPage.clickLogout();
		logger.info("I click logout");
	}

	@Then("I see main application page")
	public void seeMainPage() {
		loginPage.checkPage();
		logger.info("I see main application page");

	}
	 @Attachment(value = "Attachment Screenshot", type = "image/png")
	    public byte[] makeScreenshot() {
	        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	    }
	@After
	public void afterClass() {
	    makeScreenshot();
		closeDriver();
		logger.info("testing page is over");
	}
}
