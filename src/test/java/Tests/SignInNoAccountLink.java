package Tests;

import Pages.SignInPage;
import Utils.ConfigReader;
import Utils.Driver;
import Utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInNoAccountLink extends TestBase{

@Test(groups = {"smoke"})
    public void noAccountSignUpLink(){
        SignInPage signInPage = new SignInPage();

        String expectedText = "Don't have an account?";
        String pageSourceCode = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSourceCode.contains(expectedText));

        signInPage.getSignUpButton().click();

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), ConfigReader.getProperty("registerPageUrl"));
    SeleniumUtils.waitForTitleContains("Register", 3);
    }



}
