package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void login(String username, String password){
        usernameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password + Keys.ENTER);

    }
    public void sendUserName(String userName){
        usernameInputBox.sendKeys(userName);
    }
    public void sendPassword(String password){
        passwordInputBox.sendKeys(password);
    }

    public void clickLoginBtn(){
        loginBtn.click();
    }

    //login page
    @FindBy(name = "username")
    private WebElement usernameInputBox;

    @FindBy (name = "password")
    private WebElement passwordInputBox;

    @FindBy (css = ".btn.btn-primary.login__submit")
    private WebElement loginBtn;


}
