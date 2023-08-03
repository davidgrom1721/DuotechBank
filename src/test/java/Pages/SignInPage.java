package Pages;

import Utils.ConfigReader;
import Utils.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {



    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(id = "exampleInputEmail1")
    private WebElement emailField;
    @FindBy(id = "exampleInputPassword1")
    private WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signInButton;
    @FindBy(xpath = "//a[@href='register.php']")
    private WebElement signUpButton;



    public WebElement getEmailField() {
        return emailField;
    }
    public WebElement getPassword() {
        return password;
    }
    public WebElement getSignInButton() {
        return signInButton;
    }
    public WebElement getSignUpButton() {return signUpButton;}


    public void loginWithValidCredentials(){
        login(ConfigReader.getProperty("email"), ConfigReader.getProperty("password"));
    }
    public void loginWithInvalidEmail(){
        login("invalidEmail", ConfigReader.getProperty("password"));
    }
    public void loginWithInvalidPassword(){
        login(ConfigReader.getProperty("email"), "invalidPassword");
    }

    public void loginWithInvalidCredentials(){
        login("Invalid","Invalid");
    }

    public void loginIncorrectEmailPassword(){
        login("incorrectEmail123@gmail.com", "incorrectPassword123");
    }

    public void loginWithEmptyCredentials(){
        login("", "");
    }

    public void login(String username, String password){
        emailField.sendKeys(username, Keys.TAB, password, Keys.ENTER);
    }



}
