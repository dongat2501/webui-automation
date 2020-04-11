package vn.amabuy.features.register;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import vn.amabuy.steps.serenity.HomeSteps;
import vn.amabuy.steps.serenity.LoginSteps;
import vn.amabuy.steps.serenity.RegisterSteps;


@RunWith(SerenityRunner.class)
public class WhenRegisterNewAccount {
    @Managed
    WebDriver driver;

    @Steps
    HomeSteps ngatdo;
    @Steps
    LoginSteps loginSteps;



    @Steps
    RegisterSteps registerSteps;

    @Test
    public void launch_web_application() {
        String errMsg = "This field is required.";
        String errMsgEmail = "Email is invalid.";
        ngatdo.visit_application();
        ngatdo.click_on_login_link();
        loginSteps.click_on_register_link();
        // registerSteps.register_new_account("Ngat Do", "DHT Solution", "dongat2501@gmail.com", "1234567");
        registerSteps.register_new_account("", "", "", "");
        registerSteps.should_see_error_message(errMsg);
        registerSteps.should_see_error_messageEmail(errMsgEmail);
        registerSteps.should_see_error_messagePwd(errMsg);
    }
}
