package serenity.dvsum.steps;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static serenity.dvsum.components.editviewform.EditViewForm.DATABASE_TYPE_DROPDOWN;

public class SetDatabaseType {
    public static Task named(String databaseType) {
        return Task.where("{0} sets the database type to be #databaseType",
                SelectFromOptions.byVisibleText(databaseType).from(DATABASE_TYPE_DROPDOWN)
        );
    }
}
