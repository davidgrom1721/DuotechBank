package Pages;

import Utils.ConfigReader;
import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {


    public SignUpPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "inputfirstname4")
    private WebElement firstNameSignUp;
    @FindBy(id = "inputlastname4")
    private WebElement lastNameSignUp;
    @FindBy(id = "email")
    private WebElement emailSignUp;
    @FindBy(id = "exampleInputPassword1")
    private WebElement passwordSignUp;
    @FindBy(xpath = "//a[@href='register.php']")
    private WebElement signUpButton;
    @FindBy(id = "register")
    private WebElement clickSignUpButton;



    public WebElement getFirstNameSignUp() {
        return firstNameSignUp;
    }
    public WebElement getLastNameSignUp() {
        return lastNameSignUp;
    }
    public WebElement getEmailSignUp() {
        return emailSignUp;
    }
    public WebElement getPasswordSignUp() {
        return passwordSignUp;
    }
    public WebElement getSignUpButton() {
        return signUpButton;
    }
    public WebElement getClickSignUpButton() {return clickSignUpButton;}


    public void signUpWithValidCredentials(){
        signUp(ConfigReader.getProperty("firstName"), ConfigReader.getProperty("lastName"), ConfigReader.getProperty("email"), ConfigReader.getProperty("password"));
    }
    public void signUpWithCustomFirstName(String firstName){
        signUp(firstName, "Bravo", "johnnybravo777@gmail.com", "Password123");
    }
    public void signUpWithCustomLastName(String lastName){
        signUp("Johnny", lastName, "johnnybravo777@gmail.com", "Password123");
    }
    public void signUpWithCustomEmail(String email){
        signUp("Johnny", "Bravo", email, "Password123");
    }
    public void signUpWithCustomPassword(String password){
        signUp("Johnny", "Bravo", "johnnybravo777@gmail.com", password);
    }
    public void existingAccountJamesFranco(){
        signUp("James", "Franco", "jamesdfranco@gmail.com", "Password123");
    }


    public void signUp(String firstName, String lastName, String email, String password){
        firstNameSignUp.sendKeys(firstName);
        lastNameSignUp.sendKeys(lastName);
        emailSignUp.sendKeys(email);
        passwordSignUp.sendKeys(password);
    }







}
