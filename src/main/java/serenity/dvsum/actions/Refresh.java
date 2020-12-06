package serenity.dvsum.actions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static serenity.dvsum.components.editviewform.EditViewForm.DATABASE_TYPE_DROPDOWN;

public class Refresh implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().navigate().refresh();
    }

    public static Refresh thePage(){
        return new Refresh();
    }

}
