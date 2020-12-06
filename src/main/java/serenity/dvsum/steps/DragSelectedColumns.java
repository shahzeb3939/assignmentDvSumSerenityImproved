package serenity.dvsum.steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.interactions.Actions;
import serenity.dvsum.actions.DragAndDrop;

import java.util.List;

import static serenity.dvsum.components.editviewform.EditViewForm.SELECTED_COLUMN_FIELD;

public class DragSelectedColumns implements Task {

    private List<WebElementFacade> columnsToBeSelected;

    public DragSelectedColumns(List<WebElementFacade> columnsToBeSelected){
        this.columnsToBeSelected = columnsToBeSelected;
    }

    public static DragSelectedColumns named(List<WebElementFacade> columnsToBeSelected) {
        return Instrumented.instanceOf(DragSelectedColumns.class).withProperties(columnsToBeSelected);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        columnsToBeSelected.forEach(column->{
            actor.attemptsTo(DragAndDrop.from(column).to(SELECTED_COLUMN_FIELD.resolveFor(actor)));
        });
    }
}
