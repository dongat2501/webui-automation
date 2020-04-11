package vn.amabuy.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class HomePage extends PageObject {

    @FindBy(xpath = "/html/body/app-root/app-home/div/div[2]/section[1]/div[2]/div/div[1]/div/div/div/div/button[2]")
    WebElementFacade loginLink;


    public void clickOnLoginLink() {
        loginLink.click();
    }

}
