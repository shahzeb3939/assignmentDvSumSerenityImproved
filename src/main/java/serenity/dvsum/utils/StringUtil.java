package serenity.dvsum.utils;

import net.serenitybdd.screenplay.targets.Target;

import java.util.Arrays;
import java.util.List;

public class StringUtil {
    public static List<String> stringToList(String string) {
        String[] arrayOfString = string.split(", ");
        List<String> listOfString = Arrays.asList(arrayOfString);
        return listOfString;
    }
}
