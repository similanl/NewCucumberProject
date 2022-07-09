package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrack_BasePage {

    public VyTrack_BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebElement getFleetModuleBtn(){
        return fleetModuleBtn;
    }

    @FindBy(xpath = "//span[contains(text(),'Fleet')]/parent::a")
    private WebElement fleetModuleBtn;

    @FindBy(xpath = "(//ul[@class='dropdown-menu dropdown-menu-level-1 menu menu-level-1'])[1]//li[@class='dropdown-menu-single-item first']")
    private WebElement vehicleFeature;


    @FindBy(xpath = "(//ul[@class='dropdown-menu dropdown-menu-level-1 menu menu-level-1'])[1]//li[@class='dropdown-menu-single-item first']")
    private WebElement vehicleOdometerFeature;

    @FindBy(xpath = "//span[contains(text(),'Customers')]/parent::a")
    private WebElement customersModuleBtn;

    @FindBy(xpath = "//span[contains(text(),'Activities')]/parent::a")
    private WebElement activitiesModuleBtn;

    @FindBy(xpath = "//span[contains(text(),'System')]/parent::a")
    private WebElement systemsModuleBtn;

    public void hoverOverToEachModuleAndFeature(String moduleName, String featureName) {
//        moduleName = moduleName.toLowerCase();
        featureName = featureName.toLowerCase();
        Actions actions = new Actions(Driver.getDriver());


        if (moduleName.equalsIgnoreCase("fleet")) {
            actions.moveToElement(fleetModuleBtn).perform();

            switch (featureName) {
                case "vehicles":
                    vehicleFeature.click();
                    break;
                case "vehicle odometer":

                case "vehicle cost":
                case "vehicle contract":
                case "vehicle fuel logs":
                case "vehicle services logs":
                case "vehicle model":


            }

        } else if (moduleName.equalsIgnoreCase("customers")) {
            actions.moveToElement(customersModuleBtn).perform();
            switch (featureName) {
                case "accounts":
                case "contacts":


            }


        } else if (moduleName.equalsIgnoreCase("activities")) {
            actions.moveToElement(activitiesModuleBtn).perform();
            switch (featureName){
                case "calender events":
            }


        } else if (moduleName.equalsIgnoreCase("system")) {
            actions.moveToElement(systemsModuleBtn).perform();


        }


    }


}
