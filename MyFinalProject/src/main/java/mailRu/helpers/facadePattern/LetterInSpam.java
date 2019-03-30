package mailRu.helpers.facadePattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LetterInSpam {
	WebDriver driver;
	@FindBy(xpath = "(.//div[@data-name='spam'])[1]")
	private WebElement buttonSpam;
	@FindBy(xpath = ".//span[contains(text(),'в папку «Спам».')]")
	public WebElement addedToSpamAlert;

	public LetterInSpam(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickButtonSpam() {
		buttonSpam.click();
		(new WebDriverWait(driver, 15)).until(ExpectedConditions.visibilityOf(addedToSpamAlert));
	}
}
