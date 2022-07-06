package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calculator_StepDef {
    @Given("Calculator is open")
    public void calculator_is_open() {
        System.out.println("Calculator is open");
    }

    @When("I add {int} with {int}")
    public void i_add_with(Integer int1, Integer int2) {
        System.out.println("I add " + int1 + " with " + int2 );
    }

    @Then("I should get {int}")
    public void i_should_get(Integer int1) {
        System.out.println("I should get " + int1);
    }

}
