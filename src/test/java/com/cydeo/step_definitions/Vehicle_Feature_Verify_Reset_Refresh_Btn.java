package com.cydeo.step_definitions;

import com.cydeo.pages.VyTrackLoginPage;
import com.cydeo.pages.VyTrack_FeetMD_VehicleFeature_Page;
import com.cydeo.pages.VyTrack_HomePage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.configuration.ConfigurationUtils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vehicle_Feature_Verify_Reset_Refresh_Btn {

    VyTrackLoginPage vyTrackLoginPage = new VyTrackLoginPage();
    VyTrack_HomePage vyTrackHomePage = new VyTrack_HomePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    Actions actions = new Actions(Driver.getDriver());

    VyTrack_FeetMD_VehicleFeature_Page feetMD_VehicleFeature = new VyTrack_FeetMD_VehicleFeature_Page();

    @Given("I am logged in on VyTrack, Fleet Module and Vehicle funtionality")
    public void i_am_logged_in_on_vy_track_fleet_module_and_vehicle_funtionality() {

        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.login.url"));
        new VyTrackLoginPage().loginVyTrack("driver");

        wait.until(ExpectedConditions.visibilityOf(vyTrackHomePage.getFleetModuleBtn()));

        vyTrackHomePage.hoverOverToEachModuleAndFeature("fleet","vehicles");


    }
    @Then("I should be able to see Refresh button on the left side of Reset Button")
    public void i_should_be_able_to_see_refresh_button_on_the_left_side_of_reset_button() {

        Assert.assertTrue("Verify Refresh btn is on the left side of Reset btn failed!",feetMD_VehicleFeature.checkIfBtnAIsOnTheLeftOfBtnB("Refresh","Reset"));

    }

    @Then("I should be able to see and click Grid Setting button and see Grid Settings text Displayed")
    public void i_should_be_able_to_see_and_click_grid_setting_button_and_see_grid_settings_text_displayed() {
        feetMD_VehicleFeature.clickGridSettingBtn();
        wait.until(ExpectedConditions.visibilityOf(feetMD_VehicleFeature.getGridSettingBtnElm()));

        Assert.assertTrue("Verify text displayed on top of Grid Setting pop up failed",feetMD_VehicleFeature.getTextOnTopOfGridSetting().equals("Grid Settings"));

    }

}
