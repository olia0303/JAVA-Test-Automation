package mailRu.helpers.facadePattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SpamFacade {
	private LetterInSpam letterInSpam;
	private Checkbox checkbox;
	private MessageSpam messageSpam;

	public SpamFacade(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.letterInSpam = new LetterInSpam(driver);
		this.checkbox = new Checkbox(driver);
		this.messageSpam = new MessageSpam(driver);
	}

	public void moveToSpam(int index) {
		checkbox.clickCheckbox(index);
		letterInSpam.clickButtonSpam();
		messageSpam.isAddedToSpamAlertPresent();
	}

}













