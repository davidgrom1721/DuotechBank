package Tests;

import Pages.SignInPage;
import Utils.ConfigReader;
import Utils.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInInvalidEmail extends TestBase{


    @Test(groups = {"smoke"})
    public void invalidEmailSignIn(){
        SignInPage signInPage = new SignInPage();
        signInPage.loginWithInvalidEmail();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("url"));

    }



}
