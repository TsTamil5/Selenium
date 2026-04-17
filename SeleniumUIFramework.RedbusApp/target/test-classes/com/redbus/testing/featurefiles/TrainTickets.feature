Feature: Train Ticket Booking on RedBus

  Background:
    Given user launches the browser
    And user navigates to RedBus website
    When user clicks on train tickets option

  Scenario: Search train tickets with valid details
    And user enters source from test data
    And user enters destination from test data
    And user selects journey date
    And user clicks on search button
    Then train results should be displayed