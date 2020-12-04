package serenity.dvsum.steps;

import net.serenitybdd.screenplay.Task;

public class SelectColumns {
    public static Task named(String columnsToBeSelected) {
        return Task.where("{0} sets the specified columns",
                ColumnsToBeSelected.specifiedBy(columnsToBeSelected));
    }
}
