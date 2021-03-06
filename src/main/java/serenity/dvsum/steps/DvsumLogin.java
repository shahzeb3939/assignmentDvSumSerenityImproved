package serenity.dvsum.steps;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static org.openqa.selenium.Keys.ENTER;
import static serenity.dvsum.components.dvsumlogin.DvsumLoginForm.DVSUM_EMAIL_FIELD;
import static serenity.dvsum.components.dvsumlogin.DvsumLoginForm.DVSUM_PASSWORD_FIELD;

public class DvsumLogin {

    public static Task enterCredentialsAndLogin(String email, String password) {
        return Task.where("{0} enters username and password in Dvsum Login Form and press Login",
                Enter.theValue(email).into(DVSUM_EMAIL_FIELD).then(
                        Enter.theValue(password).into(DVSUM_PASSWORD_FIELD).
                                thenHit(ENTER)));
    }
}
