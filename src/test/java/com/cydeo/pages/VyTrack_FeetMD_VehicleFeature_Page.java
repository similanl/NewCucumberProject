package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrack_FeetMD_VehicleFeature_Page {

    public VyTrack_FeetMD_VehicleFeature_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public boolean checkIfBtnAIsOnTheLeftOfBtnB(String buttonA, String buttonB) {

        String xpath = "//a[@title='" + buttonB + "']//preceding-sibling::a[@title='" + buttonA + "']";

        WebElement elm = Driver.getDriver().findElement(By.xpath(xpath));
        return elm.isDisplayed();

    }

    @FindBy(xpath = "//a[@title='Grid Settings']")
    private WebElement gridSettingBtn;

    public void clickGridSettingBtn(){
        gridSettingBtn.click();
    }

    @FindBy(xpath = "//div[@class='column-manager-title' and text()='Grid Settings']")
    private WebElement gridSettingTextDisplayedOnTop;

    public String getTextOnTopOfGridSetting(){
        return gridSettingTextDisplayedOnTop.getText();
    }
    public WebElement getGridSettingBtnElm(){
        return gridSettingTextDisplayedOnTop;
    }


}
