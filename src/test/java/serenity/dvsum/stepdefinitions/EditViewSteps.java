package serenity.dvsum.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class EditViewSteps {

    Actor checo = new Actor("Checo");

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void checoCanBrowserTheWeb(){
        checo.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("User is on Column Dictionary Page on DvSum App")
    public void givenMethodForEditViewStep(){
        System.out.println("he");
    }

    @When("User edits a view")
    public void whenMethodForEditViewStep(){
        System.out.println("hetewo");
    }

    @Then("View should be updated with edited details")
    public void thenMethodForEditViewStep(){
        System.out.println("hehi");
    }

}
