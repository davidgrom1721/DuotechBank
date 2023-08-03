package Tests;

import Pages.MortgageApplicationPage;
import Pages.SignInPage;
import Utils.ConfigReader;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MortgageEmploymentAndIncomeTest extends TestBase{


    @Test
    public void validApplicationToPage4(){

        SignInPage signInPage = new SignInPage();
        MortgageApplicationPage mortgageApplicationPage = new MortgageApplicationPage();

        validApplicationPage1();


        mortgageApplicationPage.getCoborrowerCheckboxNo().isSelected();

        mortgageApplicationPage.personalInfoFillOut("James", "S", "Smith");

        Select select = new Select(mortgageApplicationPage.getBorrowerSuffixDropdown());
        select.selectByVisibleText("III");

        ConfigReader.getProperty("email");
        mortgageApplicationPage.getBorrowerDob().sendKeys("12/01/1989");
        mortgageApplicationPage.getBorrowerSsn().sendKeys("123-12-1234");

        Select select2 = new Select(mortgageApplicationPage.getBorrowerMaritalStatusDropDown());
        select2.selectByVisibleText("Married");

        mortgageApplicationPage.getBorrowerCellPhoneNumber().sendKeys("703-123-1234");
        mortgageApplicationPage.getBorrowerHomePhoneNumber().sendKeys("202-123-4321");
        Assert.assertTrue(mortgageApplicationPage.getPrivacyPolicyCheckBox().isSelected());

        mortgageApplicationPage.getNextButton().click();

        mortgageApplicationPage.getRentCheckbox().isSelected();
        mortgageApplicationPage.getMonthlyRentalPaymentField().sendKeys("2500");
        mortgageApplicationPage.getNextButton().click();


    }

    private void validApplicationPage1() {
    }





}
