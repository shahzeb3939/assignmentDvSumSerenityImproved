package serenity.dvsum.steps;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class EditView {

    public static Performable named(String viewName) {
        return Task.where("{0} edits a view named #viewName"
//                ,
//                Edit.openViewNamed(viewName).
//                setViewNameToBe("editedViewName").
//                selectColumns().save()
        );
    }
}
