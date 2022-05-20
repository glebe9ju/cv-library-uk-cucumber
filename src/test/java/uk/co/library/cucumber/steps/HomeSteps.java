package uk.co.library.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.library.cucumber.pages.HomePage;

public class HomeSteps {

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }
    @When("^I enter job title \"([^\"]*)\"$")
    public void iEnterJobTitle(String title)  {
        new HomePage().clickOnGdprIframe();
        new HomePage().enterJobTitle(title);

    }
    @And("^I enter location \"([^\"]*)\"$")
    public void iEnterLocation(String location)  {
        new HomePage().enterLocation(location);
    }
    @And("^I select distance \"([^\"]*)\"$")
    public void iSelectDistance(String distance)  {
        new HomePage().selectDistance(distance);
    }
    @And("^I click on more search option link$")
    public void iClickOnMoreSearchOptionLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }
    @And("^I enter salary min \"([^\"]*)\"$")
    public void iEnterSalaryMin(String salary)  {
        new HomePage().enterMinSalary(salary);
    }
    @And("^I enter salary max \"([^\"]*)\"$")
    public void iEnterSalaryMax(String salary)  {
        new HomePage().enterMaxSalary(salary);
    }

    @And("^I select salary type \"([^\"]*)\"$")
    public void iSelectSalaryType(String type)  {
        new HomePage().selectSalaryType(type);
    }
    @And("^I select jobType \"([^\"]*)\"$")
    public void iSelectJobType(String jobType)  {
        new HomePage().selectJobType(jobType);
    }

    @And("^I click on find jobs button$")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnJobsButton();
    }

    @Then("^I verify the result \"([^\"]*)\"$")
    public void iVerifyTheResult(String result)  {
        Assert.assertEquals("not found",result,new HomePage().verifyResultPage());

    }
}
