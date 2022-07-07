package com.cydeo.step_definitions;

import com.cydeo.pages.ViewAllOrderPage;
import com.cydeo.pages.WebTableOrderPageWebTableOrder;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class WebTableOrder_StepDef {

    WebTableOrderPageWebTableOrder webTableOrderPage = new WebTableOrderPageWebTableOrder();
    ViewAllOrderPage viewAllOrderPage = new ViewAllOrderPage();
    Select select;

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));
        webTableOrderPage.login("Test", "Tester");


    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String productType) {
        webTableOrderPage.order.click();
        select = new Select(webTableOrderPage.productSelect);
        select.selectByValue(productType);

    }

    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer productQuantity) {
        webTableOrderPage.quantityInput.clear();
        webTableOrderPage.quantityInput.sendKeys(productQuantity + "");
    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String name) {
        webTableOrderPage.nameInput.sendKeys(name);
    }

    @When("user enters street {string}")
    public void user_enters_street(String street) {
        webTableOrderPage.streetInput.sendKeys(street);
    }

    @When("user enters city {string}")
    public void user_enters_city(String city) {
        webTableOrderPage.cityInput.sendKeys(city);
    }

    @When("user enters state {string}")
    public void user_enters_state(String state) {
        webTableOrderPage.stateInput.sendKeys(state);
    }

    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zipcode) {
        webTableOrderPage.zipInput.sendKeys(zipcode);
    }

    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String creditCardType) {
        BrowserUtils.clickRadioButton(webTableOrderPage.cardType,creditCardType);
    }

    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String creditcardNumber) {
        webTableOrderPage.cardnoInput.sendKeys(creditcardNumber);
    }

    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String expireDate) {
        webTableOrderPage.cardexpInput.sendKeys(expireDate);
    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
        webTableOrderPage.processBtn.click();
    }

    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedFirstRowCustomerName) {
        String actualFirstRowCustomerNmae = viewAllOrderPage.firstCustomerOnList.getText();
        Assert.assertTrue("Verify name faild",actualFirstRowCustomerNmae.equals(expectedFirstRowCustomerName));
    }


}
