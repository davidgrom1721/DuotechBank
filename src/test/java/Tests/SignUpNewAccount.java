package Tests;

import Pages.SignUpPage;
import Utils.Driver;
import Utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpNewAccount extends TestBase{


    @Test(groups = {"smoke"})
    public void SignUpNewAccount(){
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.getSignUpButton().click();
        signUpPage.signUp("James", "Franco", "jamesd123ranco@gmail.com", "Password123");
        signUpPage.getClickSignUpButton().click();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Registration Successful"));
        SeleniumUtils.waitForTitleContains("Login", 3);
    }


}
