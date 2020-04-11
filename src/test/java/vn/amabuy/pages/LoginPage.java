package vn.amabuy.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


public class LoginPage extends PageObject {
    @FindBy(xpath = "/html/body/app-root/app-login/div/div/div[2]/form/div[4]/p/ins")
    WebElementFacade registerLink;

    public void clickOnRegisterLink() {
        registerLink.click();
    }

}