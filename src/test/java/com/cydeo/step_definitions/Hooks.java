package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup(Scenario scenario){


    }

   @After
    public void teardown(Scenario scenario) {

        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);// casting the driver to take screenshot and storing the screenshot in byte array.
            scenario.attach(screenshot, "image/png", scenario.getName()); // attaching to my scenario teh screenshot and defining, the screenshot, the location/extensionType, and the name which comes from the scenario name.
        }



        Driver.closeDriver();

    }




}
