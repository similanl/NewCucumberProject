package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage_DemoBlazePage {

public BasePage_DemoBlazePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}


    @FindBy(linkText = "Phones")
    private WebElement phonesBtn;

    @FindBy(linkText = "Laptops")
    private WebElement laptopsBtn;

    @FindBy(linkText = "Monitors")
    private WebElement monitorsBtn;

    public void clickCategory(String productTypes){
        productTypes = productTypes.toLowerCase();

        switch (productTypes){
            case "samsung galaxy s6":

                break;
            case "nokia lumia 1520":

                break;
            case "nexus 6":

                break;
            case "sony vaio i5":

                break;
            case "sony vaio i7":

                break;
            case "macbook air":

                break;
            case "apple monitor 24":

                break;
            case "asus full hd":

                break;

        }

    }

    public void clickProduct(String productCategory){
        productCategory = productCategory.toLowerCase();

        switch (productCategory){
            case "phones":
                phonesBtn.click();
                break;
            case "laptops":
                laptopsBtn.click();
                break;
            case "monitors":
                monitorsBtn.click();
                break;
        }
    }

    @FindBy(xpath = "//a[contains(text(), 'Home')]")
    public WebElement navLink;

    @FindBy(xpath = "//a[text()='Contact']")
    public WebElement modalLink;

    @FindBy(xpath = "//a[text()='About us']")
    public WebElement modalLink2;

    @FindBy(xpath = "//*[@id='cartur']")
    public WebElement carturLink;

    @FindBy(xpath = "//*[@id='login2']")
    public WebElement modalLink3;

    @FindBy(xpath = "//*[@id='signin2']")
    public WebElement modalLink4;



}
