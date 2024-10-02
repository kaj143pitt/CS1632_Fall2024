package edu.pitt.cs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class DeathStarStepDefinitions {
    DeathStar deathStar;
    Planet planet;
    String message;

    @Given("a deathStar")
    public void setDeathStar() {
        deathStar = new DeathStar();
    }

    @Given("a planet with {int} hp")
    public void setPlanet(int n) {
        planet = new Planet(n);
    }

    @When("i shoot the planet with the laser")
    public void shoot() {
        message = deathStar.shoot(planet);
    }

    @Then("deathStar's shoot method returns \"([^\"]*)\"$")
    public void verifyShoot(String ret) {
        assertEquals(ret, message);
    }

    @Then("planet's getHitPoints method returns {int}")
    public void verifyHP(int hp) {
        assertEquals(hp, planet.getHitPoints());
    }
}
