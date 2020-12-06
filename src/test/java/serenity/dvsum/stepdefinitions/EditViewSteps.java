package serenity.dvsum.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import serenity.dvsum.components.columndictionary.ViewDropdown;
import serenity.dvsum.questions.SelectedView;
import serenity.dvsum.steps.EditView;
import serenity.dvsum.steps.Land;
import serenity.dvsum.steps.Login;

import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;

public class EditViewSteps {

    Actor checo = new Actor("Checo");

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void checoCanBrowserTheWeb(){
        checo.can(BrowseTheWeb.with(hisBrowser));
        checo.wasAbleTo(Login.withValidCredentials());
    }

    @Given("User is on Column Dictionary Page on DvSum App")
    public void givenMethodForEditViewStep(){
        checo.wasAbleTo(Land.onColumnDictionaryPage());
    }

    @When("User edits a view")
    public void whenMethodForEditViewStep(DataTable table){
        Map<String, String> viewData = table.asMaps().get(0);
        checo.attemptsTo(EditView.with(viewData));
    }

    @Then("View should be updated with edited details")
    public void thenMethodForEditViewStep(){
        checo.should(
                seeThat(SelectedView.name(), is(equalTo("testViewEdited")))
        );
    }


}