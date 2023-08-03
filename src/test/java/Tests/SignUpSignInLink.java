package Tests;

import Pages.SignUpPage;
import Utils.ConfigReader;
import Utils.Driver;
import Utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpSignInLink extends TestBase{


    @Test(groups = {"smoke"})
    public void SignUpAlreadyHaveAccountDisplay(){
        SignUpPage signUpPage = new SignUpPage();
        signUpPage.getSignUpButton().click();

        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Already have an account?"));

        Driver.getDriver().findElement(By.linkText("Sign in")).click();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("url"));
        SeleniumUtils.waitForTitleContains("Login", 3);
    }


}
