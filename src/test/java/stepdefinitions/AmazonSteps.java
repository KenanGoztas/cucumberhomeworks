package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Driver;

public class AmazonSteps {
    @Given("go amazon homepage")
    public void goAmazonHomepage() {
        Driver.getDriver().get("http://wwww.amazon.com");
    }

    @When("search an item")
    public void searchAnItem() {
        System.out.println();
    }

    @Then("see what do you search")
    public void seeWhatDoYouSearch() {
        System.out.println();
    }
}
