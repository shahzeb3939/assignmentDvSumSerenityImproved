package serenity.dvsum.steps;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static serenity.dvsum.components.editviewform.EditViewForm.VIEW_NAME_FIELD;

public class SetNewViewName {
    public static Task named(String newViewName) {
        return Task.where("{0} sets view name to be #newViewName",
                Enter.theValue(newViewName).into(VIEW_NAME_FIELD)
        );
    }
}
