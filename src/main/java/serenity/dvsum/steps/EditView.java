package serenity.dvsum.steps;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.util.Map;

public class EditView {

    public static Performable with(Map<String, String> viewData) {
        return Task.where("{0} edits the view",
                SelectViewFromDropdown.named(viewData.get("viewName")),
                SelectViewSetting.editView(),
                SetNewViewName.named(viewData.get("newViewName")),
                SelectColumns.named(viewData.get("columnsToBeSelected")),
                SetDatabaseType.named(viewData.get("databaseType")),
                SetDatabaseFilter.named(viewData.get("databaseFilter")),
                SetDatabaseName.named(viewData.get("databaseName")),
                SaveChanges.madeToView()
        );
    }
}