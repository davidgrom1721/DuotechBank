package Tests;

import Utils.ConfigReader;
import Utils.Driver;
import Utils.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WelcomeMessage extends TestBase{



@Test(groups = {"smoke"})
public void welcomeMessageDisplayed(){
        String expectedText = "Welcome Back!";
        String pageSourceCode = Driver.getDriver().getPageSource();

        Assert.assertTrue(pageSourceCode.contains(expectedText));
        SeleniumUtils.waitForTitleContains("Login", 3);
}



}
