package serenity.dvsum.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.questions.Text;
import serenity.dvsum.components.columndictionary.ViewDropdown;

import static serenity.dvsum.components.columndictionary.ViewDropdown.SELECTED_VIEW;

public class SelectedView {
    public static Question<String> name() {
        return Text.of(SELECTED_VIEW).asAString();
    }
}
