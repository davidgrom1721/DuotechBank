package Pages;

import Utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MortgageApplicationPage {


    public MortgageApplicationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@href='mortgage.php']")
    private WebElement mortgageButton;
    @FindBy(xpath = "//label[@for='realtor1']")
    private WebElement realtorCheckButtonYes;
    @FindBy(xpath = "//label[@for='realtor2']")
    private WebElement realtorCheckButtonNo;
    @FindBy(xpath = "//a[@href='#next']")
    private WebElement nextButton;
    @FindBy(id = "realtorinfo")
    private WebElement realtorInformationField;
    @FindBy(xpath = "//label[@for='loanofficer1']")
    private WebElement loanOfficerCheckButtonYes;
    @FindBy(xpath = "//label[@for='loanofficer2']")
    private WebElement loanOfficerCheckButtonNo;
    @FindBy(xpath = "//select[@name='purpose_loan']")
    private WebElement purposeOfLoanDropdown;
    @FindBy(id = "estimatedprice")
    private WebElement estimatedPurchasePriceField;
    @FindBy(id = "downpayment")
    private WebElement downPaymentAmountField;
    @FindBy(id = "downpaymentpercentage")
    private WebElement downPaymentPercentageField;
    @FindBy(xpath = "//select[@name='src_down_payment']")
    private WebElement sourceOfDownPaymentDropdown;
    @FindBy(id = "additionalfunds")
    private WebElement additionalFundsAvailableField;


