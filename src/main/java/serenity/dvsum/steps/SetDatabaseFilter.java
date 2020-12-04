package serenity.dvsum.steps;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static serenity.dvsum.components.editviewform.EditViewForm.DATABASE_FILTER_DROPDOWN;

public class SetDatabaseFilter {
    public static Task named(String databaseFilter) {
        return Task.where("{0} sets the database filter to be #databaseFilter",
                SelectFromOptions.byVisibleText(databaseFilter).from(DATABASE_FILTER_DROPDOWN)
        );
    }
}
