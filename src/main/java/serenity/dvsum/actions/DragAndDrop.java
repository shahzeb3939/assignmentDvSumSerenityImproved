package serenity.dvsum.actions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.interactions.Actions;

import java.nio.file.attribute.FileTime;

public class DragAndDrop implements Interaction {

    private Target source;
    private Target target;

    public DragAndDrop(Target source){
        this.source = source;
    }

    public static DragAndDrop from(Target source) {
        return Instrumented.instanceOf(DragAndDrop.class).withProperties(source);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions action = new Actions(BrowseTheWeb.as(actor).getDriver());
        action.dragAndDrop(source.resolveFor(actor), target.resolveFor(actor)).build().perform();
    }

    public DragAndDrop to(Target target) {
        this.target = target;
        return this;
    }
}
