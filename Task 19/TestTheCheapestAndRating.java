package automation;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestTheCheapestAndRating {
	private WebDriver driver;
	private String bookingURL = "http://www.booking.com";

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(bookingURL);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	public void searchCity() {
		WebElement searchCity = driver.findElement(By.xpath("//*[@id=\"ss\"]"));
		searchCity.clear();
		searchCity.sendKeys("Париж");

	}

	public void selectDate() {
		enteredDate(LocalDate.now().plusDays(3), LocalDate.now().plusDays(3 + 7));
	}

	public void enteredDate(LocalDate inDate, LocalDate outDate) {
		WebElement calendar = driver.findElement(By.xpath(".//div[@class='xp__dates-inner xp__dates__checkin']"));
		calendar.click();
		driver.findElement(By.xpath("//table//td[@data-date='" + inDate.toString() + "']")).click();
		driver.findElement(By.xpath("//table//td[@data-date='" + outDate.toString() + "']")).click();
	}

	public int getActualPrice() {
		List<WebElement> priceList = driver
				.findElements(By.xpath(".//*[normalize-space(@class) = 'price availprice no_rack_rate']"));
		return Integer.parseInt(priceList.get(0).getText().substring(4).replace(" ", ""));
	}

	public void setInfoGuests() {
		WebElement twoAdultsGuest = driver.findElement(By.xpath("//*[@id=\"xp__guests__toggle\"]/span/span[1]"));
		twoAdultsGuest.click();
		WebElement searchOneRoom = driver.findElement(By.xpath("//*[@id=\"xp__guests__toggle\"]/span/span[3]/span"));
		searchOneRoom.click();
		WebElement checkPrice = driver.findElement(By.xpath("//button/span[text()=\"Проверить цены\"]"));
		checkPrice.click();

	}

	@Test
	public void testTheCheapestHotels() throws InterruptedException {
		searchCity();
		selectDate();
		setInfoGuests();
		int expected_price = 10000;
		WebElement selectPrice = driver.findElement(By.xpath(".//a[@data-id=\"pri-1\"]"));
		selectPrice.click();
		List<WebElement> list = driver.findElements(By.xpath(".//span[@class[contains(.,'sr-hotel__name')]]"));
		assertFalse(list.isEmpty(), "There are no hotels in this range ");
		Thread.sleep(2000);
		WebElement selectByRating = driver.findElement(By.xpath(".//a[@data-id=\"review_score-90\"]"));
		Thread.sleep(2000);
		selectByRating.click();
		assertTrue(getActualPrice() <= expected_price,
				"\nActual price = " + getActualPrice() + "\nExpected price =" + expected_price);
	}

}
