package Tests;

import Pages.SignInPage;
import Utils.ConfigReader;
import Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest extends TestBase{



    @Test(groups = {"smoke"})
    public void positiveLoginUsingPageObjectModel(){
        //    LoginPage loginPage = new LoginPage();
        new SignInPage().loginWithValidCredentials();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("dashboardUrl"));

    }

    @Test(groups = {"smoke"})
    public void negativeLoginInvalidEmail(){
        SignInPage signInPage = new SignInPage();
        signInPage.loginWithInvalidEmail();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("url"));
    }

    @Test(groups = {"smoke"})
    public void negativeLoginInvalidPassword(){
        SignInPage signInPage = new SignInPage();
        signInPage.loginWithInvalidPassword();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("url"));

    }

    @Test(groups = {"smoke"})
    public void negativeLoginNoPassword(){
        SignInPage signInPage = new SignInPage();
        signInPage.login(ConfigReader.getProperty("email"), "");
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("url"));
    }




}
