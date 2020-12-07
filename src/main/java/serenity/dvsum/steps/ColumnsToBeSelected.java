package serenity.dvsum.steps;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import serenity.dvsum.actions.DragAndDrop;
import serenity.dvsum.utils.StringUtil;

import java.util.List;

import static serenity.dvsum.components.columndictionary.ViewSetting.SOURCE_COLUMN;
import static serenity.dvsum.components.editviewform.EditViewForm.DESELECT_ALL_COLUMNS;
import static serenity.dvsum.components.editviewform.EditViewForm.TARGET_COLUMN;

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
        List<String> columnToBeSelectedStringList = StringUtil.stringToList(columnsToBeSelected);
        columnToBeSelectedStringList.forEach(givenColumn->{
            actor.attemptsTo(DragAndDrop.from(SOURCE_COLUMN.of(givenColumn)).to(TARGET_COLUMN));
        });
    }
}
