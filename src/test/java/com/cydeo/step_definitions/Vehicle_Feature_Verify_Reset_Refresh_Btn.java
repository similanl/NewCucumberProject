package com.cydeo.step_definitions;

import com.cydeo.pages.VyTrackLoginPage;
import com.cydeo.pages.VyTrack_HomePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.configuration.ConfigurationUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Vehicle_Feature_Verify_Reset_Refresh_Btn {

    VyTrackLoginPage vyTrackLoginPage = new VyTrackLoginPage();
    VyTrack_HomePage vyTrackHomePage = new VyTrack_HomePage();
    @Given("I am logged in on VyTrack, Fleet Module and Vehicel funtionality")
    public void i_am_logged_in_on_vy_track_fleet_module_and_vehicel_funtionality() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.login.url"));
        new VyTrackLoginPage().loginVyTrack("driver");



    }
    @Then("I should be able to see Refresh button on the left side of Reset Button")
    public void i_should_be_able_to_see_refresh_button_on_the_left_side_of_reset_button() {

        for (WebElement each: vyTrackHomePage.listOfFilterRefreshResetBtns){
            System.out.println(each.getLocation());
        }

    }
}
