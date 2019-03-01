package automation;

import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestBooking {

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

	public void setDate(LocalDate inDate, LocalDate outDate) {
		WebElement calendar = driver.findElement(By.xpath(".//div[@class='xp__dates-inner xp__dates__checkin']"));
		calendar.click();
		driver.findElement(By.xpath("//table//td[@data-date='" + inDate.toString() + "']")).click();
		driver.findElement(By.xpath("//table//td[@data-date='" + outDate.toString() + "']")).click();
	}

	public void selectCityAndGuests() {
		driver.get(bookingURL);
		WebElement searchCity = driver.findElement(By.xpath("//*[@id=\"ss\"]"));
		searchCity.sendKeys("Москва");
		setDate(LocalDate.now().plusDays(1), LocalDate.now().plusDays(2));
		WebElement twoAdultsGuest = driver.findElement(By.xpath("//*[@id=\"xp__guests__toggle\"]/span/span[1]"));
		twoAdultsGuest.click();
		WebElement searchOneRoom = driver.findElement(By.xpath("//*[@id=\"xp__guests__toggle\"]/span/span[3]/span"));
		searchOneRoom.click();
		WebElement checkPrice = driver.findElement(By.xpath("//button/span[text()=\"Проверить цены\"]"));
		checkPrice.click();
	}

	@Test
	public void testCheckHotellsOnEnteredDates() {
		selectCityAndGuests();
		List<WebElement> hotelList = driver.findElements(By.xpath(".//span[@class[contains(.,'sr-hotel__name')]]"));
		Assert.assertTrue(hotelList.size() > 0, "There are no hotels for the dates entered");
	}

	@Test
	public void testCheckHotellsOnRaiting() {
		selectCityAndGuests();
		WebElement checkRaiting = driver.findElement(By.xpath(".//a[@data-category='review_score_and_price']"));
		checkRaiting.click();
		WebElement firstHotel = driver.findElement(By.xpath(".//a[@class='hotel_name_link url']"));
		firstHotel.click();
		driver.switchTo();
		Double ratingHotel = Double
				.valueOf(driver.findElement(By.xpath(".//div[@class=\"bui-review-score__badge\"]")).getText());
		Assert.assertTrue(ratingHotel >= 9, "Hotel doesn't fit.");
	}

}
