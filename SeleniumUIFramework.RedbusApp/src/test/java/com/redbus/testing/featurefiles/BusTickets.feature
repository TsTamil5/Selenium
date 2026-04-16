Feature: Bus Ticket End-to-End Flow

  Scenario: Search buses
    Given User is on the RedBus home page
    When User enters source "Chennai"
    And User enters destination "Bangalore"
    And User selects travel date
    And User clicks on search button
    Then User should see list of available buses


  Scenario: Select bus and route
    Given User has completed search flow from "Chennai" to "Bangalore"
    When User selects FlixBus and route
    Then User should see bus details page


  Scenario: Select seat and proceed
    Given User has completed bus selection flow from "Chennai" to "Bangalore"
    When User selects an available seat
    And User clicks on proceed button
    Then Seat should be selected successfully


  Scenario: Select boarding and dropping points
    Given User has completed seat selection flow from "Chennai" to "Bangalore"
    When User selects boarding point
    And User selects dropping point
    Then Boarding and dropping points should be confirmed


  Scenario: Enter passenger details
    Given User has completed boarding and dropping flow from "Chennai" to "Bangalore"
    When User enters valid passenger details
    Then Passenger details should be accepted


  Scenario: Verify payment options
    Given User has completed passenger details flow from "Chennai" to "Bangalore"
    When User proceeds to payment page
    Then User should see payment options