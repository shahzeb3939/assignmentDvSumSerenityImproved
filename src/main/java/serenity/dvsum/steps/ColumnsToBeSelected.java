package serenity.dvsum.steps;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import serenity.dvsum.utils.WebElementList;

import java.util.List;

import static serenity.dvsum.components.editviewform.EditViewForm.DESELECT_ALL_COLUMNS;

public class ColumnsToBeSelected implements Task {

    private String columnsToBeSelected;

    public ColumnsToBeSelected(String columnsToBeSelected){
        this.columnsToBeSelected = columnsToBeSelected;
    }

    public static ColumnsToBeSelected specifiedBy(String columnsToBeSelected) {
        return Instrumented.instanceOf(ColumnsToBeSelected.class).withProperties(columnsToBeSelected);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DESELECT_ALL_COLUMNS));
        List<WebElementFacade> webElementListColumnsToBeSelected = WebElementList.fromString(columnsToBeSelected, actor);
        actor.attemptsTo(DragSelectedColumns.named(webElementListColumnsToBeSelected));
    }
}
