package Tests;

import Pages.SignInPage;
import Utils.ConfigReader;
import Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInInputFields extends TestBase{

@Test(groups = {"smoke"})
    public void inputFieldsDisplayed(){

        SignInPage signInPage = new SignInPage();

        signInPage.getEmailField();
        signInPage.getPassword();

        Assert.assertTrue(signInPage.getEmailField().isDisplayed());
        Assert.assertTrue(signInPage.getPassword().isDisplayed());

    }


}
