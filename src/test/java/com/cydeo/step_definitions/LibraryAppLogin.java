package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LibraryAppLogin {

    @Given("user is on log in page")
    public void user_is_on_log_in_page() {
        System.out.println("user is on log in page");
    }

    @When("{string} enter valid username, valid password and click login")
    public void enter_valid_username_valid_password_and_click_login(String user) {
        System.out.println("{string} enter valid username, valid password and click login");
    }

    @Then("{string} should login successfully")
    public void should_login_successfully(String user) {
        System.out.println("{string} should login successfully");
    }

    @Then("Homepage should be displayed")
    public void homepage_should_be_displayed() {
        System.out.println("Homepage should be displayed");
    }

}
