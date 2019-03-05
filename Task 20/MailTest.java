package pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MailTest {
	private WebDriver driver;
	private LoginPage loginPage;
	private MailPage mailPage;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		mailPage = new MailPage(driver);
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();

	}

	@Test(priority = 1)
	public void testMailPageMoveToSpam() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://www.mail.ru/");
		loginPage.enterData("o-soldatenkova@bk.ru", "olka030389");
		loginPage.clickButton();
		mailPage.moveToSpam();
		mailPage.openSpamFolder();
		Assert.assertTrue(mailPage.letterMoveOnSpam(), "Letter isn't move on spam");
	}

	@Test(priority = 2)
	public void testExtractingFromSpam() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://www.mail.ru/");
		loginPage.enterData("o-soldatenkova@bk.ru", "olka030389");
		loginPage.clickButton();
		mailPage.openSpamFolder();
		mailPage.extractingFromSpam();
		mailPage.openInboxFolder();
		Assert.assertTrue(mailPage.LetterNoSpam(), "Letter is spam");
		}

	@Test(priority = 3)
	public void testSendingMessageToUserGroup() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://www.mail.ru/");
		loginPage.enterData("o-soldatenkova@bk.ru", "olka030389");
		loginPage.clickButton();
		String adressaty = "olka030389@yandex.ru, nadya160362@yandex.ru";
		String subject = "My letter";
		mailPage.sendingMessageToUserGroup(adressaty, subject);
		String expectedMessage = "Ваше письмо отправлено. Перейти во Входящие";
		Assert.assertEquals(expectedMessage, mailPage.getMessageSentTitle());

	}

	@Test(priority = 4)
	public void testMarkToLettersFlag() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://www.mail.ru/");
		loginPage.enterData("o-soldatenkova@bk.ru", "olka030389");
		loginPage.clickButton();
		int numOfLabel = 3;
		mailPage.labelFlag(numOfLabel);
		Assert.assertEquals(mailPage.getLabelFlag().size(), numOfLabel);

	}

	@Test(priority = 5)
	public void testUncheckAllFlags() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://www.mail.ru/");
		loginPage.enterData("o-soldatenkova@bk.ru", "olka030389");
		loginPage.clickButton();
		mailPage.uncheckFlags();
		Assert.assertTrue(mailPage.getLabelFlag().isEmpty(), "Order is not empty");
	}
}
