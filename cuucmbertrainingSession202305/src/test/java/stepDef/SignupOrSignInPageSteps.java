package stepDef;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.pages.SignupOrSignInPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupOrSignInPageSteps {
	private SignupOrSignInPage signuporin=new SignupOrSignInPage(DriverFactory.getDriver()); 
	private HomePage homepage;
	 String actualoutput;
	 @When("user enters Email and Password and Clicks on Login button")
		public void user_enters_email_and_password_and_clicks_on_login_button(DataTable dataTable) {
		 List<Map<String, String>> cred=dataTable.asMaps();
		 System.out.println("credentials are :"+cred);
		 String email=cred.get(0).get("Email");
		 String password=cred.get(0).get("Password");
		 signuporin.doLogin(email, password);
		}
		
		@Then("screen should show {string}")
		public void screen_should_show(String expectedOutput) {
			homepage=signuporin.getHomePage();
			actualoutput=homepage.getLoggedinMsg();
			Assert.assertEquals(expectedOutput, actualoutput);
		}
		
		
		@Then("SigninValidation should show {string}")
		public void Signinvalidation_should_show(String expectedOutput) {
			actualoutput=signuporin.getSignInValidation();
			Assert.assertEquals(expectedOutput, actualoutput);
		}
		
		@When("user enter name and email address and clicks on signup button")
		public void user_enter_name_and_email_address_and_clicks_on_signup_button(DataTable dataTable) {
			List<Map<String, String>> cred=dataTable.asMaps();
			 System.out.println("credentials are :"+cred);
			 String name=cred.get(0).get("Name");
			 String email=cred.get(0).get("Email");
			 signuporin.doSignup(name, email);
		}
		
		@Then("Signupvalidation should show {string}")
		public void Signupvalidation_should_show(String expectedOutput) {
			actualoutput=signuporin.getSignupValidationMsg();
			Assert.assertEquals(expectedOutput, actualoutput);
		}
}
