package pages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingSteps 
{
	private static final String BOOKING_URL = "http://booking.com";
	private WebDriver driver;
    private BookingPage bookingPage;

    
    public BookingSteps()
    {
        driver = new ChromeDriver();
        bookingPage = new BookingPage(driver);
    }
    @Given("^I am on main application page$")
    public void loadMainPage() {
     driver.manage().window().maximize();
     driver.get(BOOKING_URL);
    }
  
    @When("^I enter the city in the search box$")
    public void enterCity()
    {
    	bookingPage.enterCity();
    }
    @When("^I enter date in search box$")
    public void enterDate()
    {
    	bookingPage.calendar();
		bookingPage.arrivalDate();
		bookingPage.departureDate();
    }
    @And("^I click button check price$")
    public void checkPrice()
    {
    	bookingPage.checkPrice();
    }
    @Then("I see hotels on the dates entered")
    public void seeHotels()
    {
     Assert.assertTrue(bookingPage.getHotelList().size()>0);
    }
    @When("^I sort hotels by the maximum rating$")
    public void sortHotellsByRaiting() {
    	bookingPage.sortRaiting();
    	
    }
    @When("^I find the best hotel$")
    public void findTheBestHotel() {
    	bookingPage.waitLoadPage();
    	bookingPage.findTheBestHotel();
    }
    @Then("I see the best hotel")
    public void seeTheBestHotel()
    {
     Assert.assertTrue(bookingPage.getHotelRating() >= 9.0);
    }
    @After
    public void afterClass()
    {
       driver.quit();
    }
}
