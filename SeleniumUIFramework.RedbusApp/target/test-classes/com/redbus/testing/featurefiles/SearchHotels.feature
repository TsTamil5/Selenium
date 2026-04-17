Feature: Hotels Feature

Background:
Given Open the Browser
And Navigate to RedBus Application "https://www.redbus.in/"


Scenario: Navigate to the Hotels page and validate user can successfully reach the Hotels page
When Click on Hotels tab
Then Verify Hotels page is displayed


Scenario Outline: Click a hotel from Flash Deals section and validate hotel details page
When Click on Hotels tab
And Click hotel card from Flash Deals section by index "<Index>"
Then Verify hotel details page is displayed

Examples:
| Index |
| 0     |
| 1     |
| 2     |


Scenario: Search hotels with valid data from excel
When Click on Hotels tab
And Enter city name from excel sheet "HotelsData" row 1
And Select check-in date from excel sheet "HotelsData" row 1
And Select check-out date from excel sheet "HotelsData" row 1
And Click on rooms and guests field
And Select rooms count from excel sheet "HotelsData" row 1
And Select adults count from excel sheet "HotelsData" row 1
And Click on Search button
Then Verify hotel results page is displayed


Scenario: Search hotels with children added without age using excel
When Click on Hotels tab
And Enter city name from excel sheet "HotelsData" row 2
And Select check-in date from excel sheet "HotelsData" row 2
And Select check-out date from excel sheet "HotelsData" row 2
And Click on rooms and guests field
And Select rooms count from excel sheet "HotelsData" row 2
And Select adults count from excel sheet "HotelsData" row 2
And Add children count from excel sheet "HotelsData" row 2
And Click on Search button
Then Verify child age selection validation message is displayed


Scenario: Search hotels with children and child age using excel
When Click on Hotels tab
And Enter city name from excel sheet "HotelsData" row 3
And Select check-in date from excel sheet "HotelsData" row 3
And Select check-out date from excel sheet "HotelsData" row 3
And Click on rooms and guests field
And Select rooms count from excel sheet "HotelsData" row 3
And Select adults count from excel sheet "HotelsData" row 3
And Add children count from excel sheet "HotelsData" row 3
And Select child age from excel sheet "HotelsData" row 3
And Click on Search button
Then Verify hotel results page is displayed


Scenario Outline: Apply filters and verify Clear Filter is enabled
When Click on Hotels tab
And Enter city name from excel sheet "HotelsData" row 4
And Select check-in date from excel sheet "HotelsData" row 4
And Select check-out date from excel sheet "HotelsData" row 4
And Click on rooms and guests field
And Select rooms count from excel sheet "HotelsData" row 4
And Select adults count from excel sheet "HotelsData" row 4
And Click on Search button
And Apply hotel filter "<FilterName>"
Then Verify Clear Filter button is enabled
And Verify filtered hotel results page is displayed

Examples:
| FilterName       |
| Free Breakfast   |
| Excellent        |
| 5 Star           |
| Wi-Fi            |


Scenario Outline: Verify system shows message when no hotels match selected filters
When Click on Hotels tab
And Enter city name from excel sheet "HotelsData" row 5
And Select check-in date from excel sheet "HotelsData" row 5
And Select check-out date from excel sheet "HotelsData" row 5
And Click on rooms and guests field
And Select rooms count from excel sheet "HotelsData" row 5
And Select adults count from excel sheet "HotelsData" row 5
And Click on Search button
And Apply unavailable hotel filter "<FilterName>"
Then Verify no hotels found message is displayed
And Verify no hotel cards are displayed

Examples:
| FilterName                |
| 5 Star under low budget   |
| Jacuzzi + Hostel          |