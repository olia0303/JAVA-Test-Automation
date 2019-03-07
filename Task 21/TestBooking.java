package pages;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestBooking {
	private WebDriver driver;
	private BookingPage bookingPage;
	private String bookingURL = "http://www.booking.com";
	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		bookingPage = new BookingPage(driver);
	}

	@Test
	public void testCheckHotellsOnEnteredDates() {
		driver.manage().window().maximize();
		driver.get(bookingURL);
    	bookingPage.enterCity();
		bookingPage.calendar();
		bookingPage.arrivalDate();
		bookingPage.departureDate();
		bookingPage.checkPrice();
		Assert.assertTrue(bookingPage.getHotelList().size() > 0, "There are no hotels for the dates entered");
	}

	@Test(priority = 1)
	public void testCheckHotellsOnRaiting() {
		driver.manage().window().maximize();
		driver.get(bookingURL);
		bookingPage.enterCity();
	    bookingPage.calendar();
	    bookingPage.arrivalDate();
	    bookingPage.departureDate(); 
	    bookingPage.checkPrice();
		bookingPage.sortRaiting();
		 try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		bookingPage.getHotelList().get(0).click();
		Assert.assertTrue(bookingPage.getHotelRating() >= 9.0, "This Hotel not rated ");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();

	}

}
