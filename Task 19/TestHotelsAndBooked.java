package automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class TestHotelsAndBooked {
	private WebDriver driver;
	private String bookingURL = "http://www.booking.com";

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(bookingURL);
	}

	public void searchCity() {
		WebElement searchCity = driver.findElement(By.xpath("//*[@id=\"ss\"]"));
		searchCity.clear();
		searchCity.sendKeys("�����");

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

	public void setInfoGuests() throws InterruptedException {
		WebElement adultsGuest = driver.findElement(By.xpath("//*[@id=\"xp__guests__toggle\"]/span/span[1]"));
		adultsGuest.click();
		WebElement addFourGuests = driver.findElement(By.xpath(
				"//div[@class=\"sb-group__field sb-group__field-adults\"]/descendant::button[@class=\"bui-button bui-button--secondary bui-stepper__add-button\"]"));
		addFourGuests.click();
		addFourGuests.click();
		Thread.sleep(2000);
		WebElement addTwoRoom = driver.findElement(By.xpath(
				"//div[@class=\"sb-group__field sb-group__field-rooms\"]/descendant::button[@class=\"bui-button bui-button--secondary bui-stepper__add-button\"]"));
		addTwoRoom.click();
		Thread.sleep(1000);
		WebElement checkPrice = driver.findElement(By.xpath("//button/span[text()=\"��������� ����\"]"));
		checkPrice.click();
	}

	public int getTotalPrice() {
		List<WebElement> totalPriceList = driver.findElements(By.xpath(
				"(.//div[normalize-space(@class) = 'totalPrice totalPrice_no-rack-rate entire_row_clickable'])[1]"));
		String totalPrice = totalPriceList.get(0).getText();
		return Integer.parseInt(
				totalPrice.substring(totalPrice.indexOf("BYN") + 3, totalPrice.indexOf("+") - 1).replace(" ", ""));
	}

	public String getErrorMessage() {
		WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"bp_form_cc_number_msg\"]"));
		return errorMessage.getText().trim();
	}

	@Test
	public void testSelectHotelAndBooked() throws InterruptedException {
		searchCity();
		selectDate();
		setInfoGuests();
		int expected_price = 15000;
		WebElement checkPriceHigh = driver.findElement(By.xpath(".//a[@data-id=\"pri-5\"]"));
		checkPriceHigh.click();
		Thread.sleep(2000);
		WebElement checkPriceLow = driver.findElement(By.xpath("(.//a[@class=\"sort_option \"])[2]"));
		checkPriceLow.click();
		Thread.sleep(2000);
		WebElement firstHotel = driver
				.findElement(By.xpath(".//*[@id=\"hotellist_inner\"]/div[1]/div[2]/div[1]/div[1]/h3/a/span[1]"));
		firstHotel.click();
		Thread.sleep(2000);
		assertTrue(getTotalPrice() <= expected_price,
				"\nTotal price = " + getTotalPrice() + "\nExpected price =" + expected_price);

		WebElement button = driver
				.findElement(By.xpath("(.//a[@class=\"b-button b-button_primary sr_cta_button\"])[1]"));
		button.click();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		for (String winHandle : windows) {
			driver.switchTo().window(winHandle);
		}
		WebElement buttonBookedRoom = driver.findElement(By.xpath("(.//button[@id=\"hp_book_now_button\"])[2]"));
		buttonBookedRoom.click();
		Select rooms = new Select(
				driver.findElement(By.xpath("(.//select[@data-component=\"hotel/new-rooms-table/select-rooms\"])[1]")));
		rooms.selectByIndex(2);
		Thread.sleep(2000);
		WebElement buttonBooked = driver
				.findElement(By.xpath(".//div[@data-component=\"hotel/new-rooms-table/reservation-cta\"]"));
		buttonBooked.click();
		Set<String> moreWindows = driver.getWindowHandles();
		for (String winHandle : moreWindows) {
			driver.switchTo().window(winHandle);
		}
		Select appealPerson = new Select(driver.findElement(By.xpath(".//select[@id=\"booker_title\"]")));
		appealPerson.selectByIndex(2);
		WebElement name = driver.findElement(By.id("firstname"));
		name.sendKeys("Olga");
		WebElement lastName = driver.findElement(By.id("lastname"));
		lastName.sendKeys("Soldatenkova");
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("o-soldatenkova@bk.ru");
		Thread.sleep(2000);
		WebElement emailConfirm = driver.findElement(By.id("email_confirm"));
		emailConfirm.sendKeys("o-soldatenkova@bk.ru");
		Thread.sleep(2000);
		WebElement mainGuest = driver.findElement(By.xpath(".//input[@id=\"notstayer_false\"]"));
		mainGuest.click();
		WebElement buttonBook = driver.findElement(By.xpath(".//button[@name=\"book\"]"));
		buttonBook.click();
		Set<String> emoreWindows = driver.getWindowHandles();
		for (String winHandle : emoreWindows) {
			driver.switchTo().window(winHandle);
		}

		WebElement adress = driver.findElement(By.id("address1"));
		adress.sendKeys("Hermanovskaya 15");
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Minsk");
		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("296630389");
		Select cardType = new Select(driver.findElement(By.id("cc_type")));
		cardType.selectByIndex(2);
		Thread.sleep(2000);
		WebElement cardNumber = driver.findElement(By.id("cc_number"));
		cardNumber.sendKeys(" 5242 4242 4242 4242");
		Thread.sleep(2000);
		Select cardDate = new Select(driver.findElement(By.id("cc_month")));
		cardDate.selectByIndex(2);
		Thread.sleep(2000);
		Select cardYear = new Select(driver.findElement(By.id("cc_year")));
		cardYear.selectByIndex(2);
		Thread.sleep(2000);
		WebElement cvcCode = driver.findElement(By.xpath(".//input[@id=\"cc_cvc\"]"));
		cvcCode.sendKeys("568");
		Thread.sleep(2000);
		WebElement finishBooked = driver.findElement(By.xpath("(.//button[@name=\"book\"])[2]"));
		finishBooked.click();
		String expected_ErrorMessage = "������� ����� �������������� ��������� �����";
		assertEquals(getErrorMessage(), expected_ErrorMessage);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}
