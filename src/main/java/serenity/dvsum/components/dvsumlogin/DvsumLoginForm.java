package serenity.dvsum.components.dvsumlogin;

import net.serenitybdd.screenplay.targets.Target;

public class DvsumLoginForm {

    public static final String EMAIL = "testautomation@dvsum.com";
    public static final String PASSWORD = "1@Qwerty";

    public static final Target DVSUM_EMAIL_FIELD = Target.the("Email field in DvSum Login Form")
            .locatedBy("#emailAddress");
    public static final Target DVSUM_PASSWORD_FIELD = Target.the("Password field in DvSum Login Form")
            .locatedBy("#password");
}
