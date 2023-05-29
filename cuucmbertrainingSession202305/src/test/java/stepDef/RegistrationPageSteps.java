package stepDef;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.aventstack.extentreports.reporter.ReporterConfigurable;
import com.pages.AccountCreated;
import com.pages.HomePage;
import com.pages.RegistrationPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationPageSteps {
	private RegistrationPage register=new RegistrationPage(DriverFactory.getDriver());
	private AccountCreated accCreated=new AccountCreated(DriverFactory.getDriver());
	private HomePage homepage;
	private String actual;
	
	@When("user enters Acc info and clicks on create account button")
	public void user_enters_acc_info_and_clicks_on_create_account_button(DataTable dataTable) {
		List<Map<String, String>>  accountInfo=dataTable.asMaps();
	    String title=accountInfo.get(0).get("Title");
	    String name=accountInfo.get(0).get("Name");
	    String password=accountInfo.get(0).get("Password");
	    String dob=accountInfo.get(0).get("DOB");
	    String newsletter=accountInfo.get(0).get("newsLetter");
	    String sploffers=accountInfo.get(0).get("splOffers");
	    String firstname=accountInfo.get(0).get("FirstName");
	    String lastname=accountInfo.get(0).get("LastName");
	    String company=accountInfo.get(0).get("Company");
	    String address=accountInfo.get(0).get("Address");
	    String address2=accountInfo.get(0).get("Address2");
	    String country=accountInfo.get(0).get("Country");
	    String state=accountInfo.get(0).get("State");
	    String city=accountInfo.get(0).get("City");
	    String zip=accountInfo.get(0).get("Zipcode");
	    String mobile=accountInfo.get(0).get("mobile");
	    System.out.println(accountInfo);
	    register.CreateAccount(title, name, password, dob, newsletter, sploffers, firstname, lastname, company, address, address2, country, state, city, zip,mobile);
	    
	}

	@When("message should be {string}")
	public void message_should_be(String expected) {
		
		actual=accCreated.getPageHeader();
		System.out.println(actual);
		Assert.assertEquals(expected, actual);
	}

	@When("clicks on continue button")
	public void clicks_on_continue_button() {
		homepage=accCreated.clickContinue();
	}
}
