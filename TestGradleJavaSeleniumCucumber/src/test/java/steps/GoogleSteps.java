package steps;

import io.cucumber.java.en.*;

public class GoogleSteps {
    @Given("^I am on the Google search page$")
    public void navigateToGoogle(){}

    @When("^I enter a search criteria$")
    public void enterSearchCriteria(){}

    @And("^Click on the search button$")
    public void clickSearchButton(){}

    @Then("^The results match the criteria$")
    public void validateResult(){}
}
