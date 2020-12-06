package serenity.dvsum.actions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.interactions.Actions;

import java.nio.file.attribute.FileTime;

public class DragAndDrop implements Interaction {

    private WebElementFacade column;
    private WebElementFacade selectedColumnField;

    public DragAndDrop(WebElementFacade column){
        this.column = column;
    }

    public static DragAndDrop from(WebElementFacade column) {
        return Instrumented.instanceOf(DragAndDrop.class).withProperties(column);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions action = new Actions(BrowseTheWeb.as(actor).getDriver());
        action.dragAndDrop(column.getElement(), selectedColumnField.getElement()).build().perform();
    }

    public DragAndDrop to(WebElementFacade selectedColumnField) {
        this.selectedColumnField = selectedColumnField;
        return this;
    }
}
