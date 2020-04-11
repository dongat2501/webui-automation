package vn.amabuy.steps.serenity;

import net.thucydides.core.annotations.Step;
import vn.amabuy.pages.RegisterPage;

import static org.junit.Assert.*;

public class RegisterSteps {

    RegisterPage onRegisterPage;

    @Step
    public void register_new_account(String fullName, String companyName, String email, String password) {
        enter_full_name(fullName);
        enter_company_name(companyName);
        enter_email_address(email);
        enter_password(password);
        click_on_register_button();
    }


    @Step
    public void enter_password(String password) {
        onRegisterPage.enterTextIntoPasswordField(password);
    }
    @Step
    public void enter_email_address(String email) {
        onRegisterPage.enterTextIntoEmailField(email);
    }
    @Step
    public void enter_full_name(String fullName) {
        onRegisterPage.enterTextIntoFullName(fullName);
    }
    @Step
    public void enter_company_name(String companyName) {
        onRegisterPage.enterTextIntoCompanyName(companyName);
    }

    @Step
    public void click_on_register_button() {
        onRegisterPage.clickOnRegisterButton();
    }

   @Step
   public void should_see_error_message(String expectedErrMsg) {
       assertEquals(expectedErrMsg, onRegisterPage.getWarningErrMsg());
   }

   @Step
   public void should_see_error_messageEmail(String expectedEmail) {
       assertEquals(expectedEmail, onRegisterPage.getWarningErrMsgEmail());
   }

   @Step
   public void should_see_error_messagePwd(String expectedErrPwd) {
       assertEquals(expectedErrPwd, onRegisterPage.getWarningErrMsgPwd());
   }
}
