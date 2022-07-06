package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingCucumber_StepDef {

    @Given("John is hungry")
    public void john_is_hungry() {
        System.out.println("John is hungry");
    }
    @When("he eats cucumbers")
    public void he_eats_cucumbers() {
        System.out.println("he eats cucumbers");
    }
    @Then("he will be full")
    public void he_will_be_full() {
        System.out.println("he will be full");
    }

    @Given("{string} is hungry")
    public void is_hungry(String personName) {
        System.out.println(personName+" is hungry");
    }
    @When("he eats {int} cucumbers")
    public void he_eats_cucumbers(Integer amountOfCucumber) {
        System.out.println("he eats "+  amountOfCucumber+ " cucumbers");
    }


    @Then("{string} will be full")
    public void willBeFull(String personName) {
        System.out.println(personName+" will be full");
    }


}
