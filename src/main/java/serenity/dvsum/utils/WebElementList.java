package serenity.dvsum.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WebElementList {

    public static <T extends Actor> List<WebElementFacade> fromString(String string, T asActor) {
        String[] arrayOfString = string.split(", ");
        List<String> listOfString = Arrays.asList(arrayOfString);
        String xpathString = "//ul[@id='avaiableColumns']//div[normalize-space()='%s']";


        List<WebElementFacade> listOfWebElement = new ArrayList<>();
        listOfString.forEach(item->{
            Target targetFromXpathString = Target.the("Column")
                    .locatedBy(String.format(xpathString, item));
            listOfWebElement.add(targetFromXpathString.resolveFor(asActor));
        });


        return listOfWebElement;
    }
}
