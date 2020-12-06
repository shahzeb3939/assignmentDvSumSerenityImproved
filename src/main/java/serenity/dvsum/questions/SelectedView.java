package serenity.dvsum.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import serenity.dvsum.components.columndictionary.ViewDropdown;

import static serenity.dvsum.components.columndictionary.ViewDropdown.SELECTED_VIEW;

public class SelectedView implements Question<String> {
    public static SelectedView name() {
        return new SelectedView();
    }

    @Override
    public String answeredBy(Actor actor) {
        return SELECTED_VIEW.resolveFor(actor).getText();
    }
}
