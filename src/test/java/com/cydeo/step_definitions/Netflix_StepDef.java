package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class Netflix_StepDef {

    @Given("I like {string}")
    public void i_like(String movieGenres) {
        System.out.println("I like {string}" +movieGenres);
    }

    @When("I go to home page")
    public void i_go_to_home_page() {
        System.out.println("I go to home page");
    }

    @Then("I should get right recommendation")
    public void i_should_get_right_recommendation() {
        System.out.println("I go to home page");
    }

    @Given("I like")
    public void i_like(List<String> listOfMovieGenres) {
        System.out.println(listOfMovieGenres);

    }

    @Given("I like below favorite movie with certain type")
    public void i_like_below_favorite_movie_with_certain_type(Map<String, String> favoriteMovieByGenre) {

        System.out.println(favoriteMovieByGenre);
        favoriteMovieByGenre.get("action");
    }


}
