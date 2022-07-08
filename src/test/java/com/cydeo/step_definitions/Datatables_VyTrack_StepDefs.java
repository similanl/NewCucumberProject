package com.cydeo.step_definitions;

import com.cydeo.pages.VyTrackLoginPage;
import com.cydeo.pages.VyTrack_HomePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

public class Datatables_VyTrack_StepDefs {

    VyTrackLoginPage vyTrackLoginPage = new VyTrackLoginPage();
    VyTrack_HomePage vyTrackHomePage = new VyTrack_HomePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    @Given("user logged in on the fleet management homepage with the {string} information")
    public void user_logged_in_on_the_fleet_management_homepage_with_the_information(String user) {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.login.url"));
        vyTrackLoginPage.loginVyTrack(user);
    }

    @Then("use should be able to see following modules")
    public void use_should_be_able_to_see_following_modules(List<String> modules) {

        wait.until(ExpectedConditions.visibilityOfAllElements(vyTrackHomePage.modulesNameDisplayed));

        Assert.assertEquals("Verify list of modules failed!",modules, BrowserUtils.convertListWebElmToListString(vyTrackHomePage.modulesNameDisplayed));

    }


}
