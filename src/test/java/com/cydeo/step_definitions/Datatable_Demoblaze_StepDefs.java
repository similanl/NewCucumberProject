package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage_DemoBlazePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class Datatable_Demoblaze_StepDefs {

    BasePage_DemoBlazePage blazePage = new BasePage_DemoBlazePage();
    @Given("User is on the HomePage")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("demoblaze.url"));
    }

    @Then("User should be able to see expected prices in following products")
    public void user_should_be_able_to_see_expected_prices_in_following_products(List<Map<String,String>> productDetails) {

        for(Map<String,String> listOfProducts: productDetails){

            blazePage.clickCategory(listOfProducts.get("Category"));
            blazePage.clickProduct(listOfProducts.get("Product"));


        }

    }


    @Then("User should be able to see expected prices in following products with listOflist")
    public void userShouldBeAbleToSeeExpectedPricesInFollowingProductsWithListOflist() {

    }
}
