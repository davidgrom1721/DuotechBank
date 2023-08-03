package Tests;

import Pages.SignInPage;
import Pages.SignUpPage;
import Utils.ConfigReader;
import Utils.Driver;
import Utils.SeleniumUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends TestBase{


    @Test(groups = {"smoke"})
    public void positiveSignUp(){
        SignUpPage signUpPage = new SignUpPage();

        signUpPage.getSignUpButton().click();
        signUpPage.signUpWithValidCredentials();
        signUpPage.getClickSignUpButton().click();
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Registration Successful"));
        SeleniumUtils.waitForTitleContains("Login", 3);
    }


    @Test(groups = {"smoke"})
    public void negativeSignUpNumbersFirstName() throws InterruptedException {
        SignUpPage signUpPage = new SignUpPage();

        signUpPage.getSignUpButton().click();
        signUpPage.signUpWithCustomFirstName("1234567");
        signUpPage.getClickSignUpButton().click();
        Assert.assertFalse(Driver.getDriver().getPageSource().contains("Registration Successful"));
    }
    @Test(groups = {"smoke"})
    public void negativeSignUpLongFirstName(){
        SignUpPage signUpPage = new SignUpPage();

        signUpPage.getSignUpButton().click();
        signUpPage.signUpWithCustomFirstName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        signUpPage.getClickSignUpButton().click();
        Assert.assertFalse(Driver.getDriver().getPageSource().contains("Registration Successful"));
    }

    @Test(groups = {"smoke"})
    public void negativeSignNumbersLastName(){
        SignUpPage signUpPage = new SignUpPage();

        signUpPage.getSignUpButton().click();
        signUpPage.signUpWithCustomLastName("12345678");
        signUpPage.getClickSignUpButton().click();
        Assert.assertFalse(Driver.getDriver().getPageSource().contains("Registration Successful"));
    }
    @Test(groups = {"smoke"})
    public void negativeSignLongLastName(){
        SignUpPage signUpPage = new SignUpPage();

        signUpPage.getSignUpButton().click();
        signUpPage.signUpWithCustomLastName("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        signUpPage.getClickSignUpButton().click();
        Assert.assertFalse(Driver.getDriver().getPageSource().contains("Registration Successful"));
    }



    @Test(groups = {"smoke"})
    public void negativeSignUpCustomEmail(){
        SignUpPage signUpPage = new SignUpPage();

        signUpPage.getSignUpButton().click();
        signUpPage.signUpWithCustomEmail("123123gmail.com");
        signUpPage.getClickSignUpButton().click();
        Assert.assertFalse(Driver.getDriver().getPageSource().contains("Registration Successful"));
    }

    @Test(groups = {"smoke"})
    public void negativeSignUpInvalidPassword(){
        SignUpPage signUpPage = new SignUpPage();

        signUpPage.getSignUpButton().click();
        signUpPage.signUpWithCustomPassword("a1");
        signUpPage.getClickSignUpButton().click();
        Assert.assertFalse(Driver.getDriver().getPageSource().contains("Registration Successful"));
    }


}
