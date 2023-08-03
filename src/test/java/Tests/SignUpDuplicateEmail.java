package Tests;

import Pages.SignInPage;
import Pages.SignUpPage;
import Utils.Driver;
import Utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpDuplicateEmail extends TestBase{


    @Test(groups = {"smoke"})
    public void SignUpExistingEmailAccount(){
        SignUpPage signUpPage = new SignUpPage();

        signUpPage.getSignUpButton().click();

        Driver.getDriver().findElement(By.id("email")).sendKeys("asdasdasd@gmail.com", Keys.TAB);

        Assert.assertTrue(Driver.getDriver().findElement(By.id("emailerror")).isDisplayed());
    }


}
