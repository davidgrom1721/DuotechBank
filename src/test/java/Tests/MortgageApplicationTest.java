package Tests;

import Pages.MortgageApplicationPage;
import Pages.SignInPage;
import Utils.ConfigReader;
import Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MortgageApplicationTest extends TestBase{

@Test
    public void validApplicationPage1(){

        SignInPage signInPage = new SignInPage();
        MortgageApplicationPage mortgageApplicationPage = new MortgageApplicationPage();


        signInPage.loginWithValidCredentials();
        mortgageApplicationPage.getMortgageButton().click();

        mortgageApplicationPage.getRealtorCheckButtonYes();
        mortgageApplicationPage.getRealtorInformationField().sendKeys("John Doe, johndoe@gmail.com, 703-123-1234");

        mortgageApplicationPage.getLoanOfficerCheckButtonYes().click();
        new Select(Driver.getDriver().findElement(By.xpath("//select[@class='select2 form-control select2-hidden-accessible'][1]"))).selectByVisibleText("Purchase a Home");
        mortgageApplicationPage.getEstimatedPurchasePriceField().sendKeys("500000");
        mortgageApplicationPage.getDownPaymentAmountField().sendKeys("100000", Keys.TAB);
        mortgageApplicationPage.getDownPaymentPercentageField().sendKeys("20.00");

        new Select(Driver.getDriver().findElement(By.xpath("//select[@name='src_down_payment']"))).selectByVisibleText("Checking/Savings (most recent bank statement)");

        mortgageApplicationPage.getAdditionalFundsAvailableField().sendKeys("20000.00");
        mortgageApplicationPage.getNextButton().click();

    }


//    @Test
//    public void validApplicationPage2(){
//
//        SignInPage signInPage = new SignInPage();
//        MortgageApplicationPage mortgageApplicationPage = new MortgageApplicationPage();
//
//        validApplicationPage1();
//
//        mortgageApplicationPage.getCoborrowerCheckboxNo().isSelected();
//
//        mortgageApplicationPage.personalInfoFillOut("James", "S", "Smith");
//
//        Select select = new Select(mortgageApplicationPage.getBorrowerSuffixDropdown());
//        select.selectByVisibleText("III");
//
//        ConfigReader.getProperty("email");
//        mortgageApplicationPage.getBorrowerDob().sendKeys("12/01/1989");
//        mortgageApplicationPage.getBorrowerSsn().sendKeys("123-12-1234");
//
//        Select select2 = new Select(mortgageApplicationPage.getBorrowerMaritalStatusDropDown());
//        select2.selectByVisibleText("Married");
//
//        mortgageApplicationPage.getBorrowerCellPhoneNumber().sendKeys("703-123-1234");
//        mortgageApplicationPage.getBorrowerHomePhoneNumber().sendKeys("202-123-4321");
//        Assert.assertTrue(mortgageApplicationPage.getPrivacyPolicyCheckBox().isSelected());
//
//        mortgageApplicationPage.getNextButton().click();
//
//        mortgageApplicationPage.getRentCheckbox().isSelected();
//        mortgageApplicationPage.getMonthlyRentalPaymentField().sendKeys("2500");
//        mortgageApplicationPage.getNextButton().click();
//
//
//    }














@Test
    public void workingWithRealtorField(){

        SignInPage signInPage = new SignInPage();
        MortgageApplicationPage mortgageApplicationPage = new MortgageApplicationPage();


        signInPage.loginWithValidCredentials();
        mortgageApplicationPage.getMortgageButton().click();

        String expectedText = "Are you working with a realtor?";
        String pageSourceCode = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSourceCode.contains(expectedText));

        mortgageApplicationPage.isRealtorCheckBoxYesEnabled();
        mortgageApplicationPage.isRealtorCheckBoxNoEnabled();

    }


    @Test
    public void realtorInformationFieldEnabled(){
        SignInPage signInPage = new SignInPage();
        MortgageApplicationPage mortgageApplicationPage = new MortgageApplicationPage();

        signInPage.loginWithValidCredentials();
        mortgageApplicationPage.getMortgageButton().click();
        mortgageApplicationPage.getRealtorCheckButtonYes().click();

        boolean enabled = mortgageApplicationPage.getRealtorInformationField().isEnabled();
        Assert.assertTrue(enabled);

    }
    @Test
    public void realtorInformationFieldDisabled(){
        SignInPage signInPage = new SignInPage();
        MortgageApplicationPage mortgageApplicationPage = new MortgageApplicationPage();

        signInPage.loginWithValidCredentials();
        mortgageApplicationPage.getMortgageButton().click();

        mortgageApplicationPage.getRealtorCheckButtonNo().click();

        boolean enabled = mortgageApplicationPage.getRealtorInformationField().isEnabled();
        Assert.assertFalse(enabled);
    }




    @Test
    public void workingWithLoanOfficer(){

        SignInPage signInPage = new SignInPage();
        MortgageApplicationPage mortgageApplicationPage = new MortgageApplicationPage();


        signInPage.loginWithValidCredentials();
        mortgageApplicationPage.getMortgageButton().click();

        String expectedText = "Are you currently working with a loan officer?";
        String pageSourceCode = Driver.getDriver().getPageSource();
        Assert.assertTrue(pageSourceCode.contains(expectedText));

        mortgageApplicationPage.isLoanOfficerCheckBoxYesEnabled();
        mortgageApplicationPage.isLoanOfficerCheckBoxNoEnabled();

    }
@Test
    public void purposeOfLoanDropdown(){
        SignInPage signInPage = new SignInPage();
        MortgageApplicationPage mortgageApplicationPage = new MortgageApplicationPage();

        signInPage.loginWithValidCredentials();
        mortgageApplicationPage.getMortgageButton().click();


        Select select = new Select(mortgageApplicationPage.getPurposeOfLoanDropdown());


        if((mortgageApplicationPage.getPurposeOfLoanDropdown().isEnabled() && (mortgageApplicationPage.getPurposeOfLoanDropdown().isDisplayed()))) {
          System.out.println("Dropdown is enabled and visible");
        } else {
            System.out.println("Dropdown is not visible");
        }

        System.out.println(mortgageApplicationPage.getPurposeOfLoanDropdown().getText());

    }


    @Test
    public void purposeOfDownPaymentDropdown(){
        SignInPage signInPage = new SignInPage();
        MortgageApplicationPage mortgageApplicationPage = new MortgageApplicationPage();

        signInPage.loginWithValidCredentials();
        mortgageApplicationPage.getMortgageButton().click();


        Select select = new Select(mortgageApplicationPage.getSourceOfDownPaymentDropdown());


        if((mortgageApplicationPage.getSourceOfDownPaymentDropdown().isEnabled() && (mortgageApplicationPage.getSourceOfDownPaymentDropdown().isDisplayed()))) {
            System.out.println("Dropdown is enabled and visible");
        } else {
            System.out.println("Dropdown is not visible");
        }

        System.out.println(mortgageApplicationPage.getSourceOfDownPaymentDropdown().getText());

    }




    @Test
    public void clickNextWithEmptyFields(){

        SignInPage signInPage = new SignInPage();
        MortgageApplicationPage mortgageApplicationPage = new MortgageApplicationPage();


        signInPage.loginWithValidCredentials();
        mortgageApplicationPage.getMortgageButton().click();

        Assert.assertTrue(mortgageApplicationPage.getNextButton().isDisplayed());

        mortgageApplicationPage.getNextButton().click();

        String pageSourceCode = Driver.getDriver().getPageSource();
        Assert.assertFalse(pageSourceCode.contains("THIS FIELD IS REQUIRED."));

    }













}
