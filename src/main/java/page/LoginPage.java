package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	
	WebDriver driver;
	
	//Creating a Constructor here (establishing the connection)
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
		
	}
	
	//Element Library
	
	//WebElement WebElement_USERNAME_FIELD = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	//By USERNAME_FIELD_Locator = By.xpath("//*[@id=\"username\"]");
	@FindBy (how = How.XPATH, using = "//*[@id=\"username\"]") WebElement USERNAME_FIELD;
	@FindBy (how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_FIELD;
	@FindBy (how = How.NAME, using = "login") WebElement SignIn_BUTTON_FIELD;
	
	
	//Methods to interact with the elements
	
	public void enterUsernName (String userName) {
		USERNAME_FIELD.sendKeys(userName);
		
	}
	
	public void enterPassword(String password) {
		 PASSWORD_FIELD.sendKeys(password);
		 
 }
	
	public void clickSignInButton() {
		SignIn_BUTTON_FIELD.click();
		
	}

}
