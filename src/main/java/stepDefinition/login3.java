package stepDefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class login3 {

	WebDriver dr;

	@Given("^user goes to home page$")
	public void user_goes_to_home_page() {
		System.setProperty("webdriver.chrome.driver", "E:/Selenium Softwares/WebDrivers/latest chrome exe/chromedriver.exe");  // to show chrome driver, where it is store
		dr = new ChromeDriver(); // create a chrome driver.
		dr.manage().window().maximize();
		dr.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		dr.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		dr.findElement(By.id("txtUsername")).sendKeys("Admin");
		dr.findElement(By.id("txtPassword")).sendKeys("admin123");
		dr.findElement(By.id("btnLogin")).click();

//		String title = dr.getTitle();
//		String req = "OrangeHRM";
//		Assert.assertEquals(req, title);
	}

	@Then("^user clicks on Admin menue option$")
	public void user_clicks_on_admin_menue_option(){
		dr.findElement(By.id("menu_admin_viewAdminModule")).click();
		dr.findElement(By.id("menu_admin_UserManagement")).click();
	}	

	@Then("^user selects Users under user management option$")
	public void user_selects_users_under_user_management_option()  {
		dr.findElement(By.id("menu_admin_viewSystemUsers")).click();
	}

	@When("^the user provides username and employeename on form$")
	public void the_user_provides_username_and_employeename_on_form(DataTable value){
		for(Map<String,String> data : value.asMaps(String.class, String.class))
		{
			dr.findElement(By.id("searchSystemUser_userName")).sendKeys(data.get("username"));
			dr.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys(data.get("employeename"));
		}
	}

	@Then("^user clicks on the search button$")
	public void user_clicks_on_the_search_button() {
		dr.findElement(By.id("searchBtn")).click();
	}

	@Then("^user can see search result$")
	public void user_can_see_search_result(){
		Assert.assertTrue(dr.findElement(By.id("ohrmList_chkSelectRecord_15")).isDisplayed());

	}


}
