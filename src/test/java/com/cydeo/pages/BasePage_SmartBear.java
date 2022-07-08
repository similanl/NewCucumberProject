package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage_SmartBear {

    public BasePage_SmartBear() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@href='Default.aspx' and .='View all orders']")
    private WebElement viewAllOrdersBtn;

    public void clickViewAllOrders() {
        viewAllOrdersBtn.click();
    }

    @FindBy(linkText = "View all products")
    private WebElement viewAllProductsBtn;

    public void cickViewAllProducts() {
       viewAllProductsBtn.click();
    }

    @FindBy(linkText = "Order")
    private WebElement orderBtn;

    public void clickOrderBtn() {
        orderBtn.click();
    }


}
