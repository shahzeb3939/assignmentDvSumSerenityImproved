package serenity.dvsum.steps;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static serenity.dvsum.components.editviewform.EditViewForm.VIEW_SAVE_BUTTON;

public class SaveChanges {
    public static Task madeToView() {
        return Task.where("{0} saves the edited view",
                Click.on(VIEW_SAVE_BUTTON));
    }
}
