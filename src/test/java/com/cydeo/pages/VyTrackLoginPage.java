package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class VyTrackLoginPage {

    public VyTrackLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void loginVyTrack(String UserRole){
        UserRole = UserRole.toLowerCase();
        //vytrack.driver.username
        String username = "vytrack."+UserRole+".username";
        String password = "vytrack."+UserRole+".password";
        usernameInputBox.sendKeys(ConfigurationReader.getProperty(username));
        passwordInputBox.sendKeys(ConfigurationReader.getProperty(password)+ Keys.ENTER);

    }

    @FindBy(id = "prependedInput")
    private WebElement usernameInputBox;

    @FindBy (id="prependedInput2")
    private WebElement passwordInputBox;











}
