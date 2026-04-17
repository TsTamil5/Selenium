Feature: Bus Ticket Booking End-to-End Flow

  Scenario: Search buses
    Given User is on the RedBus home page
    When User enters source "Chennai"
    And User enters destination "Bangalore"
    And User selects travel date
    And User clicks on search button
    Then User should see list of available buses
	
	Scenario: Select bus and seat
  Given User searches buses from "Chennai" to "Bangalore"
  When User selects FlixBus and route
  And User selects an available seat
  And User clicks on proceed button
  Then User should move to boarding and dropping page