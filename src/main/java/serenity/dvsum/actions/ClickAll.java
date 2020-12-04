package serenity.dvsum.actions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class ClickAll implements Interaction {

    private Target target;

    public ClickAll(Target target) {
        this.target = target;
    }

    public static ClickAll locatedByTargetNamed(Target target) {
        return Instrumented.instanceOf(ClickAll.class).withProperties(target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> webElementFacadeList = target.resolveAllFor(actor);
        webElementFacadeList.forEach((webElement)->{
            actor.attemptsTo(Click.on(webElement));
        });
    }
}
