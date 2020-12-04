package serenity.dvsum.steps;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static serenity.dvsum.components.editviewform.EditViewForm.DATABASE_NAME_FIELD;
import static serenity.dvsum.components.editviewform.EditViewForm.VIEW_NAME_FIELD;

public class SetDatabaseName {
    public static Task named(String databaseName) {
        return Task.where("{0} sets the database name to be #databaseName",
                ClearFields.inDatabaseNameField(),
                Enter.theValue(databaseName).into(DATABASE_NAME_FIELD).
                        thenHit(Keys.ENTER)
        );
    }
}
