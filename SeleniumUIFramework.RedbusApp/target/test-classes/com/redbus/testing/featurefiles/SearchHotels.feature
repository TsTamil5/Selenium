Feature: Hotels Feature

Background:
Given Open the Browser
And Navigate to RedBus Application "https://www.redbus.in/"


Scenario: Navigate to the Hotels page and validate user can successfully reach the Hotels page
When Click on Hotels tab
Then Verify Hotels page is displayed


Scenario: Click a hotel from Flash Deals section and validate hotel details page
When Click on Hotels tab
And Click any hotel from Flash Deals section
Then Verify hotel details page is displayed


Scenario: Search hotels with city, dynamic check-in date, dynamic check-out date, rooms and adults
When Click on Hotels tab
And Enter city name "Chennai"
And Select check-in date after "3" days
And Select check-out date after "5" days
And Click on rooms and guests field
And Select rooms count "1"
And Select adults count "2"
And Click on Search button
Then Verify hotel results page is displayed


Scenario: Search hotels with children added without age
When Click on Hotels tab
And Enter city name "Chennai"
And Select check-in date after "3" days
And Select check-out date after "5" days
And Click on rooms and guests field
And Select rooms count "1"
And Select adults count "2"
And Add children count "1"
And Click on Search button
Then Verify child age selection validation message is displayed


Scenario: Search hotels with children and child age
When Click on Hotels tab
And Enter city name "Chennai"
And Select check-in date after "3" days
And Select check-out date after "5" days
And Click on rooms and guests field
And Select rooms count "1"
And Select adults count "2"
And Add children count "1"
And Select child age "5 years"
And Click on Search button
Then Verify hotel results page is displayed


Scenario: Apply filters and verify Clear Filter is enabled
When Click on Hotels tab
And Enter city name "Chennai"
And Select check-in date after "3" days
And Select check-out date after "5" days
And Click on rooms and guests field
And Select rooms count "1"
And Select adults count "2"
And Click on Search button
And Apply hotel filter "Free Breakfast"
Then Verify Clear Filter button is enabled
And Verify filtered hotel results page is displayed


Scenario: Verify system shows message when no hotels match selected filters
When Click on Hotels tab
And Enter city name "Chennai"
And Select check-in date after "3" days
And Select check-out date after "5" days
And Click on rooms and guests field
And Select rooms count "1"
And Select adults count "2"
And Click on Search button
And Apply unavailable hotel filter "5 Star under low budget"
Then Verify no hotels found message is displayed
And Verify no hotel cards are displayed