package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class VyTrack_HomePage extends VyTrack_BasePage{

    public VyTrack_HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = ".nav-multilevel.main-menu>li>a")
    public List<WebElement> modulesNameDisplayed;

    @FindBy(css = ".column-manager.dropdown")
    public WebElement gridSettingBtn;

    @FindBy(css = ".column-manager-title")
    public WebElement getGridSettingTextDisplayedElm;

    @FindBy(css = ".actions-panel.pull-right.form-horizontal>div>a")
    public List<WebElement> listOfFilterRefreshResetBtns;







}
