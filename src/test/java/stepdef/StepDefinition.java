package stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefinition {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("navigated to login url");
        System.out.println("navigated to login url2");
        System.out.println("navigated to login url3");

        System.out.println("navigated to login url4");
        System.out.println("navigated to login url5");
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_username_and_password(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("validated home page");
        System.out.println("validated home page2");
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String strArg3) throws Throwable {
        System.out.println("cards displayed: " + strArg3);
    }


}