package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class login2StepDef {

	WebDriver dr;
	@Given("^the user lands on home page$")
	public void the_user_lands_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "E:/Selenium Softwares/WebDrivers/latest chrome exe/chromedriver.exe");  // to show chrome driver, where it is store
		dr = new ChromeDriver(); // create a chrome driver.
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		dr.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		dr.findElement(By.id("txtUsername")).sendKeys("Admin");
		dr.findElement(By.id("txtPassword")).sendKeys("admin123");
		dr.findElement(By.id("btnLogin")).click();

		String title = dr.getTitle();
		String req = "OrangeHRM";
		Assert.assertEquals(req, title);
	}

	@Then("^the user clicks on Admin menue$")
	public void the_user_clicks_on_admin_menue() {
		dr.findElement(By.id("menu_admin_viewAdminModule")).click();
		dr.findElement(By.id("menu_admin_UserManagement")).click();
	}

	@Then("^the user selects Users under user management$")
	public void the_user_selects_users_under_user_management() {
		dr.findElement(By.id("menu_admin_viewSystemUsers")).click();
	}

	@When("^the user provides username and employeename on the form$")
	public void the_user_provides_username_and_empoyeename_on_the_form(DataTable values) {
		List<List<String>> data = values.raw();
		dr.findElement(By.id("searchSystemUser_userName")).sendKeys(data.get(0).get(0));
		dr.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys(data.get(0).get(1));
	}

	@Then("^the user clicks on search button$")
	public void the_user_clicks_on_search_button() {
		dr.findElement(By.id("searchBtn")).click();
	}

	@Then("^the user gets search result$")
	public void the_user_gets_search_result() {
		Assert.assertTrue(dr.findElement(By.id("ohrmList_chkSelectRecord_15")).isDisplayed());
	}



}
