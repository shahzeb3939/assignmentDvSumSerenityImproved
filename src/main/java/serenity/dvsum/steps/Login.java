package serenity.dvsum.steps;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import serenity.dvsum.components.DvsumLoginForm;

public class Login {
    public static Performable withValidCredentials() {
        return Task.where("{0} logins by entering valid credentials",
                Open.browserOn().thePageNamed("home.page"),
                DvsumLogin.enterCredentials(
                        DvsumLoginForm.enterEmail(),
                        DvsumLoginForm.enterPassword()
                ));
    }
}