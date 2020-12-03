package serenity.dvsum.steps;

import net.serenitybdd.screenplay.Task;

public class SelectViewAction {
    public static Task editView() {
        return Task.where("{0} selects edit view from view action settings");
    }
}
