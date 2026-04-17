Feature: Food Search

  Background:
    Given user is on the food ordering page

  Scenario: Verify user can search for a restaurant and navigate to its page
    When user enters data "Aasife Biriyani" in the search field
    And user selects "Aasife Biriyani" from the suggestions
    Then user should be navigated to the restaurant page
    And restaurant name "Aasife Biriyani" should be displayed

  Scenario: Verify suggestions appear and contain relevant data while typing
    When user enters partial data "Aasife" in the search field
    Then suggestions should be displayed
    And suggestions should contain "Aasife Biriyani"
    
  Scenario: Verify restaurant list is displayed after selecting a popular food item
    When user clicks on "Pizza" from Popular Foods section
    Then user should be navigated to the restaurant listing page
    And restaurant list should be displayed
    
  Scenario: Verify restaurant list is displayed after selecting train details
    When user searches train number "12622"
    And user selects train "TAMILNADU EXP" from suggestions
    Then boarding station and date fields should be enabled
    When user selects valid boarding date
    And user selects valid boarding station
    And user clicks on Find Food button
    Then user is navigated to train restaurant results page
    And restaurant list should be visible