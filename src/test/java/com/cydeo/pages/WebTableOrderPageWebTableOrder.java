package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTableOrderPageWebTableOrder extends BasePage_WebTable_Order {

//    web.app.url=https://web-table-2.cydeo.com/login
//    web.app.username=Test
//    web.app.password=Tester


    public WebTableOrderPageWebTableOrder(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //order page
    @FindBy(name = "product")
    public WebElement productSelect;

    @FindBy(name = "quantity")
    public WebElement quantityInput;

    @FindBy(name = "name")
    public WebElement nameInput;

    @FindBy(name = "street")
    public WebElement streetInput;

    @FindBy(name = "city")
    public WebElement cityInput;

    @FindBy(name = "state")
    public WebElement stateInput;

    @FindBy(name = "zip")
    public WebElement zipInput;

   @FindBy (xpath = "//label[@class='radio']")
    public List<WebElement> cardType;

    @FindBy(name = "cardNo")
    public WebElement cardnoInput;

    @FindBy(name = "cardExp")
    public WebElement cardexpInput;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processBtn;






   
 

    
    


}
