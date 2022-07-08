package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLogin_StepDefs {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    @Given("User is on web table login page")
    public void user_is_on_web_table_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));
    }

    @When("User enters username {string}")
    public void user_enters_username(String username) {
        webTableLoginPage.sendUserName(username);
    }

    @When("User enters password {string}")
    public void user_enters_password(String password)  {
        webTableLoginPage.sendPassword(password);
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
       webTableLoginPage.clickLoginBtn();
    }

    @Then("User should see url contains word orders")
    public void user_should_see_url_contains_word_orders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
    }

    @When("User enters username {string} and password {string} and clicks login")
    public void user_enters_username_and_password_and_clicks_login(String username, String password) {
        webTableLoginPage.login(username,password);

    }

    @When("User enters below credentials")
    public void user_enters_below_credentials(Map<String, String> credentials) {
        webTableLoginPage.login(credentials.get("username"),credentials.get("password"));
    }

}
