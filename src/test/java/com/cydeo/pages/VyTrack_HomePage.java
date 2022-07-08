package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class VyTrack_HomePage {

    public VyTrack_HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (css = ".nav-multilevel.main-menu>li>a")
    public List<WebElement> modulesNameDisplayed;


}
