package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BookingPage {
	WebDriver driver;
	WebDriver driver1;
	private static final String BOOKING_URL = "https://www.booking.com";
	@FindBy(xpath = ".//div[@class='xp__dates-inner xp__dates__checkin']")
	private WebElement calendar;
	@FindBy(xpath = "//*[@id=\"ss\"]")
	private WebElement searchCity;
	@FindBy(xpath = ".//td[@data-date=\"2019-03-10\"]")
	private WebElement arrivalDate;
	@FindBy(xpath = ".//td[@data-date=\"2019-03-20\"]")
	private WebElement departureDate;
	@FindBy(xpath = "//button/span[text()=\"Проверить цены\"]")
	private WebElement checkPrice;
	@FindBy(xpath = ".//div[@data-et-view=\" eWHJbWPNZWEHXT:5\"]")
	private List<WebElement> hotelsList;
	@FindBy(xpath = "//*[@id=\"filter_review\"]/div[2]/a[1]")
	private WebElement sortByRaiting;
	@FindBy(xpath = ".//div[@class='bui-review-score__badge']")
	private WebElement ratingHotel;

	public BookingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}

	public String getBookingUrl() {
		return BOOKING_URL;
	}

	public void calendar() {
		calendar.click();
	}

	public void arrivalDate() {
		arrivalDate.click();
	}

	public void departureDate() {
		departureDate.click();
	}

	public void enterCity() {
		searchCity.clear();
		searchCity.sendKeys("Москва");
	}

	public void checkPrice() {
		checkPrice.click();
	}

	public List<WebElement> getHotelList() {
		return hotelsList;
	}

	public void sortRaiting() {
		sortByRaiting.click();
	 }
	public void findTheBestHotel() {
 	  getHotelList().get(0).click();
     
	}
	public void waitLoadPage() {
		driver1 = new ChromeDriver();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.close();
	}
	public Double getHotelRating() {
		return Double.valueOf(ratingHotel.getText().replace(",","."));

	}
}
