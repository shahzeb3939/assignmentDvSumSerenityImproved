package serenity.dvsum.components.columndictionary;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ViewDropdown {
    public static final Target DROPDOWN = Target.the("Dropdown to select view")
            .locatedBy("#selectedView");

    public static Target targetNamed(String viewName) {
        String targetString = "//li[contains(@class,'userView')][normalize-space()='%s']";
        String formattedTargetString = String.format(targetString, viewName);
        return Target.the("View named #viewName").locatedBy(formattedTargetString);
    }
}
