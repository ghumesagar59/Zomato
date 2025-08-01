Feature: Zomato Registration

  Scenario: User registers on Zomato with valid details
    Given User is on Zomato registration page
    When User enters valid Name, Email and click on create account
    And User Verify the otp
    Then User should be successfully registered