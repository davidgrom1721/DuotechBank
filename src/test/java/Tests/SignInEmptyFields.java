package Tests;

import Pages.SignInPage;
import Utils.ConfigReader;
import Utils.Driver;
import Utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInEmptyFields extends TestBase{



    @Test(groups = {"smoke"})
    public void emptyLoginFieldsClickSignIn(){
        SignInPage signInPage = new SignInPage();
        signInPage.getSignInButton().click();
        Assert.assertNotEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("dashboardUrl"));
        SeleniumUtils.waitForTitleContains("Login", 3);
    }


}
