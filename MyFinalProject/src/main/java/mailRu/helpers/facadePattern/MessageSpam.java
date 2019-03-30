package mailRu.helpers.facadePattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessageSpam {
	@FindBy(xpath = ".//span[contains(text(),'в папку «Спам».')]")
	public WebElement addedToSpamAlert;

	public MessageSpam(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public boolean isAddedToSpamAlertPresent() {
		return addedToSpamAlert.isDisplayed();
	}

}