///////////////////////////////Page 2//////////////////////////////////////////////////////////////////////////

    @FindBy(id = "coborrower1")
    private WebElement coborrowerCheckboxYes;
    @FindBy(id = "coborrower2")
    private WebElement coborrowerCheckboxNo;
    @FindBy(id = "b_firstName")
    private WebElement borrowerFirstName;
    @FindBy(id = "b_middleName")
    private WebElement borrowerMiddleName;
    @FindBy(id = "b_lastName")
    private WebElement borrowerLastName;
    @FindBy(id = "b_suffix")
    private WebElement borrowerSuffixDropdown;
    @FindBy(id = "b_email")
    private WebElement borrowerEmail;
    @FindBy(id = "b_dob")
    private WebElement borrowerDob;
    @FindBy(id = "b_ssn")
    private WebElement borrowerSsn;
    @FindBy(id = "b_marital")
    private WebElement borrowerMaritalStatusDropDown;
    @FindBy(id = "b_cell")
    private WebElement borrowerCellPhoneNumber;
    @FindBy(id = "b_home")
    private WebElement borrowerHomePhoneNumber;
    @FindBy(id = "privacypolicy")
    private WebElement privacyPolicyCheckBox;

    ///////////////Co-Borrower/////////////////////////

    @FindBy(id = "c_firstName")
    private WebElement coborrowerFirstName;
    @FindBy(id = "c_middleName")
    private WebElement coborrowerMiddleName;
    @FindBy(id = "c_lastName")
    private WebElement coborrowerLastName;
    @FindBy(id = "c_suffix")
    private WebElement coborrowerSuffixDropdown;
    @FindBy(id = "c_email")
    private WebElement coborrowerEmail;
    @FindBy(id = "c_dob")
    private WebElement coborrowerDob;
    @FindBy(id = "c_ssn")
    private WebElement coborrowerSsn;
    @FindBy(id = "c_marital")
    private WebElement coborrowerMaritalStatusDropDown;
    @FindBy(id = "c_cell")
    private WebElement coborrowerCellPhoneNumber;
    @FindBy(id = "c_home")
    private WebElement coborrowerHomePhoneNumber;

    ////////////////Page 3////////////////////////////////

    @FindBy(id = "expense1")
    private WebElement RentCheckbox;
    @FindBy(id = "expense2")
    private WebElement ownCheckbox;
    @FindBy(id = "monthlyrentalpayment")
    private WebElement monthlyRentalPaymentField;












    public WebElement getMortgageButton() {
        return mortgageButton;
    }
    public WebElement getRealtorCheckButtonYes() {
        return realtorCheckButtonYes;
    }
    public WebElement getRealtorCheckButtonNo() {
        return realtorCheckButtonNo;
    }
    public WebElement getNextButton() {
        return nextButton;
    }
    public WebElement getRealtorInformationField() {
        return realtorInformationField;
    }
    public WebElement getLoanOfficerCheckButtonYes() {
        return loanOfficerCheckButtonYes;
    }
    public WebElement getLoanOfficerCheckButtonNo() {
        return loanOfficerCheckButtonNo;
    }
    public WebElement getPurposeOfLoanDropdown() {
        return purposeOfLoanDropdown;
    }
    public WebElement getEstimatedPurchasePriceField() {
        return estimatedPurchasePriceField;
    }
    public WebElement getDownPaymentAmountField() {
        return downPaymentAmountField;
    }
    public WebElement getDownPaymentPercentageField() {
        return downPaymentPercentageField;
    }
    public WebElement getSourceOfDownPaymentDropdown() {
        return sourceOfDownPaymentDropdown;
    }
    public WebElement getAdditionalFundsAvailableField() {
        return additionalFundsAvailableField;
    }




    public void isRealtorCheckBoxYesEnabled(){
        boolean isEnabled = getRealtorCheckButtonYes().isEnabled();
    }
    public void isRealtorCheckBoxNoEnabled(){
        boolean isEnabled = getRealtorCheckButtonNo().isEnabled();
    }

    public void isLoanOfficerCheckBoxYesEnabled(){
        boolean isEnabled = loanOfficerCheckButtonYes.isEnabled();
    }
    public void isLoanOfficerCheckBoxNoEnabled(){
        boolean isEnabled = loanOfficerCheckButtonNo.isEnabled();
    }


    public WebElement getCoborrowerCheckboxYes() {
        return coborrowerCheckboxYes;
    }
    public WebElement getCoborrowerCheckboxNo() {
        return coborrowerCheckboxNo;
    }
    public WebElement getBorrowerFirstName() {
        return borrowerFirstName;
    }
    public WebElement getBorrowerMiddleName() {
        return borrowerMiddleName;
    }
    public WebElement getBorrowerLastName() {
        return borrowerLastName;
    }
    public WebElement getBorrowerSuffixDropdown() {
        return borrowerSuffixDropdown;
    }
    public WebElement getBorrowerEmail() {
        return borrowerEmail;
    }
    public WebElement getBorrowerDob() {
        return borrowerDob;
    }
    public WebElement getBorrowerSsn() {
        return borrowerSsn;
    }
    public WebElement getBorrowerMaritalStatusDropDown() {
        return borrowerMaritalStatusDropDown;
    }
    public WebElement getBorrowerCellPhoneNumber() {
        return borrowerCellPhoneNumber;
    }
    public WebElement getBorrowerHomePhoneNumber() {
        return borrowerHomePhoneNumber;
    }
    public WebElement getPrivacyPolicyCheckBox() {
        return privacyPolicyCheckBox;
    }
    public WebElement getCoborrowerFirstName() {
        return coborrowerFirstName;
    }
    public WebElement getCoborrowerMiddleName() {
        return coborrowerMiddleName;
    }
    public WebElement getCoborrowerLastName() {
        return coborrowerLastName;
    }
    public WebElement getCoborrowerSuffixDropdown() {
        return coborrowerSuffixDropdown;
    }
    public WebElement getCoborrowerEmail() {
        return coborrowerEmail;
    }
    public WebElement getCoborrowerDob() {
        return coborrowerDob;
    }
    public WebElement getCoborrowerSsn() {
        return coborrowerSsn;
    }
    public WebElement getCoborrowerMaritalStatusDropDown() {
        return coborrowerMaritalStatusDropDown;
    }
    public WebElement getCoborrowerCellPhoneNumber() {
        return coborrowerCellPhoneNumber;
    }
    public WebElement getCoborrowerHomePhoneNumber() {
        return coborrowerHomePhoneNumber;
    }
    public WebElement getRentCheckbox() {
        return RentCheckbox;
    }
    public WebElement getOwnCheckbox() {
        return ownCheckbox;
    }
    public WebElement getMonthlyRentalPaymentField() {
        return monthlyRentalPaymentField;
    }





    public void personalInfoFillOut(String firstName, String middleName, String lastName){
        borrowerFirstName.sendKeys(firstName, Keys.TAB, middleName, Keys.TAB, lastName);
    }






}
