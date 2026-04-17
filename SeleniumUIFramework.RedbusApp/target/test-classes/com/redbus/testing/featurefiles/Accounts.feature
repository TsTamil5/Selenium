Feature:Login Feature 

Background:
    Given user is on RedBus homepage
    Given user clicks on Accounts

Scenario: Login to Redbus
   
    And user clicks on Login button
    And user enters mobile number
    And user clicks on captcha checkbox
    And user clicks on Continue button
    And user clicks on Verify button
    And user handles security popup

Scenario: User updates profile from Accounts section

  And user clicks on Bookings
  Then user should see bookings page
  When user clicks on Profile
  And user clicks on Edit Profile
  And user updates profile details
  And user clicks on Save button
  Then user profile should be updated successfully

Scenario: User navigates to Offers page

  Given user is on RedBus homepage
  When user clicks on Offers
  Then user should see offers page
  
  
Scenario: User navigates to Help and validates Bus FAQ

    And user clicks on Help
    And user clicks on Bus FAQ
    And user selects a query
    Then user should see the answer for the selected query
    
Scenario: User reschedules ticket using ticket number

    When user clicks on Reschedule Ticket
    And user enters ticket number
    And user enters mobile number for ticket
    And user clicks on Search button
    Then user should be navigated to reschedule ticket page
    

Scenario: User searches ticket and navigates to RedBuddy chat and FAQ

    
    When user clicks on Search Ticket
    And user enters ticket number
    And user enters mobile number for ticket
    And user clicks on Submit button
    And user clicks on Chat with RedBuddy
    And user clicks on Bus FAQ
    And user selects a query
    Then user should see the FAQ answer page
  
Scenario: User logs out successfully

    And user clicks on Logout
    Then user should be logged out successfully

