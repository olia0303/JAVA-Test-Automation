package mailRu;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

import mailRu.helpers.builderPattern.UserBuilder;
import mailRu.helpers.sql.UserDataProvider;
import mailRu.helpers.webDriverPattern.WebDriverSingleton;

public abstract class Config {

	private FileInputStream fileInputStream;
	private Properties property = new Properties();
	protected static String DRIVER_TYPE;
	protected static String url;
	protected static String login;
	protected static String password;
	protected WebDriver driver;

	public Config() throws NumberFormatException, SQLException, IOException {
		System.out.println("setConfiguration.");
		fileInputStream = new FileInputStream("src/main/resources/config.properties");
		property.load(fileInputStream);
		url = property.getProperty("URL");
		DRIVER_TYPE = property.getProperty("browserType");
		UserBuilder user = UserDataProvider.getUserData();
		login = user.getLogin();
		password = user.getPassword();
	}

	public void initDriver() {
		System.out.println("initDriver.");
		driver = WebDriverSingleton.getDriver(DRIVER_TYPE);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

	}

	public void closeDriver() {
		System.out.println("closeDriver.");
		driver.close();
	}
}
