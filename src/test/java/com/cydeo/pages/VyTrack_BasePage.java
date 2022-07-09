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

    @FindBy(xpath = "//span[contains(text(),'Fleet')]/parent::a")
    private WebElement fleetModuleBtn;

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
            actions.moveToElement(fleetModuleBtn);
            switch (featureName) {
                case "vehicles":
                case "vehicle odometer":
                case "vehicle cost":
                case "vehicle contract":
                case "vehicle fuel logs":
                case "vehicle services logs":
                case "vehicle model":


            }

        } else if (moduleName.equalsIgnoreCase("customers")) {


        } else if (moduleName.equalsIgnoreCase("activities")) {


        } else if (moduleName.equalsIgnoreCase("system")) {


        }


        switch (moduleName) {

            case "fleet":
            case "fleets":
                actions.moveToElement(fleetModuleBtn);
                break;
            case "customer":
            case "customers":
                actions.moveToElement(customersModuleBtn);
                break;
            case "activities":
            case "activitie":
                actions.moveToElement(activitiesModuleBtn);
                break;
            case "systems":
            case "system":
                actions.moveToElement(systemsModuleBtn);
                break;


        }

    }


}
