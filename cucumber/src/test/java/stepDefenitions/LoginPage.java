package stepDefenitions;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage {

	WebDriver driver;
	static Logger log=Logger.getLogger(LoginPage.class.getName());

	@Given("valid user details")
	public void valid_user_details() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Mutturaj\\Desktop\\Softs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		
		log.info("Browser opened");

	}

	@When("facebook {string} and {string} opened")
	public void facebook_and_opened(String username, String password)  {

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(username);
		
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(password);
		
		driver.findElement(By.id("loginbutton")).click();
		log.info("Login button clicked");

	}

	@Then("login suceessfull")
	public void login_suceessfull() {
		driver.close();
		log.info("Browser closed");
	}

}
