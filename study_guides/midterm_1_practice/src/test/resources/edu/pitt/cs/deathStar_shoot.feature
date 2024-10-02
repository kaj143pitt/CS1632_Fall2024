Feature: deathStar interface

Background:
    Given a deathStar
    Given a planet with 10 hp

Rule: if a planet is shot with greater than 100 hitpoints, it is a beefy planet
Rule: if a planet is shot with less than or equal to 100 hitpoints, it is a wimpy planet

Scenario: if I shoot the planet with the laser, the shoot method will return "Wimpy planet was hit by the superlaser!" and the planet will have -90 hp
    When i shoot the planet with the laser
    Then deathStar's shoot method returns "Wimpy planet was hit by the superlaser!"
    Then planet's getHitPoints method returns -90
