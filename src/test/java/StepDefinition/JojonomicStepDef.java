package StepDefinition;

import Jojonomic.Page.JojonomicPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.core.Serenity.getDriver;

public class JojonomicStepDef {
    @Steps
    JojonomicPage jojonomicPage;

    @Given("user open the web page")
    public void userOpenTheWebPage() {
        getDriver().get(JojonomicPage.NavPage_URL);

    }

    @When("user input {string} to search")
    public void userInputToSearch(String input) {
        getDriver().findElement(JojonomicPage.Search).clear();
        getDriver().findElement(JojonomicPage.Search).sendKeys(input);
    }

    @Then("user click button search")
    public void userClickButtonSearch() {
        getDriver().findElement(JojonomicPage.Button_Search).click();
    }

    @And("navigation web is valid")
    public void navigationWebIsValid() {
        getDriver().findElement(JojonomicPage.Search_Nav).isDisplayed();
    }

    @When("user click on Locate us button")
    public void userClickOnLocateUsButton() {
        getDriver().findElement(JojonomicPage.Locate).click();
    }

    @Then("locate page is display")
    public void locatePageIsDisplay() {
        getDriver().get(JojonomicPage.Locate_URL);
    }

    @Then("user enter suburb {string}")
    public void userEnterSuburb(String suburb) {
        getDriver().findElement(JojonomicPage.Search_Suburb).clear();
        getDriver().findElement(JojonomicPage.Search_Suburb).sendKeys(suburb);
    }


    @And("user click button search suburb")
    public void userClickButtonSearchSuburb() {
        getDriver().findElement(JojonomicPage.Button_Search_Suburb).click();
    }

    @And("should use service centre named as {string}")
    public void shouldUseServiceCentreNamedAs(String name) {
        getDriver().findElement(jojonomicPage.validateServiceCenterName(name)).isDisplayed();

    }



}
