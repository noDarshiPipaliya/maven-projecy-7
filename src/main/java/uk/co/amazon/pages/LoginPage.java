package uk.co.amazon.pages;

import org.openqa.selenium.By;
import uk.co.amazon.utility.Utility;

public class LoginPage extends Utility {


//    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
//    By emailField = By.id("Email");
//    By passwordField = By.name("Password");
//    By loginButton = By.xpath("//button[contains(text(),'Log in')]");
  By errorMessage = By.xpath("1-24 of over 1,000 results for");
//
//
//    public String getWelcomeText(){
//        return getTextFromElement(welcomeText);
//    }
//
//    public void enterEmailId(String email){
//        sendTextToElement(emailField, email);
//    }
//
//    public void enterPassword(String password){
//        sendTextToElement(passwordField, password);
//    }
//
//    public void clickOnLoginButton(){
//        clickOnElement(loginButton);
//    }
//
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}
