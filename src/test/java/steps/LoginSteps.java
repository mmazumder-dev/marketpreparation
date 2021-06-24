package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.BasePage;
import page.DashBoardPage;
import page.LoginPage;
import util.Assertion;
import util.BrowserFactory;
import util.Database;

public class LoginSteps extends BasePage {

	WebDriver driver;
	LoginPage login;
	DashBoardPage dashboardPage;
	Database database;
	
	@Before
	public void beforeRun() {
		
		driver = BrowserFactory.launchBrowser();
		login = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashBoardPage.class);
		
		
	}

	@Given("^I am on techfios site$")
	public void i_am_on_techfios_site() {

	}

	@When("^I enter username and password$")
	public void i_enter_username_and_password() throws Throwable {
		//login = PageFactory.initElements(driver, LoginPage.class);
		//login.enterUsernName("demo@techfios.com");
		//login.enterPassword("abc123");
		login.enterUsernName(database.get("username"));
		login.enterPassword(database.get("password"));

		
	}

	@When("^I click on sign in button$")
	public void i_click_on_sign_in_button() throws Throwable {
		login.clickSignInButton();
		throw new PendingException();
	}
	
	
	
	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String username, String password) throws Throwable {
		login.enterUsernName(username);
		login.enterPassword(password);
		//screenshot (driver, "C:\\IT Lessons\\Screenshot\\class.jpg");
	}
	
	@Then("^Dashboard page should display$")
	public void dashboard_page_should_display() throws Throwable {
		String expected = "Dashboard- iBilling";
		Assertion.equals("Wrong Page displayed", dashboardPage.getPageTitle(), expected);
		
	}



   @After
   public void afterRun() {
	   BrowserFactory.tearDown();
   }
   
}