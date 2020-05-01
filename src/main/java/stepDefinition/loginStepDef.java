package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class loginStepDef {

	WebDriver dr;

	@Given("^user is present on login page$")
	public void user_is_present_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "E:/Selenium Softwares/WebDrivers/latest chrome exe/chromedriver.exe");  // to show chrome driver, where it is store
		dr = new ChromeDriver(); // create a chrome driver.
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		dr.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	}

	@When("^title of login page is OrangeHRM$")
	public void title_of_login_page_is_OrangeHRM() {
		String title = dr.getTitle();
		String req = "OrangeHRM";
		Assert.assertEquals(req, title);
	}

	@Then("^user enters (.*) and (.*)$") // (.*) represents username and pwd sent by feature file
	public void user_enters_username_and_password(String username, String password) {
		dr.findElement(By.id("txtUsername")).sendKeys(username);
		dr.findElement(By.id("txtPassword")).sendKeys(password);
	}

	@Then("^user clicks on Login button$")
	public void user_clicks_on_Login_button()  {
		dr.findElement(By.id("btnLogin")).click();
	}

	@Then("^user lands on home page$")
	public void user_lands_on_home_page() {
		String title = dr.getTitle();
		String req = "OrangeHRM";
		Assert.assertEquals(req, title);
	}

	

}

