package serenity.dvsum.steps;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import serenity.dvsum.components.columndictionary.ViewDropdown;

import static serenity.dvsum.components.columndictionary.ViewDropdown.DROPDOWN;

public class SelectViewFromDropdown {
    public static Task named(String viewName) {
        return Task.where("{0} selects #viewName from dropdown",
                Click.on(DROPDOWN).then(
                        Click.on(ViewDropdown.targetNamed(viewName))
                ));
    }
}
