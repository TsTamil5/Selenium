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
    
    Scenario: Search trains without entering mandatory fields
    When the user clicks on "Search Trains" without entering details
    Then the system should display an error message

      Scenario: Validate same source and destination
    When the user enters source as "Chennai"
    And the user enters destination as "Chennai"
    And the user selects a journey date
    And the user clicks on "Search Trains"
    Then the system should display "Source and destination cannot be the same"
    
    Scenario: Select a future journey date
    When the user opens the calendar
    And selects a future date
    Then the selected date should be displayed in the date field
    
    Scenario: Select a past journey date
    When the user opens the calendar
    And selects a past date
    Then the system should not allow selection or show an error message

  Scenario: View train details
    Given the user has searched for trains with valid details
    When the user clicks on "View Route" for a train
    Then the system should display the train route details

  Scenario: Select a train from results
    Given the user has searched for trains
    When the user selects a train from the list
    Then the system should navigate to the seat selection page

  Scenario: Book ticket successfully
    Given the user has selected a train
    When the user enters passenger details
    And the user proceeds to payment
    Then the ticket should be booked successfully