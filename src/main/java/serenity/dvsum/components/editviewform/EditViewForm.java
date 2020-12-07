package serenity.dvsum.components.editviewform;

import net.serenitybdd.screenplay.targets.Target;

public class EditViewForm {
    public static final Target VIEW_NAME_FIELD = Target.the("View name field")
            .locatedBy("#viewName");
    public static final Target DATABASE_TYPE_DROPDOWN = Target.the("Database type")
            .locatedBy("#filterColumns");
    public static final Target DATABASE_FILTER_DROPDOWN = Target.the("Database filter")
            .locatedBy("#filterOperator");
    public static final Target DATABASE_NAME_FIELD = Target.the("Database name")
            .locatedBy("//div[@id='valueList_chosen']//input[contains(@class,'chosen-search-input')]");
    public static final Target CLEAR_DATABASE_NAME_FIELD = Target.the("Cross button for Database name field")
            .locatedBy("//a[@class='search-choice-close']");
    public static final Target VIEW_SAVE_BUTTON = Target.the("Save button in Edit View")
            .locatedBy("//button[contains(.,'Save')]");
    public static final Target DESELECT_ALL_COLUMNS = Target.the("Deselect all columns")
            .locatedBy("#dbox_de_select_all");
    public static final Target TARGET_COLUMN = Target.the("Empty select column field")
            .locatedBy("//ul[@id='selectedColumns']");
}
