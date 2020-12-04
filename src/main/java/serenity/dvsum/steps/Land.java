package serenity.dvsum.steps;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Land {
    public static Performable onColumnDictionaryPage() {

        return Task.where("{0} navigates to Column Dictionary Page",
//                Open.browserOn().thePageNamed("home.page"),
                Open.browserOn().thePageNamed("column_dictionary.page"));
    }
}
