package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearPage;
import com.cydeo.pages.ViewAllOrderPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SmartBearLogin_StepDefs {

    SmartBearPage smartBearPage = new SmartBearPage();


    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("smartbear.url"));
        smartBearPage.loginSmartBear();
        smartBearPage.clickOrderBtn();
    }

    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String productChosenFromDD) {
        smartBearPage.selectProduct(productChosenFromDD);
    }

    @When("User enters {string} to quantity")
    public void user_enters_to_quantity(String quantityOfProduct) {
        smartBearPage.quantityInput.clear();
        smartBearPage.quantityInput.sendKeys(quantityOfProduct);
    }

    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String customerName) {
        smartBearPage.customerName.sendKeys(customerName);
    }

    @When("User enters {string} to street")
    public void user_enters_to_street(String street) {
        smartBearPage.street.sendKeys(street);
    }

    @When("User enters {string} to city")
    public void user_enters_to_city(String city) {
       smartBearPage.city.sendKeys(city);
    }

    @When("User enters {string} to state")
    public void user_enters_to_state(String state) {
        smartBearPage.state.sendKeys(state);
    }

    @When("User enters {string} to zipcode")
    public void user_enters_to_zipcode(String zipcode) {
        smartBearPage.zipcode.sendKeys(zipcode);
    }

    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String cardType) {
        smartBearPage.chooseCreditCard(cardType);
    }

    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String creditCardNum) {
        smartBearPage.creditCardNumInput.sendKeys(creditCardNum);
    }

    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String creditCardExpDate) {
       smartBearPage.expirationDate.sendKeys(creditCardExpDate);
    }

    @When("User clicks process button")
    public void user_clicks_process_button() {
        smartBearPage.processBtn.click();
    }

    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String customerName) {
        smartBearPage.clickViewAllOrders();
        Assert.assertTrue(new ViewAllOrderPage().firstCustomerOnList.getText().equals(customerName));

    }


}
