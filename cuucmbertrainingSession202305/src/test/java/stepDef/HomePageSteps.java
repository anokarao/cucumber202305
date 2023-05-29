package stepDef;

import org.junit.Assert;

import com.pages.AccountCreated;
import com.pages.HomePage;
import com.pages.SignupOrSignInPage;
import com.pages.TestcasesPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageSteps {
	
	private HomePage homepage=new HomePage(DriverFactory.getDriver());
	private AccountCreated accDeleted=new AccountCreated(DriverFactory.getDriver());
	private TestcasesPage testcasesPage;
	private SignupOrSignInPage signupOrSignIn;
	private String pageTitle;
	private String actual;

	@Given("Navigate to url")
	public void navigate_to_url() {
	   DriverFactory.getDriver().get("http://automationexercise.com");
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
		pageTitle=homepage.getHomePageTitle();
		System.out.println("page title is :"+pageTitle);
		Assert.assertEquals(pageTitle, title);
	}

	@When("user clicks on Test cases button")
	public void user_clicks_on_test_cases_button() {
		testcasesPage= homepage.getTestcasesPage();
	}
	
	@When("User click on Signup or Login button")
	public void user_click_on_signup_or_login_button() {
		signupOrSignIn=homepage.getSignupPage();
		
	}
	@When("clicks on Delete Account")
	public void clicks_on_delete_account() {
		accDeleted=homepage.deleteAccount();
	}

	@Then("Delete account message should show {string}")
	public void delete_account_message_should_show(String expected) {
		actual=accDeleted.getPageHeader();
		System.out.println(actual);
		Assert.assertEquals(actual, expected);
	}

	/*
	 * @When("user enters Email and Password") public void
	 * user_enters_email_and_password(DataTable dataTable) {
	 * 
	 * }
	 * 
	 * @Then("Clicks on login button") public void clicks_on_login_button() {
	 * 
	 * }
	 * 
	 * @Then("screen should show {string}") public void screen_should_show(String
	 * string) {
	 * 
	 * }
	 * 
	 * @Then("Click on Logout") public void click_on_logout() { // Write code here
	 * that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 * 
	 * @Then("menu should show {string}") public void menu_should_show(String
	 * string) { // Write code here that turns the phrase above into concrete
	 * actions throw new io.cucumber.java.PendingException(); }
	 */

	
}
