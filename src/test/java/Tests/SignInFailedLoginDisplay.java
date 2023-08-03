package Tests;

import Pages.SignInPage;
import Utils.Driver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInFailedLoginDisplay extends TestBase{


    @Test(groups = {"smoke"})
    public void SignInFailedLoginDisplay(){
        SignInPage signInPage = new SignInPage();

        signInPage.loginIncorrectEmailPassword();

        String expectedText = "Login Failed";
        String pageSourceCode = Driver.getDriver().getPageSource();

        Assert.assertTrue(pageSourceCode.contains(expectedText));
    }


}
