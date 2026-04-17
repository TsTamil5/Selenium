Feature: RedBus Hotels Module Validation

  Scenario: Navigate to the Hotels page and validate user can successfully reach the Hotels page from homepage
    Given User launches the RedBus homepage
    Then Verify Hotels tab is visible
    When User clicks on the Hotels tab
    Then Verify user is redirected to the Hotels page
    And Verify page URL or title contains "Hotels"

  Scenario: Click a hotel from Flash Deals section and validate hotel details page navigation
    Given User is on the Hotels page
    Then Verify Flash Deals section is displayed
    And Verify hotel cards are listed in Flash Deals
    When User clicks on any hotel card from Flash Deals
    Then Verify hotel details popup or hotel details page is opened

  Scenario: Enter city, check-in date, check-out date, rooms, adults and search hotels
    Given User is on the Hotels page
    When User selects city as "Chennai"
    And User selects check-in date
    And User selects check-out date
    And User selects rooms count as "1"
    And User selects adults count as "2"
    And User clicks on Search button
    Then Verify hotels results page is displayed
    And Verify hotel listings are shown

  Scenario: Enter city, dates, rooms, adults, add children without age and search hotels
    Given User is on the Hotels page
    When User selects city as "Chennai"
    And User selects check-in date
    And User selects check-out date
    And User selects rooms count as "1"
    And User selects adults count as "2"
    And User adds children count as "1" without selecting age
    And User clicks on Search button
    Then Verify child age selection validation message is displayed

  Scenario: Enter city, dates, rooms, adults, add children with age and search hotels
    Given User is on the Hotels page
    When User selects city as "Chennai"
    And User selects check-in date
    And User selects check-out date
    And User selects rooms count as "1"
    And User selects adults count as "2"
    And User adds children count as "1"
    And User selects child age as "5 years"
    And User clicks on Search button
    Then Verify hotels results page is displayed successfully

  Scenario: Apply filters, find best hotels, and verify Clear Filter is enabled
    Given User searched hotels with valid city, dates, rooms, and adults
    When User applies hotel filters
    Then Verify Clear Filter button is enabled
    And Verify filtered hotel results page is displayed successfully

  #Scenario Outline: Verify system shows message when no hotels match selected filters
   # Given User searched hotels with valid city, dates, rooms, and adults
   # When User applies unavailable hotel filters "<FilterType>"
   # Then Verify no hotels found message is displayed
   # And Verify no hotel cards are displayed

      
      
      