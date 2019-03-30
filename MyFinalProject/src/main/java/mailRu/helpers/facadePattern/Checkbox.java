package mailRu.helpers.facadePattern;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkbox {
	WebDriver driver;

	@FindBy(xpath = "(//div[contains(@class,'checkbox__box') and ancestor::div[@id='b-letters']and not(ancestor::div[contains(@style, 'display: none;')])])")
	public List<WebElement> checkboxList;

	public Checkbox(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickCheckbox(int index) {
		try {
			checkboxList.get(index).click();
		} catch (IndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
