package serenity.dvsum.steps;

import net.serenitybdd.screenplay.Task;
import serenity.dvsum.actions.ClickAll;

import static serenity.dvsum.components.editviewform.EditViewForm.CLEAR_DATABASE_NAME_FIELD;

public class ClearFields {
    public static Task inDatabaseNameField() {
        return Task.where("{0} clears database name field",
                ClickAll.locatedByTargetNamed(CLEAR_DATABASE_NAME_FIELD)
        );
    }
}
