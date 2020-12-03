package serenity.dvsum.steps;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static serenity.dvsum.components.columndictionary.ViewSetting.EDIT_VIEW_BUTTON;
import static serenity.dvsum.components.columndictionary.ViewSetting.VIEW_SETTING_BUTTON;

public class SelectViewSetting {
    public static Task editView() {
        return Task.where("{0} selects edit view from view action settings",
                Open.browserOn().thePageNamed("column_dictionary.page")
                        .then(Click.on(VIEW_SETTING_BUTTON))
                        .then(Click.on(EDIT_VIEW_BUTTON))
        );
    }
}
