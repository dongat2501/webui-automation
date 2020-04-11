package vn.amabuy.pages;


import net.serenitybdd.core.pages.PageObject;


public class RegisterPage extends PageObject {


    public static final String ID_FULL_NAME = "/html/body/app-root/app-sign-up/div/div/div[2]/form/div[1]/input";
    public static final String ID_COMPANY_NAME = "/html/body/app-root/app-sign-up/div/div/div[2]/form/div[2]/input";
    public static final String ID_EMAIL = "/html/body/app-root/app-sign-up/div/div/div[2]/form/div[3]/input";
    public static final String PASSWORD = "/html/body/app-root/app-sign-up/div/div/div[2]/form/div[4]/input";
    public static final String ALERT_NAME = "/html/body/app-root/app-sign-up/div/div/div[2]/form/div[1]/p";
    public static final String ALERT_EMAIL = "/html/body/app-root/app-sign-up/div/div/div[2]/form/div[3]/p";
    public static final String ALERT_PWD = "/html/body/app-root/app-sign-up/div/div/div[2]/form/div[4]/p";
//    public String getWarningErrMsg = $(ALERT).getText();


    public void enterTextIntoFullName(String fullName) {
        $(ID_FULL_NAME).type(fullName);
    }

    public void enterTextIntoCompanyName(String companyName) {
        $(ID_COMPANY_NAME).type(companyName);
    }

    public void enterTextIntoEmailField(String emailAddress) {
        $(ID_EMAIL).type(emailAddress);
    }

    public void enterTextIntoPasswordField(String passwordField) {
        $(PASSWORD).type(passwordField);
    }

    /**
     * @return
     */
    
    public String getWarningErrMsg() {
        return $(ALERT_NAME).getText();
    }

    public String getWarningErrMsgEmail() {
        return $(ALERT_EMAIL).getText();
    }

    public String getWarningErrMsgPwd() {
        return $(ALERT_PWD).getText();
    }

    public void clickOnRegisterButton() {
        $("/html/body/app-root/app-sign-up/div/div/div[2]/form/div[5]/button").click();
    }
}
