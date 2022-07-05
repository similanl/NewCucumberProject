package com.cydeo.test.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ClickAndVerifyRadioButton {
    public static void main(String[] args) {

        //        Create a utility method to handle above logic.
//        Method name: clickAndVerifyRadioButton
//        Return type: void or boolean
//        Method args:
//        1. WebDriver
//        2. Name attribute as String (for providing which group of radio buttons)
//        3. Id attribute as String (for providing which radio button to be clicked)
//
//        Method should loop through the given group of radio buttons. When it finds the
//        matching option, it should click and verify option is Selected.
//                Print out verification: true

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/radio_buttons");

        System.out.println(clickAndVerifyRadioButton(driver, "name", "sport"));


    }
    public static boolean clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idAttribute){

        ////input[@name='sport']
        String locator1 = "//input[@" + nameAttribute + "='" +idAttribute + "']";

        List<WebElement> radioBtns = driver.findElements(By.xpath(locator1));

        for (WebElement each : radioBtns){
            each.click();
            return each.isSelected()? true: false;
        }


return true;
    }
}
