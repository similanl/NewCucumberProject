package com.cydeo.test.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Set;

//    TC : Create utility method
//1. Create a new class called BrowserUtils
public class BrowserUtils {

    //2. Create a method to make Multiple Windows logic re-usable
    // 3. When method is called, it should switch window and verify title.
    //    Method info:
//• Name: switchWindowAndVerify
//• Return type: void
//• Arg1: WebDriver
//• Arg2: String expectedInUrl
//• Arg3: String expectedTitle

    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle){

        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String eachWindow : allWindowHandles){

            if(driver.switchTo().window(eachWindow).getCurrentUrl().contains(expectedInUrl)){
                break;
            }

        }

        String actualTitle = expectedTitle;
        Assert.assertTrue(actualTitle.contains(expectedTitle), "Title verification failed!");

    }

    public static void verifyTitle(WebDriver driver, String expectedTitle){

        Assert.assertEquals(driver.getTitle(),expectedTitle,"Verify title failed!");


    }

    public static void verifyTextEqual(WebElement element, String expectedText){

        Assert.assertEquals(element.getText(),expectedText,"Verify text failed");

    }


    public static void waitForInvisibilityOf(WebElement element){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(element));

    }



}
