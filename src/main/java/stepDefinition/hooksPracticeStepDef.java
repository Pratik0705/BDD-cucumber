package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class hooksPracticeStepDef {
// the below 2 are global hooks
	@Before(order = 0)
	public void before()  {
		System.out.println("This is before... ");
	}
	
	@After(order = 0)
	public void after()  {
		
		System.out.println("This is After... ");
	}
	
	@Before(order = 1)
	public void before1()  {
		System.out.println("This is before... order1 ");
	}
	
	@After(order = 1)
	public void after1()  {
		
		System.out.println("This is After... order1");
	}
	// we can also specify orders
	// ***** above before and after will be executed for every scenario separately *****
	
	// these are local hooks : 
	@Before("@first")
	public void beforefirst()  {
		System.out.println("This is first before... ");
	}
	
	@After("@first")
	public void afterfirst()  {
		
		System.out.println("This is first After... ");
	}
// above 2 hooks will be executed obly for the scnario with the tag "first". its local hook. not applicable for all scenarios
	
	@Given("^user lands on login window$")
	public void user_lands_on_login_window()  {
		
		System.out.println("1. user lands on login window");
	}

	@Then("^user sees compony logo$")
	public void user_sees_compony_logo()  {
		
		System.out.println("2. user sees compony logo");
	}

	@Given("^user gets logged$")
	public void user_gets_logged()  {
		
		System.out.println("3. user gets logged ");
	}

	@Then("^user can view the logo$")
	public void user_can_view_the_logo()  {
		
		System.out.println("4. user can view the logo");
	}

}

