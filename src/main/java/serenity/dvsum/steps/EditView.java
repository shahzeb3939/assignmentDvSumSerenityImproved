package serenity.dvsum.steps;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import java.util.List;
import java.util.Map;

public class EditView {

    public static Performable with(List<Map<String, String>> viewData) {
        return Task.where("{0} edits the view",
                SelectViewFromDropdown.named(viewData.get(0).get("viewName")),
                SelectViewSetting.editView()
        );
    }
}
