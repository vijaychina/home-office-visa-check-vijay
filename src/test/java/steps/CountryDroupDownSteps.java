package steps;

import gov.uk.check.visa.pages.StartPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class CountryDroupDownSteps {
    @Given("I am on Home page")
    public void iAmOnHomePage() {
    }

    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickStartNow();
    }

    @Then("I can see following country into dropdown")
    public void iCanSeeFollowingCountryIntoDropdown(DataTable dataTable) {
        List<List<String>> userList = dataTable.asLists(String.class);
        for (List<String> list : userList) {
            System.out.println(list.get(0));
        }
    }
}
