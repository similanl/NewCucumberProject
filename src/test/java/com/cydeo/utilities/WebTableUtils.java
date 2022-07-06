package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WebTableUtils {

    //This method should accept a costumerName and return the costumer order date
    //as a String.
    public static String returnOrderDate(WebDriver driver, String costumerName){

        return driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tbody//tr//td[.='"+costumerName+"']//following-sibling::td[3]")).getText();

    }


    //This method should accept above-mentioned arguments and internally assert
    //expectedOrderDate matching actualOrderDate.
    public static void orderVerify(WebDriver driver, String customerName, String expectedOrderDate){

        Assert.assertEquals("Verify order failed!",WebTableUtils.returnOrderDate(driver,customerName),expectedOrderDate);

    }


}
