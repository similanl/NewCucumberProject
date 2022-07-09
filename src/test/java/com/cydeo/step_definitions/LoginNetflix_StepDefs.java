package com.cydeo.step_definitions;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginNetflix_StepDefs {


    @Given("a student is on NetFlix log in page")
    public void a_student_is_on_net_flix_log_in_page() {
        Driver.getDriver().get("https://www.netflix.com/login");
//        Driver.getDriver().findElement(By.linkText("Sign In"));
    }
    @When("a student enter valid username and valid password and click login")
    public void a_student_enter_valid_username_and_valid_password_and_click_login() {
    //similanl@hotmail.comsimilanl@hotmail.com
        //bangkokisthecapitalcityofthailand
         Driver.getDriver().findElement(By.id("id_userLoginId")).sendKeys("similanl@hotmail.com");
        Driver.getDriver().findElement(By.id("id_password")).sendKeys("bangkokisthecapitalcityofthailand" + Keys.ENTER);

    }
    @Then("a student should be able to see the homepage")
    public void a_student_should_be_able_to_see_the_homepage() {

//        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
//        wait.until(ExpectedConditions.alertIsPresent());
//        Alert alert = Driver.getDriver().switchTo().alert();
//        wait.until(ExpectedConditions.alertIsPresent());
//        alert.accept();
//        System.out.println(alert.getText());
//
//        String eactualTextHome = Driver.getDriver().findElement(By.cssSelector(".profile-gate-label")).getText();
//
//    String expectedText = "Who's watching?";
//        Assert.assertEquals("Verify text home failed",eactualTextHome,expectedText);

    }

}
