package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SmartBearPage extends BasePage_SmartBear{
    public SmartBearPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void loginSmartBear(){
        usernameInput.sendKeys(ConfigurationReader.getProperty("smartbear.username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("smartbear.password"));
        loginBtn.click();
    }

    @FindBy(id = "ctl00_MainContent_username")
    private WebElement usernameInput;

    @FindBy(id = "ctl00_MainContent_password")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@type=\"submit\"]")
    private WebElement loginBtn;



    @FindBy(linkText = "Order")
    public WebElement orderTab;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement product;

    public void selectProduct(String productNameValue) {
        Select select = new Select(product);
        select.selectByValue(productNameValue);
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains(productNameValue));
    }


    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantityInput;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipcode;

    public void chooseCreditCard(String cardType) {
        WebElement cardTypeBtn = Driver.getDriver().findElement(By.xpath("//input[@value='"+ cardType + "']"));
        cardTypeBtn.click();

    }

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement creditCardNumInput;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expirationDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processBtn;
    @FindBy(tagName = "strong")
    public WebElement orderConfirmationMsg;
    @FindBy(linkText = "View all orders")
    public WebElement viewAllOrdersTab;
    @FindBy(xpath = "//table[@id=\"ctl00_MainContent_orderGrid\"]//tr[2]//td[2]")
    public WebElement nameInOrdersList;



}
