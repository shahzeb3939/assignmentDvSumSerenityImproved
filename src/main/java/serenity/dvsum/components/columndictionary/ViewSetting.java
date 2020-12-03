package serenity.dvsum.components.columndictionary;

import net.serenitybdd.screenplay.targets.Target;

public class ViewSetting {
    public static final Target VIEW_SETTING_BUTTON = Target.the("View setting button")
            .locatedBy("//button[@data-toggle='dropdown']");
    public static final Target EDIT_VIEW_BUTTON = Target.the("Edit view button")
            .locatedBy("#editViewBtn");
}
